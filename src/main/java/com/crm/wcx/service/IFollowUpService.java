package com.crm.wcx.service;

import java.util.List;

import com.crm.wcx.entity.FollowUp;
import com.crm.wcx.entity.FollowUpExample;

/**
 * 
 * @ClassName: IFollowUpService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午7:17:05
 */
public interface IFollowUpService {

	/**
	 * 
	* @Title: countByFollowUpExample 
	* @Description: 按照Example 统计记录总数 
	* @param followUpExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午7:17:44
	 */
	public long countByFollowUpExample(FollowUpExample followUpExample);

	/**
	 * 
	* @Title: deleteByFollowUpExample 
	* @Description: 按照Example 删除FollowUp 
	* @param followUpExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:17:55
	 */
	public boolean deleteByFollowUpExample(FollowUpExample followUpExample);

	/**
	 * 
	* @Title: deleteByPrimaryKey 
	* @Description: 按照FollowUp主键id删除FollowUp 
	* @param id
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:18:04
	 */
	public boolean deleteByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: insertFollowUp 
	* @Description: 插入一条FollowUp数据 如字段为空，则插入null 
	* @param followUp
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:18:14
	 */
	public boolean insertFollowUp(FollowUp followUp);
	
	/**
	 * 
	* @Title: insertSelective 
	* @Description: 插入一条FollowUp数据，如字段为空，则插入数据库表字段的默认值 
	* @param followUp
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:18:24
	 */
	public boolean insertSelective(FollowUp followUp);
	
	/**
	 * 
	* @Title: selectByFollowUpExample 
	* @Description: 按照Example条件 模糊查询 
	* @param followUpExample
	* @return List<FollowUp>
	* @author ColdFingers
	* @date 2018年11月8日下午7:18:33
	 */
	public List<FollowUp> selectByFollowUpExample(FollowUpExample followUpExample);
	
	/**
	 * 
	* @Title: selectFollowUpByPrimaryKey 
	* @Description: 按照FollowUp 的id 查找 FollowUp 
	* @param id
	* @return FollowUp
	* @author ColdFingers
	* @date 2018年11月8日下午7:18:43
	 */
	public FollowUp selectFollowUpByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: updateByFollowUpExample 
	* @Description: 更新FollowUp对象中若有空则更新字段为null 
	* @param followUp
	* @param followUpExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:18:58
	 */
	public boolean updateByFollowUpExample(FollowUp followUp, FollowUpExample followUpExample);
	
	/**
	 * 
	* @Title: updateByFollowUpExampleSelective 
	* @Description: 更新FollowUp 对象中若有空则不会更新此字段 
	* @param followUp
	* @param followUpExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:19:09
	 */
	public boolean updateByFollowUpExampleSelective(FollowUp followUp, FollowUpExample followUpExample);
		
	/**
	 * 
	* @Title: updateFollowUpByPrimaryKeySelective 
	* @Description: 按照FollowUp id 更新FollowUp对象中如有空则不会更新此字段 
	* @param followUp
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:19:32
	 */
	public boolean updateFollowUpByPrimaryKeySelective(FollowUp followUp);
	
	/**
	 * 
	* @Title: updateFollowUpByPrimaryKey 
	* @Description: 按照FollowUp id 更新FollowUp对象中如有空则更新此字段为null 
	* @param followUp
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午7:19:47
	 */
	public boolean updateFollowUpByPrimaryKey(FollowUp followUp);	
}
