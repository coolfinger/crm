package com.crm.wcx.service;

import java.util.List;

import com.crm.wcx.entity.Role;
import com.crm.wcx.entity.RoleExample;

/**
 * 
 * @ClassName: IRoleService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午3:42:07
 */
public interface IRoleService {

	/**
	 * 
	* @Title: countByRoleExample 
	* @Description: 根据Example统计记录总数 
	* @param roleExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午3:44:45
	 */
	public long countByRoleExample(RoleExample roleExample);
	
	/**
	 * 
	* @Title: deleteByRoleExample 
	* @Description: 根据Example删除Role记录 
	* @param roleExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午3:45:08
	 */
	public boolean deleteByRoleExample(RoleExample roleExample);
	
	/**
	 * 
	* @Title: deleteRoleByPrimaryKey 
	* @Description: 通过主键id删除Role 
	* @param id
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午3:45:36
	 */
	public boolean deleteRoleByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: insertRole 
	* @Description: 插入一条记录 如果字段为空 则设置为null
	* @param role
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午3:46:04
	 */
	public boolean insertRole(Role role);
	
	/**
	 * 
	* @Title: insertRoleSelective 
	* @Description: 插入一条记录 如果字段为空则设置为默认值 
	* @param role
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午3:46:24
	 */
	public boolean insertRoleSelective(Role role);
	
	/**
	 * 
	* @Title: selectByRoleExample 
	* @Description: 根据Example查询Role 
	* @param roleExample
	* @return List<Role>
	* @author ColdFingers
	* @date 2018年11月8日下午3:47:27
	 */
	public List<Role> selectByRoleExample(RoleExample roleExample);
	
	/**
	 * 
	* @Title: selectRoleByPrimaryKey 
	* @Description: 根据主键id查询一条Role 
	* @param id
	* @return Role
	* @author ColdFingers
	* @date 2018年11月8日下午3:47:50
	 */
	public Role selectRoleByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: updateByRoleExampleSelective 
	* @Description:根据Example更改Role 如果字段为空则设置为默认值 
	* @param role
	* @param roleExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午3:48:21
	 */
	public boolean updateByRoleExampleSelective(Role role,RoleExample roleExample);
	
	/**
	 * 
	* @Title: updateByRoleExample 
	* @Description: 根据Example更改Role 如果字段为空则设置为null 
	* @param role
	* @param roleExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午3:49:09
	 */
	public boolean updateByRoleExample(Role role, RoleExample roleExample);
	
	/**
	 * 
	* @Title: updateRoleByPrimaryKeySelective 
	* @Description: 根据主键id 更改Role 如果字段为空则设置为默认值 
	* @param role
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午3:50:04
	 */
	public boolean updateRoleByPrimaryKeySelective(Role role);
	
	/**
	 * 
	* @Title: updateRoleByPrimaryKey 
	* @Description: 根据主键id更改role 如果字段为空则设置为null 
	* @param role
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午3:50:43
	 */
	public boolean updateRoleByPrimaryKey(Role role);

	
	
	
}
