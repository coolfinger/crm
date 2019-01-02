package com.crm.wcx.service;

import java.util.List;

import org.hyperic.sigar.pager.Pager;

import com.crm.wcx.entity.Permission;
import com.crm.wcx.entity.PermissionExample;

/**
 * 
 * @ClassName: IPermissionService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午5:27:35
 */
public interface IPermissionService {

	/**
	 * 
	* @Title: countByPermissionExample 
	* @Description: 根据example统计permission条数 
	* @param permissionExample
	* @return long
	* @author ColdFingers
	* @date 2018年11月8日下午5:48:52
	 */
	public long countByPermissionExample(PermissionExample permissionExample);

	/**
	 * 
	* @Title: deleteByPermissionExample 
	* @Description: 根据example删除permission 
	* @param permissionExample
	* @return boolean
	* @author ColdFingers
	* @date 2018年11月8日下午5:49:03
	 */
    public boolean deleteByPermissionExample(PermissionExample permissionExample);

    /**
     * 
    * @Title: deletePermissionByPrimaryKey 
    * @Description: 根据主键删除permission 
    * @param id
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午5:49:12
     */
    public boolean deletePermissionByPrimaryKey(Integer id);

    /**
     * 
    * @Title: insertPermission 
    * @Description: 插入一条permission，如果字段为空，那么插入null 
    * @param permission
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午5:49:22
     */
    public boolean insertPermission(Permission permission);

    /**
     * 
    * @Title: insertPermissionSelective 
    * @Description: 插入一条permission，如果字段为空，插入的是数据库中字段的默认值 
    * @param permission
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午5:49:36
     */
    public boolean insertPermissionSelective(Permission permission);

    /**
     * 
    * @Title: selectByPermissionExample 
    * @Description: 根据example查找permission 分页 
    * @param permissionExample
    * @param pager
    * @return List<Permission>
    * @author ColdFingers
    * @date 2018年11月8日下午5:49:51
     */
    public List<Permission> selectByPermissionExample(PermissionExample permissionExample, com.crm.wcx.entity.Pager pager);

    /**
     * 
    * @Title: selectByPermissionExample 
    * @Description: 根据example查找permission  
    * @param permissionExample
    * @return List<Permission>
    * @author ColdFingers
    * @date 2018年11月8日下午5:50:05
     */
    public List<Permission> selectByPermissionExample(PermissionExample permissionExample);

    
    /**
     * 
    * @Title: selectPermissionByPrimaryKey 
    * @Description: 根据主键id查找permission 
    * @param id
    * @return Permission
    * @author ColdFingers
    * @date 2018年11月8日下午5:50:15
     */
    public Permission selectPermissionByPrimaryKey(Integer id);

    /**
     * 
    * @Title: updateByPermissionExampleSelective 
    * @Description: 更新permission，参数permission中如果某个字段为空代表不更新此字段，example为where条件 
    * @param permission
    * @param permissionExample
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午5:50:26
     */
    public boolean updateByPermissionExampleSelective(Permission permission,PermissionExample permissionExample);

    /**
     * 
    * @Title: updateByPermissionExample 
    * @Description: 更新permission，参数permission中如果某个字段为空代表此字段也更新为空，example为where条件 
    * @param permission
    * @param permissionExample
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午5:50:47
     */
    public boolean updateByPermissionExample(Permission permission, PermissionExample permissionExample);

    /**
     * 
    * @Title: updatePermissionByPrimaryKeySelective 
    * @Description: 根据主键id更新permission，参数permission中某些字段为空，代表不更新此字段 
    * @param permission
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午5:50:59
     */
    public boolean updatePermissionByPrimaryKeySelective(Permission permission);

    /**
     * 
    * @Title: updatePermissionByPrimaryKey 
    * @Description: 根据主键id更新permission，参数permission中如果有字段为空，代表更新为null 
    * @param permission
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午5:51:11
     */
    public boolean updatePermissionByPrimaryKey(Permission permission);
    
    /**
     * 
    * @Title: selectTreePermission 
    * @Description: 查询权限树 
    * @return List<Permission>
    * @author ColdFingers
    * @date 2018年11月8日下午5:51:22
     */
    public List<Permission> selectTreePermission();
    
    /**
     * 
    * @Title: selectChildPermission 
    * @Description: 根据当前权限的id查询该权限下的所有子权限 
    * @param id
    * @return List<Permission>
    * @author ColdFingers
    * @date 2018年11月8日下午5:51:34
     */
    public List<Permission> selectChildPermission(Integer id);
	
    /**
     * 
    * @Title: updatePermissionSetTopPermission 
    * @Description: 设置当前权限为顶级权限 
    * @param permission
    * @return boolean
    * @author ColdFingers
    * @date 2018年11月8日下午5:51:46
     */
    public boolean updatePermissionSetTopPermission(Permission permission);
	
}
