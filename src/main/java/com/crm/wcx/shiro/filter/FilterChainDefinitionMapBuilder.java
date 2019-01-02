package com.crm.wcx.shiro.filter;

import java.util.LinkedHashMap;

/**
 * 
 * @ClassName: FilterChainDefinitionMapBuilder 
 * @Description: TODO
 * @author: CoolFingers
 * @date: 2018年11月10日 上午10:17:08
 */
public class FilterChainDefinitionMapBuilder {

	/**
	 * 
	* @Title: buildFilterChainDefinitionMap 
	* @Description: TODO 
	* @return LinkedHashMap<String,String>
	* @author CoolFingers
	* @date 2018年11月10日上午10:17:15
	 */
	public LinkedHashMap<String, String> buildFilterChainDefinitionMap(){
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		
		//anno是匿名过滤器，不需要验证也可以访问
		map.put("/js/**", "anon");
		map.put("/images/**", "anon");
		map.put("/layui/**", "anon");
		map.put("/user/login", "anon");
		map.put("/user/getForgotPasswdCode", "anon");
		map.put("/user/resetPasswd", "anon");
		map.put("/verify/getVerifyCode", "anon");
		map.put("/pages/**", "anon");
		//map.put("/pages/login.jsp", "anon");
		//map.put("/user/login", "anon");
		//map.put("/shiro/logout", "logout");
		
		//authc是验证过滤器，代表需要验证过才能访问，roles【user】代表还需要是拥有user角色才能访问
		//map.put("/user.jsp", "authc,roles[user]");
		//map.put("/admin.jsp", "authc,roles[admin]");
		//map.put("/list.jsp", "user");
		map.put("/**", "authc");
		
		return map;
	}
	
}
