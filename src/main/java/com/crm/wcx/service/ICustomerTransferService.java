package com.crm.wcx.service;

import java.util.List;

import com.crm.wcx.entity.CustomerTransfer;
import com.crm.wcx.entity.CustomerTransferExample;

/**
 * 
 * @ClassName: ICustomerTransferService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午7:26:12
 */
public interface ICustomerTransferService {

	/**
	 * 
	* @Title: countByCustomerTransferExample 
	* @Description: 按照Example 统计记录总数 
	* @param customerTransferExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午7:29:14
	 */
	public long countByCustomerTransferExample(CustomerTransferExample customerTransferExample);

	/**
	 * 
	* @Title: deleteByCustomerTransferExample 
	* @Description: 按照Example 删除CustomerTransfer 
	* @param customerTransferExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:29:30
	 */
	public boolean deleteByCustomerTransferExample(CustomerTransferExample customerTransferExample);

	/**
	 * 
	* @Title: deleteByPrimaryKey 
	* @Description: 按照CustomerTransfer主键id删除CustomerTransfer 
	* @param id
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:29:42
	 */
	public boolean deleteByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: insertCustomerTransfer 
	* @Description: 插入一条CustomerTransfer数据 如字段为空，则插入null 
	* @param customerTransfer
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:29:58
	 */
	public boolean insertCustomerTransfer(CustomerTransfer customerTransfer);
	
	/**
	 * 
	* @Title: insertSelective 
	* @Description: 插入一条CustomerTransfer数据，如字段为空，则插入数据库表字段的默认值 
	* @param customerTransfer
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:30:08
	 */
	public boolean insertSelective(CustomerTransfer customerTransfer);
	
	/**
	 * 
	* @Title: selectByCustomerTransferExample 
	* @Description: 按照Example条件 模糊查询 
	* @param customerTransferExample
	* @return List<CustomerTransfer>
	* @author ColdFingers
	* @date 2018年11月8日下午7:30:25
	 */
	public List<CustomerTransfer> selectByCustomerTransferExample(CustomerTransferExample customerTransferExample);
	
	/**
	 * 
	* @Title: selectCustomerTransferByPrimaryKey 
	* @Description: 按照CustomerTransfer 的id 查找 CustomerTransfer 
	* @param id
	* @return CustomerTransfer
	* @author ColdFingers
	* @date 2018年11月8日下午7:30:45
	 */
	public CustomerTransfer selectCustomerTransferByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: updateByCustomerTransferExample 
	* @Description: 更新CustomerTransfer对象中若有空则更新字段为null 
	* @param customerTransfer
	* @param customerTransferExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:31:06
	 */
	public boolean updateByCustomerTransferExample(CustomerTransfer customerTransfer, CustomerTransferExample customerTransferExample);
	
	/**
	 * 
	* @Title: updateByCustomerTransferExampleSelective 
	* @Description: 更新CustomerTransfer 对象中若有空则不会更新此字段 
	* @param customerTransfer
	* @param customerTransferExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:31:19
	 */
	public boolean updateByCustomerTransferExampleSelective(CustomerTransfer customerTransfer, CustomerTransferExample customerTransferExample);
		
	/**
	 * 
	* @Title: updateCustomerTransferByPrimaryKeySelective 
	* @Description: 按照CustomerTransfer id 更新CustomerTransfer对象中如有空则不会更新此字段 
	* @param customerTransfer
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:31:31
	 */
	public boolean updateCustomerTransferByPrimaryKeySelective(CustomerTransfer customerTransfer);
	
	/**
	 * 
	* @Title: updateCustomerTransferByPrimaryKey 
	* @Description: 按照CustomerTransfer id 更新CustomerTransfer对象中如有空则更新此字段为null 
	* @param customerTransfer
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:31:42
	 */
	public boolean updateCustomerTransferByPrimaryKey(CustomerTransfer customerTransfer);	
}
