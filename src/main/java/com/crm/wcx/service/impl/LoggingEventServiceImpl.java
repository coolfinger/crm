/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:11:48 
 */
package com.crm.wcx.service.impl;

import java.util.List;

import org.hyperic.sigar.pager.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.LoggingEventMapper;
import com.crm.wcx.entity.LoggingEvent;
import com.crm.wcx.entity.LoggingEventExample;
import com.crm.wcx.service.ILoggingEventService;

/** 
 * @ClassName: LoggingEventServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:11:48  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class LoggingEventServiceImpl implements ILoggingEventService {

	@Autowired
	private LoggingEventMapper loggingEventMapper;
	
	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILoggingEventService#countByLoggingEventExample(com.crm.wcx.entity.LoggingEventExample)
	 */
	@Override
	public long countByLoggingEventExample(
			LoggingEventExample loggingEventExample) {
		// TODO Auto-generated method stub
		return loggingEventMapper.countByExample(loggingEventExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILoggingEventService#deleteByLoggingEventExample(com.crm.wcx.entity.LoggingEventExample)
	 */
	@Override
	public boolean deleteByLoggingEventExample(
			LoggingEventExample loggingEventExample) {
		// TODO Auto-generated method stub
		return loggingEventMapper.deleteByExample(loggingEventExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILoggingEventService#deleteByPrimaryKey(java.lang.Long)
	 */
	@Override
	public boolean deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return loggingEventMapper.deleteByPrimaryKey(id)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILoggingEventService#insertLoggingEvent(com.crm.wcx.entity.LoggingEvent)
	 */
	@Override
	public boolean insertLoggingEvent(LoggingEvent loggingEvent) {
		// TODO Auto-generated method stub
		return loggingEventMapper.insertLog(loggingEvent)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILoggingEventService#insertSelective(com.crm.wcx.entity.LoggingEvent)
	 */
	@Override
	public boolean insertSelective(LoggingEvent loggingEvent) {
		// TODO Auto-generated method stub
		return loggingEventMapper.insertSelective(loggingEvent)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILoggingEventService#selectByLoggingEventExample(com.crm.wcx.entity.LoggingEventExample, org.hyperic.sigar.pager.Pager)
	 */
	@Override
	public List<LoggingEvent> selectByLoggingEventExample(
			LoggingEventExample loggingEventExample, com.crm.wcx.entity.Pager pager) {
		// TODO Auto-generated method stub
		return loggingEventMapper.selectByExample(loggingEventExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILoggingEventService#selectLoggingEventByPrimaryKey(java.lang.Long)
	 */
	@Override
	public LoggingEvent selectLoggingEventByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return loggingEventMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILoggingEventService#updateByLoggingEventExampleSelective(com.crm.wcx.entity.LoggingEvent, com.crm.wcx.entity.LoggingEventExample)
	 */
	@Override
	public boolean updateByLoggingEventExampleSelective(
			LoggingEvent loggingEvent, LoggingEventExample loggingEventExample) {
		// TODO Auto-generated method stub
		return loggingEventMapper.updateByExampleSelective(loggingEvent, loggingEventExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILoggingEventService#updateByLoggingEventExample(com.crm.wcx.entity.LoggingEvent, com.crm.wcx.entity.LoggingEventExample)
	 */
	@Override
	public boolean updateByLoggingEventExample(LoggingEvent loggingEvent,
			LoggingEventExample loggingEventExample) {
		// TODO Auto-generated method stub
		return loggingEventMapper.updateByExample(loggingEvent, loggingEventExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILoggingEventService#updateLoggingEventByPrimaryKeySelective(com.crm.wcx.entity.LoggingEvent)
	 */
	@Override
	public boolean updateLoggingEventByPrimaryKeySelective(
			LoggingEvent loggingEvent) {
		// TODO Auto-generated method stub
		return loggingEventMapper.updateByPrimaryKeySelective(loggingEvent)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILoggingEventService#updateLoggingEventByPrimaryKey(com.crm.wcx.entity.LoggingEvent)
	 */
	@Override
	public boolean updateLoggingEventByPrimaryKey(LoggingEvent loggingEvent) {
		// TODO Auto-generated method stub
		return loggingEventMapper.updateByPrimaryKey(loggingEvent)>0 ?true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILoggingEventService#insertLog(com.crm.wcx.entity.LoggingEvent)
	 */
	@Override
	public boolean insertLog(LoggingEvent loggingEvent) {
		// TODO Auto-generated method stub
		return loggingEventMapper.insert(loggingEvent)>0 ? true:false;
	}


}
