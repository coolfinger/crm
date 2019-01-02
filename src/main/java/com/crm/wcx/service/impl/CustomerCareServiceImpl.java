/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:15:43 
 */
package com.crm.wcx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.CustomerCareMapper;
import com.crm.wcx.dao.CustomerMapper;
import com.crm.wcx.dao.LinkmanMapper;
import com.crm.wcx.dao.UserMapper;
import com.crm.wcx.entity.CustomerCare;
import com.crm.wcx.entity.CustomerCareExample;
import com.crm.wcx.entity.Linkman;
import com.crm.wcx.entity.User;
import com.crm.wcx.service.ICustomerCareService;

/** 
 * @ClassName: CustomerCareServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:15:43  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class CustomerCareServiceImpl implements ICustomerCareService {

	@Autowired
	private CustomerCareMapper customerCareMapper;
	
	@Autowired
	private LinkmanMapper linkmanMapper;
	
	@Autowired
    private CustomerMapper customerMapper;
	
	@Autowired
	private UserMapper userMapper;
	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerCareService#countByCustomerCareExample(com.crm.wcx.entity.CustomerCareExample)
	 */
	@Override
	public long countByCustomerCareExample(
			CustomerCareExample customerCareExample) {
		// TODO Auto-generated method stub
		return customerCareMapper.countByExample(customerCareExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerCareService#deleteByCustomerCareExample(com.crm.wcx.entity.CustomerCareExample)
	 */
	@Override
	public boolean deleteByCustomerCareExample(
			CustomerCareExample customerCareExample) {
		// TODO Auto-generated method stub
		return customerCareMapper.deleteByExample(customerCareExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerCareService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public boolean deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return customerCareMapper.deleteByPrimaryKey(id)>0 ?true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerCareService#insertCustomerCare(com.crm.wcx.entity.CustomerCare)
	 */
	@Override
	public boolean insertCustomerCare(CustomerCare customerCare) {
		// TODO Auto-generated method stub
		return customerCareMapper.insert(customerCare)>0 ?true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerCareService#insertSelective(com.crm.wcx.entity.CustomerCare)
	 */
	@Override
	public boolean insertSelective(CustomerCare customerCare) {
		// TODO Auto-generated method stub
		return customerCareMapper.insertSelective(customerCare)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerCareService#selectByCustomerCareExample(com.crm.wcx.entity.CustomerCareExample)
	 */
	@Override
	public List<CustomerCare> selectByCustomerCareExample(
			CustomerCareExample customerCareExample) {
		// TODO Auto-generated method stub
		return customerCareMapper.selectByExample(customerCareExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerCareService#selectCustomerCareByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public CustomerCare selectCustomerCareByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return customerCareMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerCareService#updateByCustomerCareExample(com.crm.wcx.entity.CustomerCare, com.crm.wcx.entity.CustomerCareExample)
	 */
	@Override
	public boolean updateByCustomerCareExample(CustomerCare customerCare,
			CustomerCareExample customerCareExample) {
		// TODO Auto-generated method stub
		return customerCareMapper.updateByExample(customerCare, customerCareExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerCareService#updateByCustomerCareExampleSelective(com.crm.wcx.entity.CustomerCare, com.crm.wcx.entity.CustomerCareExample)
	 */
	@Override
	public boolean updateByCustomerCareExampleSelective(
			CustomerCare customerCare, CustomerCareExample customerCareExample) {
		// TODO Auto-generated method stub
		return customerCareMapper.updateByExampleSelective(customerCare, customerCareExample)>0 ?true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerCareService#updateCustomerCareByPrimaryKeySelective(com.crm.wcx.entity.CustomerCare)
	 */
	@Override
	public boolean updateCustomerCareByPrimaryKeySelective(
			CustomerCare customerCare) {
		// TODO Auto-generated method stub
		return customerCareMapper.updateByPrimaryKeySelective(customerCare)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerCareService#updateCustomerCareByPrimaryKey(com.crm.wcx.entity.CustomerCare)
	 */
	@Override
	public boolean updateCustomerCareByPrimaryKey(CustomerCare customerCare) {
		// TODO Auto-generated method stub
		return customerCareMapper.updateByPrimaryKey(customerCare)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerCareService#selectCustomerCareByManagerId(java.lang.Integer)
	 */
	@Override
	public List<CustomerCare> selectCustomerCareByManagerId(Integer id) {
		List<CustomerCare> customerCares;
        try {
            CustomerCareExample customerCareExample = new CustomerCareExample();
            if (id != null) {
                customerCareExample.createCriteria().andManagerIdEqualTo(id);
            }
            customerCares = customerCareMapper.selectByExample(customerCareExample);
            for (CustomerCare customerCare : customerCares) {
                //封装联系人对象
                Linkman linkman = linkmanMapper.selectByPrimaryKey(customerCare.getLinkmanId());
                //联系人对象里面再封装客户信息
                linkman.setCustomer(customerMapper.selectByPrimaryKey(linkman.getCustomerId()));
                customerCare.setLinkman(linkman);
                //根据客户经理ID查找用户
                User user = userMapper.selectByPrimaryKey(customerCare.getManagerId());
                //加密信息置空
                user.setPassword(null);
                user.setSalt(null);
                //封装客户经理对象
                customerCare.setManager(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return customerCares;
	}

}
