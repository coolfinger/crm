package com.crm.wcx.service;

import java.util.List;

import com.crm.wcx.entity.CustomerCare;
import com.crm.wcx.entity.CustomerCareExample;

/**
 * 
 * @ClassName: ICustomerCareService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午7:46:00
 */
public interface ICustomerCareService {

	/**
	 * 
	* @Title: countByCustomerCareExample 
	* @Description: 按照Example 统计记录总数 
	* @param customerCareExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午7:46:33
	 */
	public long countByCustomerCareExample(CustomerCareExample customerCareExample);

	/**
	 * 
	* @Title: deleteByCustomerCareExample 
	* @Description: 按照Example 删除CustomerCare 
	* @param customerCareExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:46:41
	 */
	public boolean deleteByCustomerCareExample(CustomerCareExample customerCareExample);

	/**
	 * 
	* @Title: deleteByPrimaryKey 
	* @Description: 按照CustomerCare主键id删除CustomerCare 
	* @param id
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:46:49
	 */
	public boolean deleteByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: insertCustomerCare 
	* @Description: 插入一条CustomerCare数据 如字段为空，则插入null 
	* @param customerCare
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:46:57
	 */
	public boolean insertCustomerCare(CustomerCare customerCare);
	
	/**
	 * 
	* @Title: insertSelective 
	* @Description: 插入一条CustomerCare数据，如字段为空，则插入数据库表字段的默认值 
	* @param customerCare
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:47:06
	 */
	public boolean insertSelective(CustomerCare customerCare);
	
	/**
	 * 
	* @Title: selectByCustomerCareExample 
	* @Description: 按照Example条件 模糊查询 
	* @param customerCareExample
	* @return List<CustomerCare>
	* @author ColdFingers
	* @date 2018年11月8日下午7:47:14
	 */
	public List<CustomerCare> selectByCustomerCareExample(CustomerCareExample customerCareExample);
	
	/**
	 * 
	* @Title: selectCustomerCareByPrimaryKey 
	* @Description: 按照CustomerCare 的id 查找 CustomerCare 
	* @param id
	* @return CustomerCare
	* @author ColdFingers
	* @date 2018年11月8日下午7:47:22
	 */
	public CustomerCare selectCustomerCareByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: updateByCustomerCareExample 
	* @Description: 更新CustomerCare对象中若有空则更新字段为null 
	* @param customerCare
	* @param customerCareExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:47:35
	 */
	public boolean updateByCustomerCareExample(CustomerCare customerCare, CustomerCareExample customerCareExample);
	
	/**
	 * 
	* @Title: updateByCustomerCareExampleSelective 
	* @Description: 更新CustomerCare 对象中若有空则不会更新此字段 
	* @param customerCare
	* @param customerCareExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:47:48
	 */
	public boolean updateByCustomerCareExampleSelective(CustomerCare customerCare, CustomerCareExample customerCareExample);
		
	/**
	 * 
	* @Title: updateCustomerCareByPrimaryKeySelective 
	* @Description: 按照CustomerCare id 更新CustomerCare对象中如有空则不会更新此字段 
	* @param customerCare
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:48:01
	 */
	public boolean updateCustomerCareByPrimaryKeySelective(CustomerCare customerCare);
	
	/**
	 * 
	* @Title: updateCustomerCareByPrimaryKey 
	* @Description: 按照CustomerCare id 更新CustomerCare对象中如有空则更新此字段为null 
	* @param customerCare
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:48:13
	 */
	public boolean updateCustomerCareByPrimaryKey(CustomerCare customerCare);

    /**
     * 
    * @Title: selectCustomerCareByManagerId 
    * @Description: 根据客户经理ID查找 
    * @param id
    * @return List<CustomerCare>
    * @author ColdFingers
    * @date 2018年11月8日下午7:48:21
     */
    public List<CustomerCare> selectCustomerCareByManagerId(Integer id);	
}
