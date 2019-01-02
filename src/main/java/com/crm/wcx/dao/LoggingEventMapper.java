package com.crm.wcx.dao;



import java.util.List;

import com.crm.wcx.entity.LoggingEvent;
import com.crm.wcx.entity.LoggingEventExample;

/**
 * LoggingEventMapper继承基类
 * @author MybatisGenerator
 */
public interface LoggingEventMapper extends MyBatisBaseDao<LoggingEvent, Long, LoggingEventExample> {
	
	/**
	 * 描述：
	    * @Title: selectByExampleWithBLOBs
	    * @Description: TODO(查询含有text文本类型的结果集)
	    * @param @param loggingEventExample
	    * @param @return    参数
	    * @return List<LoggingEvent>    返回类型
	    * @throws
	    * @author huangqingwen
	 */
	public List<LoggingEvent> selectByExampleWithBLOBs(LoggingEventExample loggingEventExample);
	
	public int insertLog(LoggingEvent loggingEvent);
}