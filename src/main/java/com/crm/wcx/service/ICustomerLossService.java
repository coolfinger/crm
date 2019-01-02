package com.crm.wcx.service;

import java.util.List;

import org.hyperic.sigar.pager.Pager;

import com.crm.wcx.entity.CustomerLoss;
import com.crm.wcx.entity.CustomerLossExample;
import com.crm.wcx.entity.User;

/**
 * 
 * @ClassName: ICustomerLossService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午7:36:18
 */
public interface ICustomerLossService {

	/**
	 * 
	* @Title: countByCustomerLossExample 
	* @Description: 按照Example 统计记录总数 
	* @param customerLossExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午7:43:00
	 */
	public long countByCustomerLossExample(CustomerLossExample customerLossExample);

	/**
	 * 
	* @Title: deleteByCustomerLossExample 
	* @Description: 按照Example 删除CustomerLoss 
	* @param customerLossExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:43:10
	 */
	public boolean deleteByCustomerLossExample(CustomerLossExample customerLossExample);

	/**
	 * 
	* @Title: deleteByPrimaryKey 
	* @Description: 按照CustomerLoss主键id删除CustomerLoss 
	* @param id
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:43:20
	 */
	public boolean deleteByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: insertCustomerLoss 
	* @Description: 插入一条CustomerLoss数据 如字段为空，则插入null 
	* @param customerLoss
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:43:28
	 */
	public boolean insertCustomerLoss(CustomerLoss customerLoss);
	
	/**
	 * 
	* @Title: insertSelective 
	* @Description: 插入一条CustomerLoss数据，如字段为空，则插入数据库表字段的默认值 
	* @param customerLoss
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:43:37
	 */
	public boolean insertSelective(CustomerLoss customerLoss);
	
	/**
	 * 
	* @Title: selectByCustomerLossExample 
	* @Description: 按照Example条件 模糊查询 
	* @param customerLossExample
	* @return List<CustomerLoss>
	* @author ColdFingers
	* @date 2018年11月8日下午7:43:46
	 */
	public List<CustomerLoss> selectByCustomerLossExample(CustomerLossExample customerLossExample);
	
	/**
	 * 
	* @Title: selectCustomerLossByPrimaryKey 
	* @Description: 按照CustomerLoss 的id 查找 CustomerLoss 
	* @param id
	* @return CustomerLoss
	* @author ColdFingers
	* @date 2018年11月8日下午7:43:55
	 */
	public CustomerLoss selectCustomerLossByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: updateByCustomerLossExample 
	* @Description: 更新CustomerLoss对象中若有空则更新字段为null 
	* @param customerLoss
	* @param customerLossExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:44:09
	 */
	public boolean updateByCustomerLossExample(CustomerLoss customerLoss, CustomerLossExample customerLossExample);
	
	/**
	 * 
	* @Title: updateByCustomerLossExampleSelective 
	* @Description: 更新CustomerLoss 对象中若有空则不会更新此字段 
	* @param customerLoss
	* @param customerLossExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:44:21
	 */
	public boolean updateByCustomerLossExampleSelective(CustomerLoss customerLoss, CustomerLossExample customerLossExample);
		
	/**
	 * 
	* @Title: updateCustomerLossByPrimaryKeySelective 
	* @Description: 按照CustomerLoss id 更新CustomerLoss对象中如有空则不会更新此字段 
	* @param customerLoss
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:44:33
	 */
	public boolean updateCustomerLossByPrimaryKeySelective(CustomerLoss customerLoss);
	
	/**
	 * 
	* @Title: updateCustomerLossByPrimaryKey 
	* @Description: 按照CustomerLoss id 更新CustomerLoss对象中如有空则更新此字段为null 
	* @param customerLoss
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:44:45
	 */
	public boolean updateCustomerLossByPrimaryKey(CustomerLoss customerLoss);

	/**
	 * 
	* @Title: selectByCustomerLossExampleByPager 
	* @Description: 分页查询CustomerLoss 
	* @param customerLoss
	* @param pager
	* @param user
	* @return List<CustomerLoss>
	* @author ColdFingers
	* @date 2018年11月8日下午7:44:58
	 */
	public List<CustomerLoss> selectByCustomerLossExampleByPager(CustomerLoss customerLoss, com.crm.wcx.entity.Pager pager, User user);
}
