/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:07:39 
 */
package com.crm.wcx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.RoleMapper;
import com.crm.wcx.entity.Role;
import com.crm.wcx.entity.RoleExample;
import com.crm.wcx.service.IRoleService;

/** 
 * @ClassName: RoleServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:07:39  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class RoleServiceImpl implements IRoleService {

	@Autowired
	private RoleMapper roleMapper;
	
	
	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRoleService#countByRoleExample(com.crm.wcx.entity.RoleExample)
	 */
	@Override
	public long countByRoleExample(RoleExample roleExample) {
		// TODO Auto-generated method stub
		return roleMapper.countByExample(roleExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRoleService#deleteByRoleExample(com.crm.wcx.entity.RoleExample)
	 */
	@Override
	public boolean deleteByRoleExample(RoleExample roleExample) {
		// TODO Auto-generated method stub
		return roleMapper.deleteByExample(roleExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRoleService#deleteRoleByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public boolean deleteRoleByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return roleMapper.deleteByPrimaryKey(id)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRoleService#insertRole(com.crm.wcx.entity.Role)
	 */
	@Override
	public boolean insertRole(Role role) {
		// TODO Auto-generated method stub
		return roleMapper.insert(role)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRoleService#insertRoleSelective(com.crm.wcx.entity.Role)
	 */
	@Override
	public boolean insertRoleSelective(Role role) {
		// TODO Auto-generated method stub
		return roleMapper.insertSelective(role)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRoleService#selectByRoleExample(com.crm.wcx.entity.RoleExample)
	 */
	@Override
	public List<Role> selectByRoleExample(RoleExample roleExample) {
		// TODO Auto-generated method stub
		return roleMapper.selectByExample(roleExample);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRoleService#selectRoleByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public Role selectRoleByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return roleMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRoleService#updateByRoleExampleSelective(com.crm.wcx.entity.Role, com.crm.wcx.entity.RoleExample)
	 */
	@Override
	public boolean updateByRoleExampleSelective(Role role,
			RoleExample roleExample) {
		// TODO Auto-generated method stub
		return roleMapper.updateByExampleSelective(role, roleExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRoleService#updateByRoleExample(com.crm.wcx.entity.Role, com.crm.wcx.entity.RoleExample)
	 */
	@Override
	public boolean updateByRoleExample(Role role, RoleExample roleExample) {
		// TODO Auto-generated method stub
		return roleMapper.updateByExample(role, roleExample)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRoleService#updateRoleByPrimaryKeySelective(com.crm.wcx.entity.Role)
	 */
	@Override
	public boolean updateRoleByPrimaryKeySelective(Role role) {
		// TODO Auto-generated method stub
		return roleMapper.updateByPrimaryKeySelective(role)>0 ? true:false;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IRoleService#updateRoleByPrimaryKey(com.crm.wcx.entity.Role)
	 */
	@Override
	public boolean updateRoleByPrimaryKey(Role role) {
		// TODO Auto-generated method stub
		return roleMapper.updateByPrimaryKey(role)>0 ? true:false;
	}

}
