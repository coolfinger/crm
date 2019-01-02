package com.crm.wcx.service;

import com.crm.wcx.entity.User;

/**
 * 
 * @ClassName: ILoginService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午6:10:27
 */
public interface ILoginService {

	/**
	 * 
	* @Title: login 
	* @Description: 登录 
	* @param user
	* @return User
	* @author ColdFingers
	* @date 2018年11月8日下午6:10:59
	 */
    public User login(User user);
}
