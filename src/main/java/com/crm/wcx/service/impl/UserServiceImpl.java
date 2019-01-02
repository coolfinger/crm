/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:03:35 
 */
package com.crm.wcx.service.impl;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;












import com.crm.wcx.dao.RoleMapper;
import com.crm.wcx.dao.UserMapper;
import com.crm.wcx.entity.User;
import com.crm.wcx.entity.UserExample;
import com.crm.wcx.entity.UserExample.Criteria;
import com.crm.wcx.service.IUserService;
import com.crm.wcx.utils.Md5Util;
import com.crm.wcx.utils.RedisUtil;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

/** 
 * @ClassName: UserServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:03:35  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class UserServiceImpl implements IUserService {

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IUserService#findByAccount(java.lang.String)
	 */
	
	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserMapper userMapper;

	@Autowired
	private RoleMapper roleMapper;
	
	@Autowired
	private RedisUtil redisUtil;
	
	@Override
	public User findByAccount(String account) {
		//创建user的模板类
        UserExample userExample = new UserExample();
        Criteria criteria = userExample.createCriteria();
        //添加查询条件
        criteria.andAccountEqualTo(account);
        //进行模板查询
        List<User> users = userMapper.selectByExample(userExample);
        if(users.size() > 0){
            return users.get(0);
        }else {
            return null;
        }
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IUserService#save(com.crm.wcx.entity.User)
	 */
	@Override
	public boolean save(User user) {
		//对用户密码进行加密
		user = encryptPassword(user);
		//设置用户状态
		user.setStatus(0);
		//设置用户创建时间
		user.setCreateTime(LocalDateTime.now());
		
		if(userMapper.insert(user)>0){
			return true;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IUserService#deleteById(java.lang.Integer)
	 */
	@Override
	public boolean deleteById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(id)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IUserService#findById(java.lang.Integer)
	 */
	@Override
	public User findById(Integer id) {
		User user = null;
		try {
			user = userMapper.selectByPrimaryKey(id);
			user.setRole(roleMapper.selectByPrimaryKey(user.getRoleId()));
			user.setPassword(null);
			user.setSalt(null);
		} catch (Exception e) {
			e.printStackTrace();
			throw  new RuntimeException();
		}
		return user;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IUserService#findByExample(com.crm.wcx.entity.UserExample)
	 */
	@Override
	public List<User> findByExample(UserExample userExample) {
		
		List<User> users = null;
		try {
			//拿到user
			users = userMapper.selectByExample(userExample);
			//对user进行设置角色
			for(User user:users){
				user.setRole(roleMapper.selectByPrimaryKey(user.getRoleId()));
				user.setPassword(null);
				user.setSalt(null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return users;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IUserService#countByExample(com.crm.wcx.entity.UserExample)
	 */
	@Override
	public long countByExample(UserExample userExample) {
		// TODO Auto-generated method stub
		return userMapper.countByExample(userExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IUserService#edit(com.crm.wcx.entity.User)
	 */
	@Override
	public boolean edit(User user) {
		logger.info(user.toString());
		boolean success = false;
		//如果修改了用户的角色，需要删除相关的权限缓存
        //(PS:存在BUG的代码，有时redis工具的hasKey方法会报空指针异常，暂时没解决，所以用trycatch控制，让程序能继续运行，但是缓存会删除失败)
        try {
            if(user.getRoleId() != null && user.getRoleId() != 0) {
                if(user.getAccount() == null || "".equals(user.getAccount())) {
                    user.setAccount(userMapper.selectByPrimaryKey(user.getId()).getAccount());
                }
                logger.info("要修改的用户的账号为：" + user.getAccount());
                redisUtil.remove("rolePermission-"+user.getRoleId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //不允许修改用户账号名，因为用户名会设计到加密的盐值问题
        user.setAccount(null);
        try {
            //如果密码不为空，要对修改后的密码进行盐值加密
            if(user.getPassword() != null && user.getPassword().trim() != ""){
                user = encryptPassword(user);
            }else {
                user.setPassword(null);
            }
            if(userMapper.updateByPrimaryKeySelective(user) > 0){
                success = true;
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
        return success;
	}

	/* 加密密码
	 * @see com.crm.wcx.service.IUserService#encryptPassword(com.crm.wcx.entity.User)
	 */
	@Override
	public User encryptPassword(User user) {
		 //如果用户名为空，则要重新进行查询注入，因为加密需要用到相应的用户名
        if(user.getAccount() == null || "".equals(user.getAccount())){
            user.setAccount(userMapper.selectByPrimaryKey(user.getId()).getAccount());
        }
        //设置盐值（用户名 + 密码）
        String salt1 = user.getAccount();
        String salt2 = new SecureRandomNumberGenerator().nextBytes().toHex();
        user.setSalt(salt2);
        //使用Md5Util进行Md5盐值加密
        String encodedPassword = Md5Util.encrypt(user.getPassword(), salt1 + salt2);
        //设置加密后的用户密码
        user.setPassword(encodedPassword);
        return user;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IUserService#editPasswd(com.crm.wcx.entity.User, java.lang.String)
	 */
	@Override
	public Boolean editPasswd(User user, String oldPassword) {
		try {
            //先检验用户的密码是否正确
            //先根据ID获取整个用户的信息
            User selectUser = userMapper.selectByPrimaryKey(user.getId());
            //获取盐值
            String salt1 = selectUser.getAccount();
            String salt2 = selectUser.getSalt();
            //获取加密后的密码
            String encryptPasswd = selectUser.getPassword();
            
            //对原密码进行相同的加密
            String passwd = Md5Util.encrypt(oldPassword, salt1+salt2);
            
            //如果密码相同，则可以进行密码修改
            if(encryptPasswd.equals(passwd)) {
                user.setAccount(selectUser.getAccount());
                //对用户的盐值进行重新生成，并且对密码进行加密并重新注入
                user = encryptPassword(user);
                //修改成功，便返回结果
                if(userMapper.updateByPrimaryKeySelective(user) > 0) {
                    return true;
                }else {
                    return false;
                }
            }else {
                return false;
            } 
        } catch (Exception e) {
            return false;
        }  
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IUserService#findByEmail(java.lang.String)
	 */
	@Override
	public User findByEmail(String email) {
		//创建user的模板类
        UserExample userExample = new UserExample();
        Criteria criteria = userExample.createCriteria();
        //添加查询条件
        criteria.andEmailEqualTo(email);
        //进行模板查询
        List<User> users = userMapper.selectByExample(userExample);
        if(users.size() > 0){
            users.get(0).setPassword(null);
            users.get(0).setSalt(null);
            return users.get(0);
        }else {
            return null;
        }
	}

}
