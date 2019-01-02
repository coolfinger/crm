/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:09:52 
 */
package com.crm.wcx.service.impl;

import java.util.List;

import org.hyperic.sigar.pager.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.OrdersMapper;
import com.crm.wcx.entity.Orders;
import com.crm.wcx.entity.OrdersExample;
import com.crm.wcx.service.IOrdersService;

/** 
 * @ClassName: OrdersServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:09:52  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class OrdersServiceImpl implements IOrdersService {

	@Autowired
	private OrdersMapper ordersMapper;
	
	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrdersService#countByOrdersExample(com.crm.wcx.entity.OrdersExample)
	 */
	@Override
	public long countByOrdersExample(OrdersExample ordersExample) {
		// TODO Auto-generated method stub
		return ordersMapper.countByExample(ordersExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrdersService#deleteByOrdersExample(com.crm.wcx.entity.OrdersExample)
	 */
	@Override
	public boolean deleteByOrdersExample(OrdersExample ordersExample) {
		// TODO Auto-generated method stub
		return ordersMapper.deleteByExample(ordersExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrdersService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public boolean deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return ordersMapper.deleteByPrimaryKey(id)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrdersService#insertOrder(com.crm.wcx.entity.Orders)
	 */
	@Override
	public boolean insertOrder(Orders orders) {
		// TODO Auto-generated method stub
		return ordersMapper.insert(orders)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrdersService#insertSelective(com.crm.wcx.entity.Orders)
	 */
	@Override
	public boolean insertSelective(Orders orders) {
		// TODO Auto-generated method stub
		return ordersMapper.insertSelective(orders)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrdersService#selectByOrdersExample(com.crm.wcx.entity.OrdersExample)
	 */
	@Override
	public List<Orders> selectByOrdersExample(OrdersExample ordersExample) {
		// TODO Auto-generated method stub
		return ordersMapper.selectByExample(ordersExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrdersService#selectOrderByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public Orders selectOrderByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return ordersMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrdersService#updateByOrdersExample(com.crm.wcx.entity.Orders, com.crm.wcx.entity.OrdersExample)
	 */
	@Override
	public boolean updateByOrdersExample(Orders orders,
			OrdersExample ordersExample) {
		// TODO Auto-generated method stub
		return ordersMapper.updateByExample(orders, ordersExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrdersService#updateByOrdersExampleSelective(com.crm.wcx.entity.Orders, com.crm.wcx.entity.OrdersExample)
	 */
	@Override
	public boolean updateByOrdersExampleSelective(Orders orders,
			OrdersExample ordersExample) {
		// TODO Auto-generated method stub
		return ordersMapper.updateByExampleSelective(orders, ordersExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrdersService#updateOrderByPrimaryKeySelective(com.crm.wcx.entity.Orders)
	 */
	@Override
	public boolean updateOrderByPrimaryKeySelective(Orders orders) {
		// TODO Auto-generated method stub
		return ordersMapper.updateByPrimaryKeySelective(orders)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrdersService#updateOrderByPrimaryKey(com.crm.wcx.entity.Orders)
	 */
	@Override
	public boolean updateOrderByPrimaryKey(Orders orders) {
		// TODO Auto-generated method stub
		return ordersMapper.updateByPrimaryKey(orders)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrdersService#selectOrdersGroupByCustomerId()
	 */
	@Override
	public List<Orders> selectOrdersGroupByCustomerId() {
		// TODO Auto-generated method stub
		return ordersMapper.selectOrdersGroupByCustomerId();
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IOrdersService#selectByOrdersExample(com.crm.wcx.entity.OrdersExample, org.hyperic.sigar.pager.Pager)
	 */
	@Override
	public List<Orders> selectByOrdersExample(OrdersExample ordersExample,
			com.crm.wcx.entity.Pager pager) {
Long count = ordersMapper.countByExample(ordersExample);
		
		pager.setTotal(count.intValue());
		
		ordersExample.setLimit(pager.getPageSize());
		ordersExample.setOffset(new Long(pager.getOffset()));
		List<Orders> orders = ordersMapper.selectByExample(ordersExample);
		
		return orders;
	}

}
