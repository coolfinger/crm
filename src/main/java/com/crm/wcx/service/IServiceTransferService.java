package com.crm.wcx.service;

import java.util.List;

import com.crm.wcx.entity.ServiceTransfer;
import com.crm.wcx.entity.ServiceTransferExample;

/**
 * 
 * @ClassName: IServiceTransferService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午2:00:38
 */
public interface IServiceTransferService {

	/**
	 * 
	* @Title: countByServiceTransferExample 
	* @Description: 按照Example统计数量 
	* @param serviceTransferExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午2:01:05
	 */
	public long countByServiceTransferExample(ServiceTransferExample serviceTransferExample);

	/**
	 * 
	* @Title: deleteByServiceTransferExample 
	* @Description: 按照Example删除ServiceTransfer 
	* @param serviceTransferExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午2:01:30
	 */
	public boolean deleteByServiceTransferExample(ServiceTransferExample serviceTransferExample);
	
	/**
	 * 
	* @Title: deleteByPrimaryKey 
	* @Description: 按照ServiceTransfer主键id删除ServiceTransfer
	* @param id
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午2:02:40
	 */
	public boolean deleteByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: insertServiceTransfer 
	* @Description: 插入一条ServiceTransfer数据，如果为空则插入null 
	* @param serviceTransfer
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午2:04:15
	 */
	public boolean insertServiceTransfer(ServiceTransfer serviceTransfer);
	
	/**
	 * 
	* @Title: insertSelective 
	* @Description: 插入一条serviceTransfer数据，如果数据为空，则插入数据的默认值 
	* @param serviceTransfer
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午2:05:17
	 */
	public boolean insertSelective(ServiceTransfer serviceTransfer);
	
	/**
	 * 
	* @Title: selectByServiceTransferExample 
	* @Description: 根据Example查询 模糊查询 
	* @param serviceTransferExample
	* @return List<ServiceTransfer>
	* @author ColdFingers
	* @date 2018年11月8日下午2:07:03
	 */
	public List<ServiceTransfer> selectByServiceTransferExample(ServiceTransferExample serviceTransferExample);
	
	/**
	 * 
	* @Title: selectServiceTransferByPrimaryKey 
	* @Description: 根据Example主键id查询ServiceTransfer
	* @param id
	* @return ServiceTransfer
	* @author ColdFingers
	* @date 2018年11月8日下午2:07:51
	 */
	public ServiceTransfer selectServiceTransferByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: updateByServiceTransferExample 
	* @Description: 根据Example更改ServiceTransfer 
	* @param serviceTransfer 对象中若有空则更新字段为null
	* @param serviceTransferExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午2:08:40
	 */
	public boolean updateByServiceTransferExample(ServiceTransfer serviceTransfer, ServiceTransferExample serviceTransferExample);
	
	/**
	 * 
	* @Title: updateByServiceTransferExampleSelective 
	* @Description: 根据Example更改ServiceTransfer  
	* @param serviceTransfer 对象中若有空则不更新此字段
	* @param serviceTransferExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午2:09:19
	 */
	public boolean updateByServiceTransferExampleSelective(ServiceTransfer serviceTransfer, ServiceTransferExample serviceTransferExample);
	
	/**
	 * 
	* @Title: updateServiceTransferByPrimaryKeySelective 
	* @Description: 根据ServiceTransfer主键id更改ServiceTransfer 
	* @param serviceTransfer 对象中若有空则不更新此字段
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午2:11:19
	 */
	public boolean updateServiceTransferByPrimaryKeySelective(ServiceTransfer serviceTransfer);
	
	/**
	 * 
	* @Title: updateServiceTransferByPrimaryKey 
	* @Description: 根据ServiceTransfer主键id更改ServiceTransfer 
	* @param serviceTransfer 若对象中有空则更新为null
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午2:12:43
	 */
	public boolean updateServiceTransferByPrimaryKey(ServiceTransfer serviceTransfer);
}
