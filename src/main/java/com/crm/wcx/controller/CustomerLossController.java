package com.crm.wcx.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.wcx.entity.Customer;
import com.crm.wcx.entity.CustomerLoss;
import com.crm.wcx.entity.Pager;
import com.crm.wcx.entity.User;
import com.crm.wcx.service.ICustomerLossService;
import com.crm.wcx.service.ICustomerService;
import com.crm.wcx.utils.LocalDateTimeUtil;
import com.crm.wcx.utils.Operation;

/**
 * 
 * @ClassName: CustomerLossController 
 * @Description: 客户流失控制器
 * @author: ColdFingers
 * @date: 2018年12月4日 下午12:43:35
 */
@Controller
@RequestMapping("/loss")
public class CustomerLossController {
	
	@Autowired
	private ICustomerLossService lossService;
	
	@Autowired
	private ICustomerService customerService;
	
	/**
	 * 
	* @Title: findCustomerLoss 
	* @Description: 获取客户流失信息 
	* @param limit
	* @param page
	* @param request
	* @param customerLoss
	* @return Map<String,Object>
	* @author ColdFingers
	* @date 2018年12月4日下午12:43:45
	 */
	@Operation(name="获取客户流失信息")
	@RequiresPermissions("8001")
	@RequestMapping("/findCustomerLoss")
	@ResponseBody
	public Map<String, Object> findCustomerLoss(Long limit, Long page, HttpServletRequest request,
			CustomerLoss customerLoss){
		
		Map<String, Object> maps = new HashMap<String, Object>(16);
		
		
		Pager pager = new Pager(page.intValue(), limit.intValue());
		
		User user = (User)request.getSession().getAttribute("user");
		List<CustomerLoss> losses = lossService.selectByCustomerLossExampleByPager(customerLoss, pager, user);
		maps.put("data", losses);
		maps.put("code", 0);
		maps.put("count", pager.getTotal());
		
		return maps;
	}
	
	/**
	 * 
	* @Title: updateCustomerLoss 
	* @Description: 获取客户流失信息 
	* @param customerLoss
	* @return Map<String,Object>
	* @author ColdFingers
	* @date 2018年12月4日下午12:43:55
	 */
	@Operation(name="更新客户流失的信息")
	@RequiresPermissions("8003")
	@RequestMapping("/updateCustomerLoss")
	@ResponseBody
	public Map<String, Object> updateCustomerLoss(CustomerLoss customerLoss){
		
		Map<String, Object> maps = new HashMap<String, Object>(16);
		
		//判断更新客户流失状态是否是已经流失  status = 2
		String lossStatus = "2";
		if(!lossStatus.equals(customerLoss.getStatus())){
			boolean result = lossService.updateCustomerLossByPrimaryKeySelective(customerLoss);
			
			//挽回客戶，將客戶表信息的狀態清空
			String status = "1";
			if(status.equals(customerLoss.getStatus())) {
				Customer customer = customerLoss.getCustomer();
				customer.setStatus("");
				customerService.updateCustomerByPrimaryKeySelective(customer);
			}
			
			if(result == true){
				maps.put("code", 0);
			}else{
				maps.put("code", 200);
				maps.put("msg", "更新失败");
			}
			return maps;
		}else{
			
			//更新客户信息表的状态为客户流失
			//设置流失时间
			customerLoss.setLossDate(LocalDateTimeUtil.convertDateToLDT(new Date()));
			boolean result = lossService.updateCustomerLossByPrimaryKeySelective(customerLoss);
			if(result == true){
				
				//更新客户信息表
				Customer customer = new Customer();
				customer.setId(customerLoss.getCustomer().getId());
				customer.setStatus("流失状态");
				//boolean res = 
				customerService.updateCustomerByPrimaryKeySelective(customer);
				
				maps.put("code", 0);
			}else{
				maps.put("code", 200);
				maps.put("msg", "更新失败");
				return maps;
			}
			
		}
		
		return maps;
	}
	
	/**
	 * 
	* @Title: deleteCustomerLoss 
	* @Description: 删除客户流失记录 
	* @param customerLoss
	* @return Map<String,Object>
	* @author ColdFingers
	* @date 2018年12月4日下午12:44:08
	 */
	@Operation(name="删除客户流失记录")
	@RequestMapping("/deleteCustomerLoss")
	@RequiresPermissions("8004")
	@ResponseBody
	public Map<String, Object> deleteCustomerLoss(CustomerLoss customerLoss){
		
		Map<String, Object> maps = new HashMap<String, Object>(16);
		
		boolean result = lossService.deleteByPrimaryKey(customerLoss.getId());
		if(result == true){
			maps.put("code", 0);
		}else{
			maps.put("code", 200);
		}
		return maps;
	}
}
