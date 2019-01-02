/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:09:22 
 */
package com.crm.wcx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.PermissionMapper;
import com.crm.wcx.entity.Pager;
import com.crm.wcx.entity.Permission;
import com.crm.wcx.entity.PermissionExample;
import com.crm.wcx.service.IPermissionService;

/** 
 * @ClassName: PermissionServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:09:22  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class PermissionServiceImpl implements IPermissionService {

	@Autowired
	private PermissionMapper permissionMapper;
	
	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IPermissionService#countByPermissionExample(com.crm.wcx.entity.PermissionExample)
	 */
	@Override
	public long countByPermissionExample(PermissionExample permissionExample) {
		// TODO Auto-generated method stub
		return permissionMapper.countByExample(permissionExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IPermissionService#deleteByPermissionExample(com.crm.wcx.entity.PermissionExample)
	 */
	@Override
	public boolean deleteByPermissionExample(PermissionExample permissionExample) {
		// TODO Auto-generated method stub
		return permissionMapper.deleteByExample(permissionExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IPermissionService#deletePermissionByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public boolean deletePermissionByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return permissionMapper.deleteByPrimaryKey(id)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IPermissionService#insertPermission(com.crm.wcx.entity.Permission)
	 */
	@Override
	public boolean insertPermission(Permission permission) {
		// TODO Auto-generated method stub
		return permissionMapper.insert(permission)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IPermissionService#insertPermissionSelective(com.crm.wcx.entity.Permission)
	 */
	@Override
	public boolean insertPermissionSelective(Permission permission) {
		// TODO Auto-generated method stub
		return permissionMapper.insertSelective(permission)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IPermissionService#selectByPermissionExample(com.crm.wcx.entity.PermissionExample, org.hyperic.sigar.pager.Pager)
	 */
	@Override
	public List<Permission> selectByPermissionExample(
			PermissionExample permissionExample, com.crm.wcx.entity.Pager pager) {
		permissionExample.setLimit(pager.getPageSize());
    	permissionExample.setOffset(new Long(pager.getOffset()));
    	permissionExample.setOrderByClause("type asc");
    	return permissionMapper.selectByExample(permissionExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IPermissionService#selectByPermissionExample(com.crm.wcx.entity.PermissionExample)
	 */
	@Override
	public List<Permission> selectByPermissionExample(
			PermissionExample permissionExample) {
		return permissionMapper.selectByExample(permissionExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IPermissionService#selectPermissionByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public Permission selectPermissionByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return permissionMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IPermissionService#updateByPermissionExampleSelective(com.crm.wcx.entity.Permission, com.crm.wcx.entity.PermissionExample)
	 */
	@Override
	public boolean updateByPermissionExampleSelective(Permission permission,
			PermissionExample permissionExample) {
		// TODO Auto-generated method stub
		return permissionMapper.updateByExampleSelective(permission, permissionExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IPermissionService#updateByPermissionExample(com.crm.wcx.entity.Permission, com.crm.wcx.entity.PermissionExample)
	 */
	@Override
	public boolean updateByPermissionExample(Permission permission,
			PermissionExample permissionExample) {
		// TODO Auto-generated method stub
		return permissionMapper.updateByExample(permission, permissionExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IPermissionService#updatePermissionByPrimaryKeySelective(com.crm.wcx.entity.Permission)
	 */
	@Override
	public boolean updatePermissionByPrimaryKeySelective(Permission permission) {
		// TODO Auto-generated method stub
		return permissionMapper.updateByPrimaryKeySelective(permission)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IPermissionService#updatePermissionByPrimaryKey(com.crm.wcx.entity.Permission)
	 */
	@Override
	public boolean updatePermissionByPrimaryKey(Permission permission) {
		// TODO Auto-generated method stub
		return permissionMapper.updateByPrimaryKey(permission)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IPermissionService#selectTreePermission()
	 */
	@Override
	public List<Permission> selectTreePermission() {
		// TODO Auto-generated method stub
		return permissionMapper.selectTreePermission();
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IPermissionService#selectChildPermission(java.lang.Integer)
	 */
	@Override
	public List<Permission> selectChildPermission(Integer id) {
		// TODO Auto-generated method stub
		return permissionMapper.selectChildPermission(id);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IPermissionService#updatePermissionSetTopPermission(com.crm.wcx.entity.Permission)
	 */
	@Override
	public boolean updatePermissionSetTopPermission(Permission permission) {
		// TODO Auto-generated method stub
		return permissionMapper.setTopPermission(permission)>0 ? true:false;
	}

}
