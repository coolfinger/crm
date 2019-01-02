package com.crm.wcx.service;

import java.util.List;

import com.crm.wcx.entity.Log;
import com.crm.wcx.entity.LogExample;

/**
 * 
 * @ClassName: ILogService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午6:02:14
 */
public interface ILogService {

	/**
	 * 
	* @Title: countByLogExample 
	* @Description: 按照Example 统计记录总数 
	* @param logExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午6:02:49
	 */
	public long countByLogExample(LogExample logExample);

	/**
	 * 
	* @Title: deleteByLogExample 
	* @Description: 按照Example 删除Log 
	* @param logExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午6:02:59
	 */
	public boolean deleteByLogExample(LogExample logExample);

	/**
	 * 
	* @Title: deleteByPrimaryKey 
	* @Description: 按照Log主键id删除Log 
	* @param id
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午6:03:09
	 */
	public boolean deleteByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: insertLog 
	* @Description: 插入一条Log数据 如字段为空，则插入null 
	* @param log
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午6:03:21
	 */
	public boolean insertLog(Log log);
	
	/**
	 * 
	* @Title: insertSelective 
	* @Description: 插入一条Log数据，如字段为空，则插入数据库表字段的默认值 
	* @param log
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午6:03:35
	 */
	public boolean insertSelective(Log log);
	
	/**
	 * 
	* @Title: selectByLogExample 
	* @Description: 按照Example条件 模糊查询 
	* @param logExample
	* @return List<Log>
	* @author ColdFingers
	* @date 2018年11月8日下午6:03:50
	 */
	public List<Log> selectByLogExample(LogExample logExample);
	
	/**
	 * 
	* @Title: selectLogByPrimaryKey 
	* @Description: 按照Log 的id 查找 Log 
	* @param id
	* @return Log
	* @author ColdFingers
	* @date 2018年11月8日下午6:03:59
	 */
	public Log selectLogByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: updateByLogExample 
	* @Description: 更新Log对象中若有空则更新字段为null 
	* @param log
	* @param logExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午6:04:32
	 */
	public boolean updateByLogExample(Log log, LogExample logExample);
	
	/**
	 * 
	* @Title: updateByLogExampleSelective 
	* @Description: 更新Log 对象中若有空则不会更新此字段 
	* @param log
	* @param logExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午6:04:46
	 */
	public boolean updateByLogExampleSelective(Log log, LogExample logExample);
		
	/**
	 * 
	* @Title: updateLogByPrimaryKeySelective 
	* @Description: 按照Log id 更新Log象中如有空则不会更新此字段 
	* @param log
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午6:04:59
	 */
	public boolean updateLogByPrimaryKeySelective(Log log);
	
	/**
	 * 
	* @Title: updateLogByPrimaryKey 
	* @Description: 按照Log id 更新Log对象中如有空则更新此字段为null 
	* @param log
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午6:05:13
	 */
	public boolean updateLogByPrimaryKey(Log log);	
}
