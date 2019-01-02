/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:10:47 
 */
package com.crm.wcx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.LogMapper;
import com.crm.wcx.entity.Log;
import com.crm.wcx.entity.LogExample;
import com.crm.wcx.service.ILogService;

/** 
 * @ClassName: LogServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:10:47  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class LogServiceImpl implements ILogService {

	@Autowired
	private LogMapper logMapper;
	
	
	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILogService#countByLogExample(com.crm.wcx.entity.LogExample)
	 */
	@Override
	public long countByLogExample(LogExample logExample) {
		// TODO Auto-generated method stub
		return logMapper.countByExample(logExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILogService#deleteByLogExample(com.crm.wcx.entity.LogExample)
	 */
	@Override
	public boolean deleteByLogExample(LogExample logExample) {
		// TODO Auto-generated method stub
		return logMapper.deleteByExample(logExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILogService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public boolean deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return logMapper.deleteByPrimaryKey(id)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILogService#insertLog(com.crm.wcx.entity.Log)
	 */
	@Override
	public boolean insertLog(Log log) {
		// TODO Auto-generated method stub
		return logMapper.insert(log)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILogService#insertSelective(com.crm.wcx.entity.Log)
	 */
	@Override
	public boolean insertSelective(Log log) {
		// TODO Auto-generated method stub
		return logMapper.insertSelective(log)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILogService#selectByLogExample(com.crm.wcx.entity.LogExample)
	 */
	@Override
	public List<Log> selectByLogExample(LogExample logExample) {
		// TODO Auto-generated method stub
		return logMapper.selectByExample(logExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILogService#selectLogByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public Log selectLogByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return logMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILogService#updateByLogExample(com.crm.wcx.entity.Log, com.crm.wcx.entity.LogExample)
	 */
	@Override
	public boolean updateByLogExample(Log log, LogExample logExample) {
		// TODO Auto-generated method stub
		return logMapper.updateByExample(log, logExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILogService#updateByLogExampleSelective(com.crm.wcx.entity.Log, com.crm.wcx.entity.LogExample)
	 */
	@Override
	public boolean updateByLogExampleSelective(Log log, LogExample logExample) {
		// TODO Auto-generated method stub
		return logMapper.updateByExampleSelective(log, logExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILogService#updateLogByPrimaryKeySelective(com.crm.wcx.entity.Log)
	 */
	@Override
	public boolean updateLogByPrimaryKeySelective(Log log) {
		// TODO Auto-generated method stub
		return logMapper.updateByPrimaryKeySelective(log)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.ILogService#updateLogByPrimaryKey(com.crm.wcx.entity.Log)
	 */
	@Override
	public boolean updateLogByPrimaryKey(Log log) {
		// TODO Auto-generated method stub
		return logMapper.updateByPrimaryKey(log)>0 ? true:false;
	}

}
