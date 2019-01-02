package com.crm.wcx.service;

import java.util.List;

import org.hyperic.sigar.pager.Pager;

import com.crm.wcx.entity.LoggingEvent;
import com.crm.wcx.entity.LoggingEventExample;

/**
 * 
 * @ClassName: ILoggingEventService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午6:11:24
 */
public interface ILoggingEventService {

	/**
	 * 
	* @Title: countByLoggingEventExample 
	* @Description: 按照Example 统计记录总数 
	* @param loggingEventExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午7:10:07
	 */
	public long countByLoggingEventExample(LoggingEventExample loggingEventExample);
	
	/**
	 * 
	* @Title: deleteByLoggingEventExample 
	* @Description: 按照Example 删除LoggingEvent 
	* @param loggingEventExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:10:17
	 */
	public boolean deleteByLoggingEventExample(LoggingEventExample loggingEventExample);
	
	/**
	 * 
	* @Title: deleteByPrimaryKey 
	* @Description: 按照LoggingEvent主键id删除LoggingEvent 
	* @param id
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:10:25
	 */
	public boolean deleteByPrimaryKey(Long id);
	
	/**
	 * 
	* @Title: insertLoggingEvent 
	* @Description: 插入一条LoggingEvent数据 如字段为空，则插入null 
	* @param loggingEvent
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:10:34
	 */
	public boolean insertLoggingEvent(LoggingEvent loggingEvent);
	
	/**
	 * 
	* @Title: insertSelective 
	* @Description: 插入一条LoggingEvent数据，如字段为空，则插入数据库表字段的默认值 
	* @param loggingEvent
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:10:43
	 */
	public boolean insertSelective(LoggingEvent loggingEvent);
	
	/**
	 * 
	* @Title: selectByLoggingEventExample 
	* @Description: 按照Example 条件 模糊查询 
	* @param loggingEventExample
	* @param pager
	* @return List<LoggingEvent>
	* @author ColdFingers
	* @date 2018年11月8日下午7:10:52
	 */
	public List<LoggingEvent> selectByLoggingEventExample(LoggingEventExample loggingEventExample, com.crm.wcx.entity.Pager pager);
	
	/**
	 * 
	* @Title: selectLoggingEventByPrimaryKey 
	* @Description: 按照LoggingEvent 的id 查找 LoggingEvent 
	* @param id
	* @return LoggingEvent
	* @author ColdFingers
	* @date 2018年11月8日下午7:11:02
	 */
	public LoggingEvent selectLoggingEventByPrimaryKey(Long id);
	
	/**
	 * 
	* @Title: updateByLoggingEventExampleSelective 
	* @Description: 更新LoggingEvent ， LoggingEvent对象中若有空则不会更新此字段  LoggingEventExample为where条件 
	* @param loggingEvent
	* @param loggingEventExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:11:13
	 */
	public boolean updateByLoggingEventExampleSelective(LoggingEvent loggingEvent, LoggingEventExample loggingEventExample);
	
	/**
	 * 
	* @Title: updateByLoggingEventExample 
	* @Description: 更新LoggingEvent， LoggingEvent对象中若有空则更新字段为null   LoggingEventExample为where条件 
	* @param loggingEvent
	* @param loggingEventExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:11:30
	 */
	public boolean updateByLoggingEventExample(LoggingEvent loggingEvent, LoggingEventExample loggingEventExample);
	
	/**
	 * 
	* @Title: updateLoggingEventByPrimaryKeySelective 
	* @Description: 按照LoggingEvent id 更新LoggingEvent  LoggingEvent对象中如有空则不会更新此字段 
	* @param loggingEvent
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:11:44
	 */
	public boolean updateLoggingEventByPrimaryKeySelective(LoggingEvent loggingEvent);
	
	/**
	 * 
	* @Title: updateLoggingEventByPrimaryKey 
	* @Description: 按照LoggingEvent id 更新LoggingEvent  LoggingEvent对象中如有空则更新此字段为null 
	* @param loggingEvent
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:11:53
	 */
	public boolean updateLoggingEventByPrimaryKey(LoggingEvent loggingEvent);
	
	/**
	 * 
	* @Title: insertLog 
	* @Description: 插入log 
	* @param loggingEvent
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:12:43
	 */
	public boolean insertLog(LoggingEvent loggingEvent);
}
