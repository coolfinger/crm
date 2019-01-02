package com.crm.wcx.service;

import java.util.List;

import org.hyperic.sigar.pager.Pager;

import com.crm.wcx.entity.OrderItem;
import com.crm.wcx.entity.OrderItemExample;

/**
 * 
 * @ClassName: IOrderItemService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午5:57:26
 */
public interface IOrderItemService {

	
	/**
	 * 
	* @Title: countByOrderItemExample 
	* @Description: 按照Example 统计记录总数 
	* @param orderItemExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午5:57:54
	 */
	public long countByOrderItemExample(OrderItemExample orderItemExample);

	/**
	 * 
	* @Title: deleteByOrderItemExample 
	* @Description: 按照Example 删除OrderItem 
	* @param orderItemExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:58:07
	 */
	public boolean deleteByOrderItemExample(OrderItemExample orderItemExample);

	/**
	 * 
	* @Title: deleteByPrimaryKey 
	* @Description: 按照OrderItem主键id删除OrderItem 
	* @param id
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:58:18
	 */
	public boolean deleteByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: insertOrderItem 
	* @Description: 插入一条OrderItem数据 如字段为空，则插入null 
	* @param orderItem
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:58:35
	 */
	public boolean insertOrderItem(OrderItem orderItem);
	
	/**
	 * 
	* @Title: insertSelective 
	* @Description: 插入一条OrderItem数据，如字段为空，则插入数据库表字段的默认值 
	* @param orderItem
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:58:48
	 */
	public boolean insertSelective(OrderItem orderItem);
	
	/**
	 * 
	* @Title: selectByOrderItemExample 
	* @Description: 按照Example条件 模糊查询 
	* @param orderItemExample
	* @return List<OrderItem>
	* @author ColdFingers
	* @date 2018年11月8日下午5:59:01
	 */
	public List<OrderItem> selectByOrderItemExample(OrderItemExample orderItemExample);
	
	/**
	 * 
	* @Title: selectOrderItemByPrimaryKey 
	* @Description: 按照OrderItem 的id 查找 OrderItem 
	* @param id
	* @return OrderItem
	* @author ColdFingers
	* @date 2018年11月8日下午5:59:12
	 */
	public OrderItem selectOrderItemByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: updateByOrderItemExample 
	* @Description: 更新OrderItem 若字段为空则设置为null
	* @param orderItem
	* @param orderItemExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:59:27
	 */
	public boolean updateByOrderItemExample(OrderItem orderItem, OrderItemExample orderItemExample);
	
	/**
	 * 
	* @Title: updateByOrderItemExampleSelective 
	* @Description: 更新OrderItem 若字段为空则设置为默认值
	* @param orderItem
	* @param orderItemExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:59:40
	 */
	public boolean updateByOrderItemExampleSelective(OrderItem orderItem, OrderItemExample orderItemExample);
		
	/**
	 * 
	* @Title: updateOrderItemByPrimaryKeySelective 
	* @Description: 按照OrderItem id 更新OrderItem 若字段为空 则不更新 
	* @param orderItem
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午6:00:41
	 */
	public boolean updateOrderItemByPrimaryKeySelective(OrderItem orderItem);
	
	/**
	 * 
	* @Title: updateOrderItemByPrimaryKey 
	* @Description: 按照OrderItem id 更新OrderItem 若字段为空则更新为null 
	* @param orderItem
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午6:01:10
	 */
	public boolean updateOrderItemByPrimaryKey(OrderItem orderItem);

	/**
	 * 
	* @Title: selectByOrderItemExample 
	* @Description: 分页获取订单的订单项 
	* @param orderItemExample
	* @param pager
	* @return List<OrderItem>
	* @author ColdFingers
	* @date 2018年11月8日下午6:01:38
	 */
	public List<OrderItem> selectByOrderItemExample(OrderItemExample orderItemExample, com.crm.wcx.entity.Pager pager);	
}
