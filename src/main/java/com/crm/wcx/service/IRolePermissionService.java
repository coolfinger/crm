package com.crm.wcx.service;

import java.util.List;

import com.crm.wcx.entity.RolePermission;
import com.crm.wcx.entity.RolePermissionExample;

/**
 * 
 * @ClassName: IRolePermissionService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午3:51:41
 */
public interface IRolePermissionService {
	
	/**
	 * 
	* @Title: countByRolePermissionExample 
	* @Description: 根据Example统计RolePermission记录的总数 
	* @param rolePermissionExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午4:44:57
	 */
	public long countByRolePermissionExample(RolePermissionExample rolePermissionExample);

	/**
	 * 
	* @Title: deleteByRolePermissionExample 
	* @Description:通过Example删除RolePemission
	* @param rolePermissionExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午4:45:54
	 */
	public boolean deleteByRolePermissionExample(RolePermissionExample rolePermissionExample);

	/**
	 * 
	* @Title: deleteRolePermissionByPrimaryKey 
	* @Description: 通过主键id删除RolePermission 
	* @param id
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午4:46:48
	 */
	public boolean deleteRolePermissionByPrimaryKey(Integer id);

	/**
	 * 
	* @Title: insertRolePermission 
	* @Description: 插入一条RolePermission记录 如果字段为空则设置为null 
	* @param rolePermission
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午4:47:25
	 */
	public boolean insertRolePermission(RolePermission rolePermission);
	
	/**
	 * 
	* @Title: insertRolePermissionSelective 
	* @Description:插入一条RolePermission记录 如果字段为空则插入默认值
	* @param rolePermission
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午4:48:12
	 */
	public boolean insertRolePermissionSelective(RolePermission rolePermission);
	
	/**
	 * 
	* @Title: selectByRolePermissionExample 
	* @Description: 通过Example查询RolePermission  
	* @param rolePermissionExample
	* @return List<RolePermission>
	* @author ColdFingers
	* @date 2018年11月8日下午4:49:17
	 */
	public List<RolePermission> selectByRolePermissionExample(RolePermissionExample rolePermissionExample);
	
	/**
	 * 
	* @Title: selectRolePermissionByPrimaryKey 
	* @Description:通过主键id查询RolePermission 
	* @param id
	* @return RolePermission
	* @author ColdFingers
	* @date 2018年11月8日下午4:49:55
	 */
	public RolePermission selectRolePermissionByPrimaryKey(Integer id);
	
	/**
	 * 
	* @Title: updateByRolePermissionExampleSelective 
	* @Description:通过Example更改RolePermission 如果字段为空则设置为默认值 
	* @param rolePermission
	* @param rolePermissionExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午4:50:28
	 */
	public boolean updateByRolePermissionExampleSelective(RolePermission rolePermission, RolePermissionExample rolePermissionExample);
	
	/**
	 * 
	* @Title: updateByRolePermissionExample 
	* @Description: 通过Example更改RolePermission 如果字段为空则设置为null 
	* @param rolePermission
	* @param rolePermissionExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午4:51:13
	 */
	public boolean updateByRolePermissionExample(RolePermission rolePermission, RolePermissionExample rolePermissionExample);
	
	/**
	 * 
	* @Title: updateRolePermissionByPrimaryKeySelective 
	* @Description:通过主键id更改RolePermission 如果字段为空则设置为默认值 
	* @param rolePermission
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午4:52:05
	 */
	public boolean updateRolePermissionByPrimaryKeySelective(RolePermission rolePermission);
	
	/**
	 * 
	* @Title: updateRolePermissionByPrimaryKey 
	* @Description: 通过主键id更改RolePermission 如果字段为空则设置为null 
	* @param rolePermission
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午4:53:07
	 */
	public boolean updateRolePermissionByPrimaryKey(RolePermission rolePermission);

	/**
	 * 
	* @Title: allotPermission 
	* @Description: 分配权限给角色 
	* @param permissionIds
	* @param roleId
	* @return int
	* @author ColdFingers
	* @date 2018年11月8日下午4:54:00
	 */
	public int allotPermission(Integer[] permissionIds, Integer roleId);
	
	
	
}
