package com.crm.wcx.service;

import java.util.List;
import java.util.Map;

import com.crm.wcx.entity.Report;

/**
 * 
 * @ClassName: IReportService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午4:54:38
 */
public interface IReportService {

	/**
	 * 
	* @Title: countCustomerIncrease 
	* @Description: 统计公司新增的客户量 近n天的记录 
	* @param n
	* @return List<Map<String,Object>>
	* @author ColdFingers
	* @date 2018年11月8日下午4:56:01
	 */
	public List<Map<String, Object>> countCustomerIncrease(int n);
	
	/**
	 * 
	* @Title: countCustomerDecrease 
	* @Description: 统计公司损失的客户量  近n天的记录 
	* @param n
	* @return List<Map<String,Object>>
	* @author ColdFingers
	* @date 2018年11月8日下午4:56:56
	 */
	public List<Map<String, Object>> countCustomerDecrease(int n);
	
	/**
	 * 
	* @Title: countCustomerByYear 
	* @Description:统计这一年公司新增的客户
	* @param year
	* @param userId
	* @return List<Map<String,Object>>
	* @author ColdFingers
	* @date 2018年11月8日下午4:57:50
	 */
	public List<Map<String, Object>> countCustomerByYear(String year,Integer userId);
	
	/**
	 * 
	* @Title: countCustomerByMonth 
	* @Description: 按照月份统计公司新增的客户 
	* @param year
	* @param userId
	* @return List<Map<String,Object>>
	* @author ColdFingers
	* @date 2018年11月8日下午4:58:28
	 */
	public List<Map<String, Object>> countCustomerByMonth(String year,Integer userId);
	
	/**
	 * 
	* @Title: countCustomerByDay 
	* @Description: 统计这个月每天新增的客户 
	* @param yearMonth
	* @param userId
	* @return List<Map<String,Object>>
	* @author ColdFingers
	* @date 2018年11月8日下午4:59:01
	 */
	public List<Map<String, Object>> countCustomerByDay(String yearMonth,Integer userId);
	
	/**
	 * 
	* @Title: countFollowUpByYear 
	* @Description: 统计这一年的跟踪记录 
	* @param year
	* @param userId
	* @return List<Map<String,Object>>
	* @author ColdFingers
	* @date 2018年11月8日下午4:59:26
	 */
    public List<Map<String, Object>> countFollowUpByYear(String year,Integer userId);
    
    /**
     * 
    * @Title: countFollowUpByMonth 
    * @Description: 按照月份统计跟踪记录 
    * @param year
    * @param userId
    * @return List<Map<String,Object>>
    * @author ColdFingers
    * @date 2018年11月8日下午4:59:48
     */
    public List<Map<String, Object>> countFollowUpByMonth(String year,Integer userId);
    

    /**
     * 
    * @Title: countFollowUpByDay 
    * @Description: 统计这个月每天的跟踪记录 
    * @param yearMonth
    * @param userId
    * @return List<Map<String,Object>>
    * @author ColdFingers
    * @date 2018年11月8日下午5:00:21
     */
    public List<Map<String, Object>> countFollowUpByDay(String yearMonth,Integer userId);
	
    
    /**
     * 按照分类统计这一年的新增客户
    * @Title: countCustomerByCategoryWithYear 
    * @Description: TODO 
    * @param category
    * @param year
    * @param userId
    * @return List<Map<String,Object>>
    * @author ColdFingers
    * @date 2018年11月8日下午5:00:44
     */
    public List<Map<String, Object>> countCustomerByCategoryWithYear(String category,String year,Integer userId);

    /**
     * 
    * @Title: countCustomerByCategoryWithMonth 
    * @Description: 按照分类统计这一个月的跟踪记录 
    * @param category
    * @param yearMonth
    * @param userId
    * @return List<Map<String,Object>>
    * @author ColdFingers
    * @date 2018年11月8日下午5:01:11
     */
    public List<Map<String, Object>> countCustomerByCategoryWithMonth(String category,String yearMonth,Integer userId);

   /**
    * 
   * @Title: countCustomerByCategoryWithDay 
   * @Description: 按照分类统计这一天的跟踪记录 
   * @param category
   * @param yearMonthDay
   * @param userId
   * @return List<Map<String,Object>>
   * @author ColdFingers
   * @date 2018年11月8日下午5:01:49
    */
    public List<Map<String, Object>> countCustomerByCategoryWithDay(String category,String yearMonthDay,Integer userId);
    
   /**
    * 
   * @Title: countManagerService 
   * @Description: 按照某个分类某一天某个经理服务的客户数量 
   * @param service
   * @param day
   * @param userId
   * @return List<Map<String,Object>>
   * @author ColdFingers
   * @date 2018年11月8日下午5:02:20
    */
    public List<Map<String, Object>> countManagerService(String service, Integer day, Integer userId);
    
    /**
     * 
    * @Title: countAllManagerService 
    * @Description: 按照某个分类和日期统计全部客户经理的服务信息 
    * @param service
    * @param day
    * @return Map<String,Object>
    * @author ColdFingers
    * @date 2018年11月8日下午5:03:02
     */
    public Map<String, Object> countAllManagerService(String service, Integer day);
    
    /**
     * 
    * @Title: countManagerCustomerRank 
    * @Description: 统计某时段内客户经理客户量的排名 
    * @param report
    * @return List<Map<String,Object>>
    * @author ColdFingers
    * @date 2018年11月8日下午5:03:19
     */
    public List<Map<String, Object>> countManagerCustomerRank(Report report);

    /**
     * 
    * @Title: customerOrderPriceRank 
    * @Description: 统计某时段内客户与公司成交的金额数排名 
    * @param report
    * @return List<Map<String,Object>>
    * @author ColdFingers
    * @date 2018年11月8日下午5:03:34
     */
    public List<Map<String, Object>> customerOrderPriceRank(Report report);
    
    /**
     * 
    * @Title: countCustomerSource 
    * @Description: 统计公司的客户来源情况 
    * @return List<Map<String,Object>>
    * @author ColdFingers
    * @date 2018年11月8日下午5:03:49
     */
	public List<Map<String, Object>> countCustomerSource();
}
