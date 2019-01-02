/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:06:11 
 */
package com.crm.wcx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.CustomerMapper;
import com.crm.wcx.dao.ServiceMapper;
import com.crm.wcx.dao.UserMapper;
import com.crm.wcx.entity.ServiceExample;
import com.crm.wcx.service.IServiceService;

/** 
 * @ClassName: ServiceServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:06:11  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class ServiceServiceImpl implements IServiceService {
	
	@Autowired
	private ServiceMapper serviceMapper;
	
	@Autowired
	private CustomerMapper customerMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceService#countByServiceExample(com.crm.wcx.entity.ServiceExample)
	 */
	@Override
	public long countByServiceExample(ServiceExample serviceExample) {
		return serviceMapper.countByExample(serviceExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceService#deleteByServiceExample(com.crm.wcx.entity.ServiceExample)
	 */
	@Override
	public boolean deleteByServiceExample(ServiceExample serviceExample) {
		return serviceMapper.deleteByExample(serviceExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public boolean deleteByPrimaryKey(Integer id) {
		return serviceMapper.deleteByPrimaryKey(id)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceService#insertService(com.crm.wcx.entity.Service)
	 */
	@Override
	public boolean insertService(com.crm.wcx.entity.Service service) {
		return serviceMapper.insert(service)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceService#insertSelective(com.crm.wcx.entity.Service)
	 */
	@Override
	public boolean insertSelective(com.crm.wcx.entity.Service service) {
		return serviceMapper.insertSelective(service)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceService#selectByServiceExample(com.crm.wcx.entity.ServiceExample)
	 */
	@Override
	public List<com.crm.wcx.entity.Service> selectByServiceExample(
			ServiceExample serviceExample) {
		 List<com.crm.wcx.entity.Service> services =  serviceMapper.selectByExample(serviceExample);
		    //进行数据的二次封装
		    for (com.crm.wcx.entity.Service service : services) {
		        if(service.getCreater() != null) {
		            service.setCreaterObject(userMapper.selectByPrimaryKey(service.getCreater()));
		        }
		        if(service.getHandler() != null) {
		            service.setHandlerObject(userMapper.selectByPrimaryKey(service.getHandler()));
		        }
		        if(service.getCustomerId() != null) {
		            service.setCustomer(customerMapper.selectByPrimaryKey(service.getCustomerId()));
		        }
	        }
		    return services;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceService#selectServiceByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public com.crm.wcx.entity.Service selectServiceByPrimaryKey(Integer id) {
		com.crm.wcx.entity.Service service = serviceMapper.selectByPrimaryKey(id);
	    if(service.getCreater() != null) {
            service.setCreaterObject(userMapper.selectByPrimaryKey(service.getCreater()));
        }
        if(service.getHandler() != null) {
            service.setHandlerObject(userMapper.selectByPrimaryKey(service.getHandler()));
        }
        if(service.getCustomerId() != null) {
            service.setCustomer(customerMapper.selectByPrimaryKey(service.getCustomerId()));
        }
        return service;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceService#updateByServiceExample(com.crm.wcx.entity.Service, com.crm.wcx.entity.ServiceExample)
	 */
	@Override
	public boolean updateByServiceExample(com.crm.wcx.entity.Service service,
			ServiceExample serviceExample) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceService#updateByServiceExampleSelective(com.crm.wcx.entity.Service, com.crm.wcx.entity.ServiceExample)
	 */
	@Override
	public boolean updateByServiceExampleSelective(
			com.crm.wcx.entity.Service service, ServiceExample serviceExample) {
		return serviceMapper.updateByExampleSelective(service, serviceExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceService#updateServiceByPrimaryKeySelective(com.crm.wcx.entity.Service)
	 */
	@Override
	public boolean updateServiceByPrimaryKeySelective(
			com.crm.wcx.entity.Service service) {
		return serviceMapper.updateByPrimaryKeySelective(service)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceService#updateServiceByPrimaryKey(com.crm.wcx.entity.Service)
	 */
	@Override
	public boolean updateServiceByPrimaryKey(com.crm.wcx.entity.Service service) {
		return serviceMapper.updateByPrimaryKey(service)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IServiceService#deleteServicesByPrimaryKey(java.lang.String)
	 */
	@Override
	public boolean deleteServicesByPrimaryKey(String ids) {
		boolean success;
        try {
            //先把ids字符串根据规则分割开
            String[] idsStrings = ids.split("-");
            for (String idString : idsStrings) {
                Integer id = Integer.parseInt(idString);
                com.crm.wcx.entity.Service service = new com.crm.wcx.entity.Service();
                service.setId(id);
                service.setDeleteStatus(1);
                //如果删除失败，则直接抛出异常
                if(serviceMapper.updateByPrimaryKeySelective(service) < 1){
                    throw new RuntimeException();
                }
            }
            success = true;
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return success;
	}

	
}
