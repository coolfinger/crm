/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:08:10 
 */
package com.crm.wcx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.RolePermissionMapper;
import com.crm.wcx.entity.RolePermission;
import com.crm.wcx.entity.RolePermissionExample;
import com.crm.wcx.service.IRolePermissionService;

/** 
 * @ClassName: RolePermissionServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:08:10  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class RolePermissionServiceImpl implements IRolePermissionService {

	@Autowired
	private RolePermissionMapper rolePermissionMapper;
	
	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRolePermissionService#countByRolePermissionExample(com.crm.wcx.entity.RolePermissionExample)
	 */
	@Override
	public long countByRolePermissionExample(
			RolePermissionExample rolePermissionExample) {
		return rolePermissionMapper.countByExample(rolePermissionExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRolePermissionService#deleteByRolePermissionExample(com.crm.wcx.entity.RolePermissionExample)
	 */
	@Override
	public boolean deleteByRolePermissionExample(
			RolePermissionExample rolePermissionExample) {
		return rolePermissionMapper.deleteByExample(rolePermissionExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRolePermissionService#deleteRolePermissionByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public boolean deleteRolePermissionByPrimaryKey(Integer id) {
		return rolePermissionMapper.deleteByPrimaryKey(id)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRolePermissionService#insertRolePermission(com.crm.wcx.entity.RolePermission)
	 */
	@Override
	public boolean insertRolePermission(RolePermission rolePermission) {
		// TODO Auto-generated method stub
		return rolePermissionMapper.insert(rolePermission)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRolePermissionService#insertRolePermissionSelective(com.crm.wcx.entity.RolePermission)
	 */
	@Override
	public boolean insertRolePermissionSelective(RolePermission rolePermission) {
		// TODO Auto-generated method stub
		return rolePermissionMapper.insertSelective(rolePermission)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRolePermissionService#selectByRolePermissionExample(com.crm.wcx.entity.RolePermissionExample)
	 */
	@Override
	public List<RolePermission> selectByRolePermissionExample(
			RolePermissionExample rolePermissionExample) {
		// TODO Auto-generated method stub
		return rolePermissionMapper.selectByExample(rolePermissionExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRolePermissionService#selectRolePermissionByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public RolePermission selectRolePermissionByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return rolePermissionMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRolePermissionService#updateByRolePermissionExampleSelective(com.crm.wcx.entity.RolePermission, com.crm.wcx.entity.RolePermissionExample)
	 */
	@Override
	public boolean updateByRolePermissionExampleSelective(
			RolePermission rolePermission,
			RolePermissionExample rolePermissionExample) {
		// TODO Auto-generated method stub
		return rolePermissionMapper.updateByExampleSelective(rolePermission, rolePermissionExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRolePermissionService#updateByRolePermissionExample(com.crm.wcx.entity.RolePermission, com.crm.wcx.entity.RolePermissionExample)
	 */
	@Override
	public boolean updateByRolePermissionExample(RolePermission rolePermission,
			RolePermissionExample rolePermissionExample) {
		// TODO Auto-generated method stub
		return rolePermissionMapper.updateByExample(rolePermission, rolePermissionExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRolePermissionService#updateRolePermissionByPrimaryKeySelective(com.crm.wcx.entity.RolePermission)
	 */
	@Override
	public boolean updateRolePermissionByPrimaryKeySelective(
			RolePermission rolePermission) {
		// TODO Auto-generated method stub
		return rolePermissionMapper.updateByPrimaryKeySelective(rolePermission)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRolePermissionService#updateRolePermissionByPrimaryKey(com.crm.wcx.entity.RolePermission)
	 */
	@Override
	public boolean updateRolePermissionByPrimaryKey(
			RolePermission rolePermission) {
		// TODO Auto-generated method stub
		return rolePermissionMapper.updateByPrimaryKey(rolePermission)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRolePermissionService#allotPermission(java.lang.Integer[], java.lang.Integer)
	 */
	@Override
	public int allotPermission(Integer[] permissionIds, Integer roleId) {
		int count = 0;
		try {
			//1. 先将角色原来的权限全部删除
			RolePermissionExample example = new RolePermissionExample();
			example.createCriteria().andRoleIdEqualTo(roleId);
			rolePermissionMapper.deleteByExample(example);
			
			//2. 重新插入该角色的权限
			if(permissionIds.length > 0) {
				count = rolePermissionMapper.insertRolePermission(permissionIds, roleId);
			}
			
		}catch (Exception e) {
			return 0;
		}
		
		return count;
	}

}
