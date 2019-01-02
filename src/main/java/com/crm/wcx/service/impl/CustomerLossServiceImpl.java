/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:15:18 
 */
package com.crm.wcx.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.hyperic.sigar.pager.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.CustomerLossMapper;
import com.crm.wcx.dao.CustomerMapper;
import com.crm.wcx.entity.Customer;
import com.crm.wcx.entity.CustomerExample;
import com.crm.wcx.entity.CustomerLoss;
import com.crm.wcx.entity.CustomerLossExample;
import com.crm.wcx.entity.CustomerLossExample.Criteria;
import com.crm.wcx.entity.User;
import com.crm.wcx.service.ICustomerLossService;

/** 
 * @ClassName: CustomerLossServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:15:18  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class CustomerLossServiceImpl implements ICustomerLossService {

	@Autowired
	private CustomerLossMapper customerLossMapper;
	
	@Autowired
	private CustomerMapper customerMapper;
	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerLossService#countByCustomerLossExample(com.crm.wcx.entity.CustomerLossExample)
	 */
	@Override
	public long countByCustomerLossExample(
			CustomerLossExample customerLossExample) {
		// TODO Auto-generated method stub
		return customerLossMapper.countByExample(customerLossExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerLossService#deleteByCustomerLossExample(com.crm.wcx.entity.CustomerLossExample)
	 */
	@Override
	public boolean deleteByCustomerLossExample(
			CustomerLossExample customerLossExample) {
		// TODO Auto-generated method stub
		return customerLossMapper.deleteByExample(customerLossExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerLossService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public boolean deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return customerLossMapper.deleteByPrimaryKey(id)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerLossService#insertCustomerLoss(com.crm.wcx.entity.CustomerLoss)
	 */
	@Override
	public boolean insertCustomerLoss(CustomerLoss customerLoss) {
		// TODO Auto-generated method stub
		return customerLossMapper.insert(customerLoss)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerLossService#insertSelective(com.crm.wcx.entity.CustomerLoss)
	 */
	@Override
	public boolean insertSelective(CustomerLoss customerLoss) {
		// TODO Auto-generated method stub
		return customerLossMapper.insertSelective(customerLoss)>0 ?true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerLossService#selectByCustomerLossExample(com.crm.wcx.entity.CustomerLossExample)
	 */
	@Override
	public List<CustomerLoss> selectByCustomerLossExample(
			CustomerLossExample customerLossExample) {
		// TODO Auto-generated method stub
		return customerLossMapper.selectByExample(customerLossExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerLossService#selectCustomerLossByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public CustomerLoss selectCustomerLossByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return customerLossMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerLossService#updateByCustomerLossExample(com.crm.wcx.entity.CustomerLoss, com.crm.wcx.entity.CustomerLossExample)
	 */
	@Override
	public boolean updateByCustomerLossExample(CustomerLoss customerLoss,
			CustomerLossExample customerLossExample) {
		// TODO Auto-generated method stub
		return customerLossMapper.updateByExample(customerLoss, customerLossExample)> 0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerLossService#updateByCustomerLossExampleSelective(com.crm.wcx.entity.CustomerLoss, com.crm.wcx.entity.CustomerLossExample)
	 */
	@Override
	public boolean updateByCustomerLossExampleSelective(
			CustomerLoss customerLoss, CustomerLossExample customerLossExample) {
		// TODO Auto-generated method stub
		return customerLossMapper.updateByExampleSelective(customerLoss, customerLossExample)>0 ?true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerLossService#updateCustomerLossByPrimaryKeySelective(com.crm.wcx.entity.CustomerLoss)
	 */
	@Override
	public boolean updateCustomerLossByPrimaryKeySelective(
			CustomerLoss customerLoss) {
		// TODO Auto-generated method stub
		return customerLossMapper.updateByPrimaryKeySelective(customerLoss)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerLossService#updateCustomerLossByPrimaryKey(com.crm.wcx.entity.CustomerLoss)
	 */
	@Override
	public boolean updateCustomerLossByPrimaryKey(CustomerLoss customerLoss) {
		// TODO Auto-generated method stub
		return customerLossMapper.updateByPrimaryKey(customerLoss)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerLossService#selectByCustomerLossExampleByPager(com.crm.wcx.entity.CustomerLoss, org.hyperic.sigar.pager.Pager, com.crm.wcx.entity.User)
	 */
	@Override
	public List<CustomerLoss> selectByCustomerLossExampleByPager(
			CustomerLoss customerLoss, com.crm.wcx.entity.Pager pager, User user) {
		CustomerLossExample customerLossExample = new CustomerLossExample();
		/**
		 * 1. 根据登录用户查找 属于登录用户的客户
		 * 2. 拿客户id 作为查询客户流失的条件，查询出流失客户
		 * 3. 遍历流失客户 子遍历客户集合，相同客户id的把客户信息放到流失客户集合中
		 * 
		 */
		
		/**
		 * 根据登录用户查找 属于登录用户的客户  判断是否搜索
		 */
		CustomerExample customerExample = new CustomerExample();
		
		String queryCustomerName = "";
		if(customerLoss.getCustomer() != null) {
			if(customerLoss.getCustomer().getName() != null && !"".equals(customerLoss.getCustomer().getName())) {
				queryCustomerName = customerLoss.getCustomer().getName();
				
			}
		}
		
		//判断是否是客户经理
		if(user.getRoleId() == 1) {
			customerExample.createCriteria().andManagerIdEqualTo(user.getId()).andDeleteStatusEqualTo(0).andNameLike("%"+queryCustomerName+"%");
		}else { //如果不是客户经理则查询全部的客户流失记录
			customerExample.createCriteria().andDeleteStatusEqualTo(0).andNameLike("%"+queryCustomerName+"%");
		}
		
		List<Customer> customers = customerMapper.selectByExample(customerExample);
		
		/**
		 * 拿客户id 作为查询客户流失的条件，查询出流失客户
		 */
		List<Integer> customerIds = new ArrayList<Integer>();
		for (Customer customer : customers) {
			customerIds.add(customer.getId());
		}
		if(customerIds.size() > 0) {
			Criteria criteria = customerLossExample.createCriteria();
			criteria.andCustomerIdIn(customerIds);
			//搜索条件
			if(customerLoss.getStatus() != null && !"".equals(customerLoss.getStatus())) {
				criteria.andStatusEqualTo(customerLoss.getStatus());
			}
			
			//计算总数
			Long count = countByCustomerLossExample(customerLossExample);
			
			pager.setTotal(count.intValue());
			customerLossExample.setLimit(pager.getPageSize());
			customerLossExample.setOffset(new Long(pager.getOffset()));
			customerLossExample.setOrderByClause("status asc");
			List<CustomerLoss> losses = customerLossMapper.selectByExample(customerLossExample);
			
			/**
			 * 遍历流失客户 子遍历客户集合，相同客户id的把客户信息放到流失客户集合中
			 */
			if(losses!= null){
				for (int i=0;i<losses.size(); i++) {
					for (Customer customer : customers) {
						if(losses.get(i).getCustomerId().equals(customer.getId())){
							losses.get(i).setCustomer(customer);
						}
					}
				}
			}
			return losses;
		}
		
		return null;
	}

}
