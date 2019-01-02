package com.crm.wcx.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.wcx.entity.Customer;
import com.crm.wcx.entity.OrderItem;
import com.crm.wcx.entity.OrderItemExample;
import com.crm.wcx.entity.Orders;
import com.crm.wcx.entity.OrdersExample;
import com.crm.wcx.entity.Pager;
import com.crm.wcx.service.IOrderItemService;
import com.crm.wcx.service.IOrdersService;
import com.crm.wcx.utils.Operation;

/**
 * 
 * @ClassName: OrdersController 
 * @Description: 订单控制器
 * @author: ColdFingers
 * @date: 2018年12月4日 下午12:50:37
 */
@Operation(name="订单控制器")
@Controller
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	private IOrdersService ordersService;
	
	@Autowired
	private IOrderItemService orderItemService;
	
	/**
	 * 
	* @Title: getHistoryOrdersByCustomer 
	* @Description: 获取客户的历史订单信息 
	* @param page
	* @param limit
	* @param customer
	* @return Map<String,Object>
	* @author ColdFingers
	* @date 2018年12月4日下午12:50:48
	 */
	@Operation(name="获取客户的历史订单")
	@RequiresAuthentication
	@RequestMapping("/getHistoryOrdersByCustomer")
	@ResponseBody
	public Map<String, Object> getHistoryOrdersByCustomer(Long page, Long limit, Customer customer){
		
		Map<String, Object> maps = new HashMap<String, Object>(16);
		
		Pager pager = new Pager(page.intValue(), limit.intValue());
		OrdersExample ordersExample = new OrdersExample();
		ordersExample.createCriteria().andCustomerIdEqualTo(customer.getId());
		List<Orders> orders = ordersService.selectByOrdersExample(ordersExample, pager);
		maps.put("data", orders);
		maps.put("count", pager.getTotal());
		maps.put("code", 0);
		return maps;
	}
	
	/**
	 * 
	* @Title: getOrderItem 
	* @Description: 获取订单的订单项 
	* @param page
	* @param limit
	* @param orders
	* @return Map<String,Object>
	* @author ColdFingers
	* @date 2018年12月4日下午12:51:00
	 */
	@Operation(name="获取订单的订单项")
	@RequiresAuthentication
	@RequestMapping("/getOrderItem")
	@ResponseBody
	public Map<String, Object> getOrderItem(Long page, Long limit, Orders orders){
		
		Map<String, Object> maps = new HashMap<String, Object>(16);
		
		Pager pager = new Pager(page.intValue(), limit.intValue());
		
		OrderItemExample orderItemExample = new OrderItemExample();
		orderItemExample.createCriteria().andOrdersIdEqualTo(orders.getId());
		List<OrderItem> orderItems = orderItemService.selectByOrderItemExample(orderItemExample, pager);
		
		maps.put("code", 0);
		maps.put("data", orderItems);
		maps.put("count", pager.getTotal());
		return maps;
	}
	
}
