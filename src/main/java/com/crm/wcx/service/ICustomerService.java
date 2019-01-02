package com.crm.wcx.service;

import java.util.List;

import com.crm.wcx.entity.Customer;
import com.crm.wcx.entity.CustomerExample;
import com.crm.wcx.entity.Linkman;

/**
 * 
 * @ClassName: ICustomerService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午7:32:15
 */
public interface ICustomerService {

	/**
	 * 
	* @Title: countByCustomerExample 
	* @Description: 按照Example 统计记录总数 
	* @param customerExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午7:32:43
	 */
	public long countByCustomerExample(CustomerExample customerExample);
	
	/**
	 * 
	* @Title: deleteByCustomerExample 
	* @Description: 按照Example 删除Customer 
	* @param customerExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:32:51
	 */
	public boolean deleteByCustomerExample(CustomerExample customerExample);
	
	/**
	 * 
	* @Title: deleteByPrimaryKey 
	* @Description: 按照Customer主键id删除Customer 
	* @param id
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:32:59
	 */
	public boolean deleteByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: insertCustomer 
	* @Description: 插入一条Customer数据 如字段为空，则插入null 
	* @param customer
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:33:09
	 */
	public boolean insertCustomer(Customer customer);
	
	/**
	 * 
	* @Title: insertSelective 
	* @Description: 插入一条Customer数据，如字段为空，则插入数据库表字段的默认值 
	* @param customer
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:33:18
	 */
	public boolean insertSelective(Customer customer);
	
	/**
	 * 
	* @Title: selectByCustomerExample 
	* @Description: 按照Example 条件 模糊查询 
	* @param customerExample
	* @return List<Customer>
	* @author ColdFingers
	* @date 2018年11月8日下午7:33:27
	 */
	public List<Customer> selectByCustomerExample(CustomerExample customerExample);
	
	/**
	 * 
	* @Title: selectCustomerByPrimaryKey 
	* @Description: 按照Customer 的id 查找 Customer 
	* @param id
	* @return Customer
	* @author ColdFingers
	* @date 2018年11月8日下午7:33:36
	 */
	public Customer selectCustomerByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: updateByCustomerExampleSelective 
	* @Description: 更新Customer ， Customer对象中若有空则不会更新此字段  CustomerExample为where条件 
	* @param customer
	* @param customerExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:33:45
	 */
	public boolean updateByCustomerExampleSelective(Customer customer, CustomerExample customerExample);
	
	/**
	 * 
	* @Title: updateByCustomerExample 
	* @Description: 更新Customer， Customer对象中若有空则更新字段为null   CustomerExample为where条件 
	* @param customer
	* @param customerExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:35:13
	 */
	public boolean updateByCustomerExample(Customer customer, CustomerExample customerExample);
	
	/**
	 * 
	* @Title: updateCustomerByPrimaryKeySelective 
	* @Description: 按照Customer id 更新Customer  Customer对象中如有空则不会更新此字段 
	* @param customer
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:35:24
	 */
	public boolean updateCustomerByPrimaryKeySelective(Customer customer);
	
	/**
	 * 
	* @Title: updateCustomerByPrimaryKey 
	* @Description: 按照Customer id 更新Customer  Customer对象中如有空则更新此字段为null 
	* @param customer
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:35:32
	 */
	public boolean updateCustomerByPrimaryKey(Customer customer);

	/**
	 * 
	* @Title: insertSelective 
	* @Description: 添加客户，同时设置主要联系人 
	* @param customer
	* @param linkman
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:35:41
	 */
	public boolean insertSelective(Customer customer, Linkman linkman);
}
