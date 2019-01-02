package com.crm.wcx.service;

import java.util.List;

import com.crm.wcx.entity.User;
import com.crm.wcx.entity.UserExample;

/**
 * 
 * @ClassName: IUserService 
 * @Description: 用户接口
 * @author: ColdFingers
 * @date: 2018年11月8日 下午1:38:08
 */
public interface IUserService {
	
	/**
	 * 
	* @Title: findByAccount 
	* @Description: 根据用户名查找用户
	* @param account
	* @return User
	* @author ColdFingers
	* @date 2018年11月8日下午1:43:30
	 */
	public User findByAccount(String account);
	
	/**
	 * 
	* @Title: save 
	* @Description: 添加用户
	* @param user
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午1:52:53
	 */
	public boolean save(User user);
	
	/**
	 * 
	* @Title: deleteById 
	* @Description: 根据id删除用户
	* @param id
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午1:53:26
	 */
	public boolean deleteById(Integer id);
	
	/**
	 * 
	* @Title: findById 
	* @Description: 根据id查找用户
	* @param id
	* @return User
	* @author ColdFingers
	* @date 2018年11月8日下午1:53:46
	 */
	public User findById(Integer id);
	
	/**
	 * 
	* @Title: findByExample 
	* @Description: 根据模板查找用户
	* @param userExample
	* @return List<User>
	* @author ColdFingers
	* @date 2018年11月8日下午1:54:07
	 */
	public List<User> findByExample(UserExample userExample);
	
	/**
	 * 
	* @Title: countByExample 
	* @Description: 根据模板统计用户数量
	* @param userExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午1:54:55
	 */
	public long countByExample(UserExample userExample);
	
	/**
	 * 
	* @Title: edit 
	* @Description: 编辑用户 
	* @param user
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午1:55:28
	 */
	public boolean edit(User user);
	
	/**
	 * 
	* @Title: encryptPassword 
	* @Description: 对用户的密码进行加密
	* @param user
	* @return User
	* @author ColdFingers
	* @date 2018年11月8日下午1:55:44
	 */
	public User encryptPassword(User user);
	
	/**
	 * 
	* @Title: editPasswd 
	* @Description: 修改用户密码 
	* @param user
	* @param oldPassword
	* @return Boolean
	* @author ColdFingers
	* @date 2018年11月8日下午1:56:19
	 */
	public Boolean editPasswd(User user,String oldPassword);
	
	/**
	 * 
	* @Title: findByEmail 
	* @Description: 通过邮件查找密码 
	* @param email
	* @return User
	* @author ColdFingers
	* @date 2018年11月8日下午1:56:41
	 */
	public User findByEmail(String email);
	

}
