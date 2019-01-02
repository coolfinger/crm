package com.crm.wcx.service;

import java.util.List;
import java.util.Map;

import com.crm.wcx.entity.CpuInfoVo;
import com.crm.wcx.entity.ServerInfo;

/**
 * 
 * @ClassName: IServiceInfoService 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午2:35:59
 */
public interface IServiceInfoService {

	/**
	 * 
	* @Title: getServiceInfo 
	* @Description: 获取系统基本信息 
	* @return ServerInfo
	* @author ColdFingers
	* @date 2018年11月8日下午3:24:58
	 */
	public ServerInfo getServiceInfo();
	
	/**
	 * 
	* @Title: getCpuInfo 
	* @Description: 获取cpu信息 
	* @return List<CpuInfoVo>
	* @author ColdFingers
	* @date 2018年11月8日下午3:25:20
	 */
	public List<CpuInfoVo> getCpuInfo();
	
	/**
	 * 
	* @Title: getMemeryInfo 
	* @Description: 获取内存信息 
	* @return Map<String,Object>
	* @author ColdFingers
	* @date 2018年11月8日下午3:25:36
	 */
	public Map<String, Object> getMemeryInfo();
	
	
}
