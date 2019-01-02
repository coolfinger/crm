/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:14:51 
 */
package com.crm.wcx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.CustomerMapper;
import com.crm.wcx.dao.LinkmanMapper;
import com.crm.wcx.dao.ProductMapper;
import com.crm.wcx.dao.UserMapper;
import com.crm.wcx.entity.Customer;
import com.crm.wcx.entity.CustomerExample;
import com.crm.wcx.entity.Linkman;
import com.crm.wcx.entity.Product;
import com.crm.wcx.entity.User;
import com.crm.wcx.service.ICustomerService;

/** 
 * @ClassName: CustomerServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:14:51  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerMapper customerMapper;
	
	@Autowired
	private LinkmanMapper linkmanMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private ProductMapper productMapper;
	
	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerService#countByCustomerExample(com.crm.wcx.entity.CustomerExample)
	 */
	@Override
	public long countByCustomerExample(CustomerExample customerExample) {
		// TODO Auto-generated method stub
		return customerMapper.countByExample(customerExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerService#deleteByCustomerExample(com.crm.wcx.entity.CustomerExample)
	 */
	@Override
	public boolean deleteByCustomerExample(CustomerExample customerExample) {
		// TODO Auto-generated method stub
		return customerMapper.deleteByExample(customerExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public boolean deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return customerMapper.deleteByPrimaryKey(id)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerService#insertCustomer(com.crm.wcx.entity.Customer)
	 */
	@Override
	public boolean insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerMapper.insert(customer)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerService#insertSelective(com.crm.wcx.entity.Customer)
	 */
	@Override
	public boolean insertSelective(Customer customer) {
		// TODO Auto-generated method stub
		return customerMapper.insertSelective(customer)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerService#selectByCustomerExample(com.crm.wcx.entity.CustomerExample)
	 */
	@Override
	public List<Customer> selectByCustomerExample(
			CustomerExample customerExample) {
List<Customer> list = customerMapper.selectByExample(customerExample);
	    
	    for(Customer customer:list) {
	        try {
	            Product product = productMapper.selectByPrimaryKey(customer.getProductId());
	            customer.setProduct(product);
	            
	            User creater = userMapper.selectByPrimaryKey(customer.getCreater());  
	            if(creater != null) {
	                creater.setPassword(null);
	                creater.setSalt(null);
	            }
	            customer.setCreaterObject(creater);
	            
	            User manager = userMapper.selectByPrimaryKey(customer.getManagerId());
	            if(manager != null) {
	                manager.setPassword(null);
	                manager.setSalt(null);
	            }
	            customer.setManager(manager);
	        }catch (Exception e) {
            }
	    }
		return list;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerService#selectCustomerByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public Customer selectCustomerByPrimaryKey(Integer id) {
		Customer customer = customerMapper.selectByPrimaryKey(id);
	    try {
            Product product = productMapper.selectByPrimaryKey(customer.getProductId());
            customer.setProduct(product);
            
            User creater = userMapper.selectByPrimaryKey(customer.getCreater());  
            if(creater != null) {
                creater.setPassword(null);
                creater.setSalt(null);
            }
            customer.setCreaterObject(creater);
            
            User manager = userMapper.selectByPrimaryKey(customer.getManagerId());
            if(manager != null) {
                manager.setPassword(null);
                manager.setSalt(null);
            }
            customer.setManager(manager);
        }catch (Exception e) {
        }
		return customer;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerService#updateByCustomerExampleSelective(com.crm.wcx.entity.Customer, com.crm.wcx.entity.CustomerExample)
	 */
	@Override
	public boolean updateByCustomerExampleSelective(Customer customer,
			CustomerExample customerExample) {
		// TODO Auto-generated method stub
		return customerMapper.updateByExampleSelective(customer, customerExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerService#updateByCustomerExample(com.crm.wcx.entity.Customer, com.crm.wcx.entity.CustomerExample)
	 */
	@Override
	public boolean updateByCustomerExample(Customer customer,
			CustomerExample customerExample) {
		// TODO Auto-generated method stub
		return customerMapper.updateByExample(customer, customerExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerService#updateCustomerByPrimaryKeySelective(com.crm.wcx.entity.Customer)
	 */
	@Override
	public boolean updateCustomerByPrimaryKeySelective(Customer customer) {
		// TODO Auto-generated method stub
		return customerMapper.updateByPrimaryKeySelective(customer)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerService#updateCustomerByPrimaryKey(com.crm.wcx.entity.Customer)
	 */
	@Override
	public boolean updateCustomerByPrimaryKey(Customer customer) {
		// TODO Auto-generated method stub
		return customerMapper.updateByPrimaryKey(customer)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerService#insertSelective(com.crm.wcx.entity.Customer, com.crm.wcx.entity.Linkman)
	 */
	@Override
	public boolean insertSelective(Customer customer, Linkman linkman) {
		//插入客户数据
        if(customerMapper.insertSelective(customer) > 0) {
            
            CustomerExample example = new CustomerExample();
            example.createCriteria().andNameEqualTo(customer.getName());
            
            customer = customerMapper.selectByExample(example).get(0);
            
            linkman.setCustomerId(customer.getId());
            linkman.setLevel(0);
            
            linkmanMapper.insertSelective(linkman);
            
            return true;
        }else {
            return false;
        }
	}

}
