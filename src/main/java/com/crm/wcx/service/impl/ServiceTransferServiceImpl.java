/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:05:16 
 */
package com.crm.wcx.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.ServiceMapper;
import com.crm.wcx.dao.ServiceTransferMapper;
import com.crm.wcx.dao.UserMapper;
import com.crm.wcx.entity.ServiceTransfer;
import com.crm.wcx.entity.ServiceTransferExample;
import com.crm.wcx.service.IServiceTransferService;

/** 
 * @ClassName: ServiceTransferServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:05:16  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class ServiceTransferServiceImpl implements IServiceTransferService {

	@Autowired
	private ServiceTransferMapper serviceTransferMapper;
	
	@Autowired
	private ServiceMapper serviceMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceTransferService#countByServiceTransferExample(com.crm.wcx.entity.ServiceTransferExample)
	 */
	@Override
	public long countByServiceTransferExample(
			ServiceTransferExample serviceTransferExample) {
		
		return serviceTransferMapper.countByExample(serviceTransferExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceTransferService#deleteByServiceTransferExample(com.crm.wcx.entity.ServiceTransferExample)
	 */
	@Override
	public boolean deleteByServiceTransferExample(
			ServiceTransferExample serviceTransferExample) {
		return serviceTransferMapper.deleteByExample(serviceTransferExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceTransferService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public boolean deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return serviceTransferMapper.deleteByPrimaryKey(id)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceTransferService#insertServiceTransfer(com.crm.wcx.entity.ServiceTransfer)
	 */
	@Override
	public boolean insertServiceTransfer(ServiceTransfer serviceTransfer) {
		  boolean success = false;
		    try {
		        //插入新的服务转移记录，同时更新服务数据的处理人
		        serviceTransfer.setTime(LocalDateTime.now());
		        com.crm.wcx.entity.Service service = new com.crm.wcx.entity.Service();
		        service.setId(serviceTransfer.getServiceId());
		        service.setHandler(serviceTransfer.getNewManagerId());
		        serviceTransferMapper.insert(serviceTransfer);
		        serviceMapper.updateByPrimaryKeySelective(service);
		        success = true;
	        } catch (Exception e) {
	            throw new RuntimeException();
	        }  
			return success;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceTransferService#insertSelective(com.crm.wcx.entity.ServiceTransfer)
	 */
	@Override
	public boolean insertSelective(ServiceTransfer serviceTransfer) {
		return serviceTransferMapper.insertSelective(serviceTransfer)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceTransferService#selectByServiceTransferExample(com.crm.wcx.entity.ServiceTransferExample)
	 */
	@Override
	public List<ServiceTransfer> selectByServiceTransferExample(
			ServiceTransferExample serviceTransferExample) {
		List<ServiceTransfer> serviceTransfers = serviceTransferMapper.selectByExample(serviceTransferExample);
        //对数据进行二次封装
		for (ServiceTransfer serviceTransfer : serviceTransfers) {
		   serviceTransfer.setOldManager(userMapper.selectByPrimaryKey(serviceTransfer.getOldManagerId()));
		   serviceTransfer.setNewManager(userMapper.selectByPrimaryKey(serviceTransfer.getNewManagerId()));
        }
		return serviceTransfers;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceTransferService#selectServiceTransferByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public ServiceTransfer selectServiceTransferByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return serviceTransferMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceTransferService#updateByServiceTransferExample(com.crm.wcx.entity.ServiceTransfer, com.crm.wcx.entity.ServiceTransferExample)
	 */
	@Override
	public boolean updateByServiceTransferExample(
			ServiceTransfer serviceTransfer,
			ServiceTransferExample serviceTransferExample) {
		return serviceTransferMapper.updateByExampleSelective(serviceTransfer, serviceTransferExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceTransferService#updateByServiceTransferExampleSelective(com.crm.wcx.entity.ServiceTransfer, com.crm.wcx.entity.ServiceTransferExample)
	 */
	@Override
	public boolean updateByServiceTransferExampleSelective(
			ServiceTransfer serviceTransfer,
			ServiceTransferExample serviceTransferExample) {
		return serviceTransferMapper.updateByExample(serviceTransfer, serviceTransferExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceTransferService#updateServiceTransferByPrimaryKeySelective(com.crm.wcx.entity.ServiceTransfer)
	 */
	@Override
	public boolean updateServiceTransferByPrimaryKeySelective(
			ServiceTransfer serviceTransfer) {
		return serviceTransferMapper.updateByPrimaryKeySelective(serviceTransfer)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceTransferService#updateServiceTransferByPrimaryKey(com.crm.wcx.entity.ServiceTransfer)
	 */
	@Override
	public boolean updateServiceTransferByPrimaryKey(
			ServiceTransfer serviceTransfer) {
		return serviceTransferMapper.updateByPrimaryKey(serviceTransfer)>0 ? true:false;
	}

}
