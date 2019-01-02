package com.crm.wcx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.wcx.entity.CustomerLoss;
import com.crm.wcx.entity.CustomerLossExample;
import com.crm.wcx.entity.Orders;

/**
 * CustomerLossMapper继承基类
 * @author MybatisGenerator
 */
public interface CustomerLossMapper extends MyBatisBaseDao<CustomerLoss, Integer, CustomerLossExample> {
	
	/**
	* 描述：
    * @Title: insertLossBatch
    * @Description: TODO(批量插入)
    * @param @param orders
    * @param @return    参数
    * @return int    返回类型
    * @throws
    * @author huangqingwen
	*/
	public int insertLossBatch(@Param("orders")List<Orders> orders);
}