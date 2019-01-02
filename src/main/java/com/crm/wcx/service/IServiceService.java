package com.crm.wcx.service;

import java.util.List;

import com.crm.wcx.entity.Service;
import com.crm.wcx.entity.ServiceExample;

/**
 * 
 * @ClassName: IServiceService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午2:13:55
 */
public interface IServiceService {

	/**
	 * 
	* @Title: countByServiceExample 
	* @Description:按照Example统计记录总数 
	* @param serviceExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午2:25:44
	 */
	public long countByServiceExample(ServiceExample serviceExample);
	
	/**
	 * 
	* @Title: deleteByServiceExample 
	* @Description: 根据Example删除记录 
	* @param serviceExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午2:26:26
	 */
	public boolean deleteByServiceExample(ServiceExample serviceExample);
	
	/**
	 * 
	* @Title: deleteByPrimaryKey 
	* @Description: 根据主键id删除记录 
	* @param id
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午2:27:01
	 */
	public boolean deleteByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: insertService 
	* @Description: 插入一条Service 字段为空插入null
	* @param service
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午2:27:26
	 */
	public boolean insertService(Service service);
	
	/**
	 * 
	* @Title: insertSelective 
	* @Description: 插入一条Service数据 字段为空则插入默认值 
	* @param service
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午2:27:48
	 */
	public boolean insertSelective(Service service);
	
	/**
	 * 
	* @Title: selectByServiceExample 
	* @Description: 根据Example查询Service  模糊查询
	* @param serviceExample
	* @return List<Service>
	* @author ColdFingers
	* @date 2018年11月8日下午2:29:25
	 */
	public List<Service> selectByServiceExample(ServiceExample serviceExample);
	
	/**
	 * 
	* @Title: selectServiceByPrimaryKey 
	* @Description: 根据主键id查询Service 
	* @param id
	* @return Service
	* @author ColdFingers
	* @date 2018年11月8日下午2:30:04
	 */
	public Service selectServiceByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: updateByServiceExample 
	* @Description: 根据Example更改Service 如果字段为空 则更改为null
	* @param service
	* @param serviceExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午2:30:32
	 */
	public boolean updateByServiceExample(Service service, ServiceExample serviceExample);
	
	/**
	 * 
	* @Title: updateByServiceExampleSelective 
	* @Description: 更新Service 如果字段为空则不会更新此字段 
	* @param service
	* @param serviceExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午2:32:43
	 */
	public boolean updateByServiceExampleSelective(Service service, ServiceExample serviceExample);
	
	/**
	 * 
	* @Title: updateServiceByPrimaryKeySelective 
	* @Description: 根据Service id 更新Service 如果对象中有空则不会更新此字段 
	* @param service
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午2:33:25
	 */
	public boolean updateServiceByPrimaryKeySelective(Service service);
	
	/**
	 * 
	* @Title: updateServiceByPrimaryKey 
	* @Description: 根据主键id更新Service 对象中有空则更新字段为null 
	* @param service
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午2:34:26
	 */
	public boolean updateServiceByPrimaryKey(Service service);
	
	/**
	 * 
	* @Title: deleteServicesByPrimaryKey 
	* @Description: 批量删除 
	* @param ids
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午2:35:29
	 */
	public boolean deleteServicesByPrimaryKey(String ids);
}
