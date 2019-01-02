/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:11:12 
 */
package com.crm.wcx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.UserMapper;
import com.crm.wcx.entity.User;
import com.crm.wcx.entity.UserExample;
import com.crm.wcx.entity.UserExample.Criteria;
import com.crm.wcx.service.ILoginService;

/** 
 * @ClassName: LoginServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:11:12  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class LoginServiceImpl implements ILoginService {

	@Autowired
	 private UserMapper userMapper;
	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILoginService#login(com.crm.wcx.entity.User)
	 */
	@Override
	public User login(User user) {
		//1. 实例化user的模板类
        UserExample userExample = new UserExample();
        //2. 创建查询准则
        Criteria criteria  = userExample.createCriteria();
        //3. 添加条件
        criteria.andAccountEqualTo(user.getAccount());
        criteria.andPasswordEqualTo(user.getPassword());
        //4. 进行模板查询
        List<User> users =  userMapper.selectByExample(userExample);
        //5. 根据查询的结果返回数据
        if(users.size() > 0){
            return users.get(0);
        }else {
            return null;
        }
	}
}
