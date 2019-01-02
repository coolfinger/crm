/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:10:17 
 */
package com.crm.wcx.service.impl;

import java.util.List;

import org.hyperic.sigar.pager.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.OrderItemMapper;
import com.crm.wcx.dao.ProductMapper;
import com.crm.wcx.entity.OrderItem;
import com.crm.wcx.entity.OrderItemExample;
import com.crm.wcx.service.IOrderItemService;

/** 
 * @ClassName: OrderItemServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:10:17  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class OrderItemServiceImpl implements IOrderItemService {

	@Autowired
	private OrderItemMapper orderItemMapper;
	
	@Autowired
	private ProductMapper productMapper;
	
	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrderItemService#countByOrderItemExample(com.crm.wcx.entity.OrderItemExample)
	 */
	@Override
	public long countByOrderItemExample(OrderItemExample orderItemExample) {
		// TODO Auto-generated method stub
		return orderItemMapper.countByExample(orderItemExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrderItemService#deleteByOrderItemExample(com.crm.wcx.entity.OrderItemExample)
	 */
	@Override
	public boolean deleteByOrderItemExample(OrderItemExample orderItemExample) {
		// TODO Auto-generated method stub
		return orderItemMapper.deleteByExample(orderItemExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrderItemService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public boolean deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return orderItemMapper.deleteByPrimaryKey(id)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrderItemService#insertOrderItem(com.crm.wcx.entity.OrderItem)
	 */
	@Override
	public boolean insertOrderItem(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return orderItemMapper.insertSelective(orderItem)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrderItemService#insertSelective(com.crm.wcx.entity.OrderItem)
	 */
	@Override
	public boolean insertSelective(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return orderItemMapper.insertSelective(orderItem)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrderItemService#selectByOrderItemExample(com.crm.wcx.entity.OrderItemExample)
	 */
	@Override
	public List<OrderItem> selectByOrderItemExample(
			OrderItemExample orderItemExample) {
		// TODO Auto-generated method stub
		return orderItemMapper.selectByExample(orderItemExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrderItemService#selectOrderItemByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public OrderItem selectOrderItemByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return orderItemMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrderItemService#updateByOrderItemExample(com.crm.wcx.entity.OrderItem, com.crm.wcx.entity.OrderItemExample)
	 */
	@Override
	public boolean updateByOrderItemExample(OrderItem orderItem,
			OrderItemExample orderItemExample) {
		// TODO Auto-generated method stub
		return orderItemMapper.updateByExample(orderItem, orderItemExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrderItemService#updateByOrderItemExampleSelective(com.crm.wcx.entity.OrderItem, com.crm.wcx.entity.OrderItemExample)
	 */
	@Override
	public boolean updateByOrderItemExampleSelective(OrderItem orderItem,
			OrderItemExample orderItemExample) {
		// TODO Auto-generated method stub
		return orderItemMapper.updateByExampleSelective(orderItem, orderItemExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrderItemService#updateOrderItemByPrimaryKeySelective(com.crm.wcx.entity.OrderItem)
	 */
	@Override
	public boolean updateOrderItemByPrimaryKeySelective(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return orderItemMapper.updateByPrimaryKeySelective(orderItem)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrderItemService#updateOrderItemByPrimaryKey(com.crm.wcx.entity.OrderItem)
	 */
	@Override
	public boolean updateOrderItemByPrimaryKey(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return orderItemMapper.updateByPrimaryKey(orderItem)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrderItemService#selectByOrderItemExample(com.crm.wcx.entity.OrderItemExample, org.hyperic.sigar.pager.Pager)
	 */
	@Override
	public List<OrderItem> selectByOrderItemExample(
			OrderItemExample orderItemExample, com.crm.wcx.entity.Pager pager) {
Long count = orderItemMapper.countByExample(orderItemExample);
		
		pager.setTotal(count.intValue());
		
		orderItemExample.setLimit(pager.getPageSize());
		orderItemExample.setOffset(new Long(pager.getOffset()));
		
		List<OrderItem> orderItems = orderItemMapper.selectByExample(orderItemExample);
		
		//循环遍历设置产品的信息
		for (OrderItem orderItem : orderItems) {
			orderItem.setProduct(productMapper.selectByPrimaryKey(orderItem.getProductId()));
		}
		
		return orderItems;
		
	}

}
