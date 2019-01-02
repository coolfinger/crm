package com.crm.wcx.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.wcx.entity.PermissionExample.Criteria;
import com.crm.wcx.entity.Pager;
import com.crm.wcx.entity.Permission;
import com.crm.wcx.entity.PermissionExample;
import com.crm.wcx.entity.User;
import com.crm.wcx.service.IPermissionService;
import com.crm.wcx.utils.Operation;
import com.crm.wcx.utils.RedisUtil;

/**
 * 
 * @ClassName: PermissionController 
 * @Description: 权限管理
 * @author: ColdFingers
 * @date: 2018年12月4日 下午12:51:35
 */
@Operation(name="权限管理")
@Controller
@RequestMapping("/permiss")
public class PermissionController {

	@Autowired
	private IPermissionService permissionService;
	
	@Autowired
	private RedisUtil redisUtil;
	/**
	 * 
	* @Title: findPermission 
	* @Description: 获取权限列表 
	* @param limit
	* @param page
	* @param permission
	* @return Map<String,Object>
	* @author ColdFingers
	* @date 2018年12月4日下午12:51:44
	 */
	@Operation(name="查询权限")
	@RequiresPermissions("3001")
	@RequestMapping("/findPermission")
	@ResponseBody
	public Map<String, Object> findPermission(Long limit, Long page, Permission permission){
		
		Map<String, Object> maps = new HashMap<String, Object>(16);
		PermissionExample permissionExample = new PermissionExample();
		Pager pager = new Pager(page.intValue(), limit.intValue());
		
		//搜索条件
		if(permission != null){
			Criteria criteria = permissionExample.createCriteria();
			if(permission.getTitle() != null && !"".equals(permission.getTitle())){
				criteria.andTitleLike("%"+permission.getTitle()+"%");
			}
			if(permission.getStatus() != null){
				criteria.andStatusEqualTo(permission.getStatus());
			}
		}
		
		Long count = permissionService.countByPermissionExample(permissionExample);
		pager.setTotal(count.intValue());
		List<Permission> permissions = permissionService.selectByPermissionExample(permissionExample, pager);
		maps.put("code", 0);
		maps.put("data", permissions);
		maps.put("count", pager.getTotal());
		return maps;
	}
	
	/**
	 * 
	* @Title: updatePermission 
	* @Description: 权限更新 
	* @param request
	* @param permission
	* @return Map<String,Object>
	* @author ColdFingers
	* @date 2018年12月4日下午12:51:53
	 */
	@Operation(name="更新权限")
	@RequiresPermissions("3002")
	@RequestMapping("/updatePermission")
	@ResponseBody
	public Map<String, Object> updatePermission(HttpServletRequest request, Permission permission){
		Map<String, Object> maps = new HashMap<String, Object>(16);
		
		//从session中获取用户角色
		User user = (User)request.getSession().getAttribute("user");
		
		//1. 判断是否更新父级权限
		if(permission.getPid() != null){
			//2. 判断更新的 父级权限是否是  自己的  子权限
			if(permission.getId().equals(permission.getPid())){
				maps.put("code", 200);
				maps.put("msg", "父级权限不能与当前权限相同!");
				return maps;
			}
			//3. 查询该权限下的所有权限
			List<Permission> permissions = permissionService.selectChildPermission(permission.getId());
			
			boolean result = checkPermission(permissions, permission.getPid());
			if(result == false){
				maps.put("code", 200);
				maps.put("msg", "当前权限等级不能少于选择父级权限的等级");
				return maps;
			}
		}
		
		
		//1. 判断是否更新权限名称
		if(permission.getTitle() != null && !"".equals(permission.getTitle())) {
			//2. 检查更新的权限名称是否已经存在
			PermissionExample permissionExample = new PermissionExample();
			Criteria criteria = permissionExample.createCriteria();
			criteria.andIdNotEqualTo(permission.getId());
			criteria.andTitleEqualTo(permission.getTitle());
			long count = permissionService.countByPermissionExample(permissionExample);
			if(count > 0) {
				maps.put("code", 200);
				maps.put("msg", "该权限名称已存在!");
				return maps;
			}
		}
		
		//更新权限
		//判断是否设置上级权限为顶级权限
		if(permission.getPid() != null && permission.getPid() == 0) {
			//更新上级权限为顶级权限
			boolean result = permissionService.updatePermissionSetTopPermission(permission);
			if(result == false) {
				maps.put("code", 200);
				maps.put("msg", "更新失败!");
				return maps;
			}
			//重要  需要设为null 否则下面也会更新此字段
			permission.setPid(null);  
		}
		try {
			boolean result = permissionService.updatePermissionByPrimaryKeySelective(permission);
			if(result == true) {
				maps.put("code", 0);
				//权限发生改变，删除权限相关的缓存
		        redisUtil.remove("roleMenu-"+user.getRoleId());
		        redisUtil.remove("rolePermission-"+user.getRoleId());

			}else {
				maps.put("code", 200);
				maps.put("msg", "修改失败");
			}
		}catch (Exception e) {
			maps.put("code", 200);
			
			if(e instanceof org.springframework.dao.DuplicateKeyException) {
				maps.put("msg", "权限编码不能有重复");
			}else {
				maps.put("msg", e.getMessage());
			}
		}
       
		return maps;
	}
	
	/**
	 * 
	* @Title: deletePermission 
	* @Description: 权限删除 
	* @param request
	* @param id
	* @return Map<String,Object>
	* @author ColdFingers
	* @date 2018年12月4日下午12:52:13
	 */
	@Operation(name="删除权限")
	@RequiresPermissions("3004")
	@RequestMapping("/deletePermission")
	@ResponseBody
	public Map<String, Object> deletePermission(HttpServletRequest request, Integer id){
		
		Map<String, Object> maps = new HashMap<String, Object>(16);
		
		//从session中获取用户角色
        User user = (User)request.getSession().getAttribute("user");

		boolean result = permissionService.deletePermissionByPrimaryKey(id);
		if(result == true) {
			maps.put("code", 0);
			//权限发生改变，删除权限相关的缓存
            redisUtil.remove("roleMenu-"+user.getRoleId());
	        redisUtil.remove("rolePermission-"+user.getRoleId());
		}else {
			maps.put("code", 200);
			maps.put("msg", "删除失败!");
		}
		return maps;
	}
	
	/**
	 * 
	* @Title: getPermissionTree 
	* @Description: 获取权限树 
	* @return Map<String,Object>
	* @author ColdFingers
	* @date 2018年12月4日下午12:52:23
	 */
	@Operation(name="获取权限树")
	@RequiresPermissions("3005")
	@RequestMapping("/getPermissionTree")
	@ResponseBody
	public Map<String, Object> getPermissionTree(){
		
		Map<String, Object> maps = new HashMap<String, Object>(16);
		
		maps.put("tree", permissionService.selectTreePermission());
		
		return maps;
	}
	
	/**
	 * 
	* @Title: addPermission 
	* @Description: TODO 
	* @param permission
	* @return Map<String,Object>
	* @author ColdFingers
	* @date 2018年12月4日下午12:52:33
	 */
	@Operation(name="添加权限")
	@RequiresPermissions("3003")
	@RequestMapping("/addPermiss")
	@ResponseBody
	public Map<String, Object> addPermission(Permission permission){
		
		Map<String, Object> maps = new HashMap<String, Object>(16);
		
		//1. 检测权限名称是否已经存在
		PermissionExample example = new PermissionExample();
		example.createCriteria().andTitleEqualTo(permission.getTitle());
		long count = permissionService.countByPermissionExample(example);
		if(count > 0){
			maps.put("code", 200);
			maps.put("msg", "该权限名称已存在!");
			return maps;
		}
		
		try {
			//2. 插入权限数据
			boolean result = permissionService.insertPermissionSelective(permission);
			
			//3. 返回数据
			if(result == true){
				maps.put("code", 0);
				
			}else{
				maps.put("code", 200);
				maps.put("msg", "插入失败!");
			}
		}catch (Exception e) {
			// TODO: handle exception
			maps.put("code", 200);
			if(e instanceof org.springframework.dao.DuplicateKeyException) {
				maps.put("msg", "权限编码不能有重复");
			}else {
				maps.put("msg", e.getMessage());
			}
		}
		return maps;
	}
	
	/**
	 * 
	* @Title: checkPermission 
	* @Description: TODO 
	* @param permissions
	* @param p
	* @return boolean
	* @author ColdFingers
	* @date 2018年12月4日下午12:52:42
	 */
	public boolean checkPermission(List<Permission> permissions, Integer p){
		
		for (Permission permission : permissions) {
			if(permission.getId().equals(p)){
				return false;
			}
			return checkPermission(permission.getChildPermission(), p);
		}
		return true;
	}
	
	
}
