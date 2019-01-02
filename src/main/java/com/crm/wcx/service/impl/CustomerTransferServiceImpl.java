/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:14:20 
 */
package com.crm.wcx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.CustomerTransferMapper;
import com.crm.wcx.entity.CustomerTransfer;
import com.crm.wcx.entity.CustomerTransferExample;
import com.crm.wcx.service.ICustomerTransferService;

/** 
 * @ClassName: CustomerTransferServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:14:20  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class CustomerTransferServiceImpl implements ICustomerTransferService {

	@Autowired
	private CustomerTransferMapper customerTransferMapper;
	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerTransferService#countByCustomerTransferExample(com.crm.wcx.entity.CustomerTransferExample)
	 */
	@Override
	public long countByCustomerTransferExample(
			CustomerTransferExample customerTransferExample) {
		// TODO Auto-generated method stub
		return customerTransferMapper.countByExample(customerTransferExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerTransferService#deleteByCustomerTransferExample(com.crm.wcx.entity.CustomerTransferExample)
	 */
	@Override
	public boolean deleteByCustomerTransferExample(
			CustomerTransferExample customerTransferExample) {
		// TODO Auto-generated method stub
		return customerTransferMapper.deleteByExample(customerTransferExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerTransferService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public boolean deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return customerTransferMapper.deleteByPrimaryKey(id)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerTransferService#insertCustomerTransfer(com.crm.wcx.entity.CustomerTransfer)
	 */
	@Override
	public boolean insertCustomerTransfer(CustomerTransfer customerTransfer) {
		// TODO Auto-generated method stub
		return customerTransferMapper.insert(customerTransfer)>0 ?true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerTransferService#insertSelective(com.crm.wcx.entity.CustomerTransfer)
	 */
	@Override
	public boolean insertSelective(CustomerTransfer customerTransfer) {
		// TODO Auto-generated method stub
		return customerTransferMapper.insertSelective(customerTransfer)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerTransferService#selectByCustomerTransferExample(com.crm.wcx.entity.CustomerTransferExample)
	 */
	@Override
	public List<CustomerTransfer> selectByCustomerTransferExample(
			CustomerTransferExample customerTransferExample) {
		// TODO Auto-generated method stub
		return customerTransferMapper.selectByExample(customerTransferExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerTransferService#selectCustomerTransferByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public CustomerTransfer selectCustomerTransferByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return customerTransferMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerTransferService#updateByCustomerTransferExample(com.crm.wcx.entity.CustomerTransfer, com.crm.wcx.entity.CustomerTransferExample)
	 */
	@Override
	public boolean updateByCustomerTransferExample(
			CustomerTransfer customerTransfer,
			CustomerTransferExample customerTransferExample) {
		// TODO Auto-generated method stub
		return customerTransferMapper.updateByExample(customerTransfer, customerTransferExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerTransferService#updateByCustomerTransferExampleSelective(com.crm.wcx.entity.CustomerTransfer, com.crm.wcx.entity.CustomerTransferExample)
	 */
	@Override
	public boolean updateByCustomerTransferExampleSelective(
			CustomerTransfer customerTransfer,
			CustomerTransferExample customerTransferExample) {
		// TODO Auto-generated method stub
		return customerTransferMapper.updateByExampleSelective(customerTransfer, customerTransferExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerTransferService#updateCustomerTransferByPrimaryKeySelective(com.crm.wcx.entity.CustomerTransfer)
	 */
	@Override
	public boolean updateCustomerTransferByPrimaryKeySelective(
			CustomerTransfer customerTransfer) {
		// TODO Auto-generated method stub
		return customerTransferMapper.updateByPrimaryKeySelective(customerTransfer)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ICustomerTransferService#updateCustomerTransferByPrimaryKey(com.crm.wcx.entity.CustomerTransfer)
	 */
	@Override
	public boolean updateCustomerTransferByPrimaryKey(
			CustomerTransfer customerTransfer) {
		// TODO Auto-generated method stub
		return customerTransferMapper.updateByPrimaryKey(customerTransfer)>0 ? true:false;
	}

}
