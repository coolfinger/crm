package com.crm.wcx.service;

import java.util.List;

import org.hyperic.sigar.pager.Pager;

import com.crm.wcx.entity.Orders;
import com.crm.wcx.entity.OrdersExample;

/**
 * 
 * @ClassName: IOrdersService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午5:52:21
 */
public interface IOrdersService {

	/**
	 * 	
	* @Title: countByOrdersExample 
	* @Description: 按照Example 统计记录总数 
	* @param ordersExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午5:53:02
	 */
	public long countByOrdersExample(OrdersExample ordersExample);

	/**
	 * 
	* @Title: deleteByOrdersExample 
	* @Description: 按照Example 删除Order 
	* @param ordersExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:53:21
	 */
	public boolean deleteByOrdersExample(OrdersExample ordersExample);

	/**
	 * 
	* @Title: deleteByPrimaryKey 
	* @Description: 按照Order主键id删除Order 
	* @param id
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:53:32
	 */
	public boolean deleteByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: insertOrder 
	* @Description: 插入一条Order数据 如字段为空，则插入null 
	* @param orders
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:53:45
	 */
	public boolean insertOrder(Orders orders);
	
	/**
	 * 
	* @Title: insertSelective 
	* @Description: 插入一条Order数据，如字段为空，则插入数据库表字段的默认值 
	* @param orders
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:53:56
	 */
	public boolean insertSelective(Orders orders);
	
	/**
	 * 
	* @Title: selectByOrdersExample 
	* @Description: 按照Example条件 模糊查询 
	* @param ordersExample
	* @return List<Orders>
	* @author ColdFingers
	* @date 2018年11月8日下午5:54:06
	 */
	public List<Orders> selectByOrdersExample(OrdersExample ordersExample);
	
	/**
	 * 
	* @Title: selectOrderByPrimaryKey 
	* @Description: 按照Order 的id 查找 Order 
	* @param id
	* @return Orders
	* @author ColdFingers
	* @date 2018年11月8日下午5:54:17
	 */
	public Orders selectOrderByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: updateByOrdersExample 
	* @Description: 更新Order 若字段为空 则设置为null 
	* @param orders
	* @param ordersExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:54:27
	 */
	public boolean updateByOrdersExample(Orders orders, OrdersExample ordersExample);
	
	/**
	 * 
	* @Title: updateByOrdersExampleSelective 
	* @Description: 更新Order 若字段为空 则不更新 
	* @param orders
	* @param ordersExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:54:54
	 */
	public boolean updateByOrdersExampleSelective(Orders orders, OrdersExample ordersExample);
		
	/**
	 * 
	* @Title: updateOrderByPrimaryKeySelective 
	* @Description: 按照Order id 更新Order 若字段为空 则不更新 
	* @param orders
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:55:24
	 */
	public boolean updateOrderByPrimaryKeySelective(Orders orders);
	
	/**
	 * 
	* @Title: updateOrderByPrimaryKey 
	* @Description: 按照Order id 更新Order 若字段为空 则更新为null 
	* @param orders
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:55:54
	 */
	public boolean updateOrderByPrimaryKey(Orders orders);		
	
	/**
	 * 
	* @Title: selectOrdersGroupByCustomerId 
	* @Description: 按照客户id分组查询最后一个订单的时间 
	* @return List<Orders>
	* @author ColdFingers
	* @date 2018年11月8日下午5:56:33
	 */
	public List<Orders> selectOrdersGroupByCustomerId();
	
	/**
	 * 
	* @Title: selectByOrdersExample 
	* @Description: 分页查询客户历史订单信息 
	* @param ordersExample
	* @param pager
	* @return List<Orders>
	* @author ColdFingers
	* @date 2018年11月8日下午5:56:45
	 */
	public List<Orders> selectByOrdersExample(OrdersExample ordersExample, com.crm.wcx.entity.Pager pager);
}
