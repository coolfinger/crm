package com.crm.wcx.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.wcx.service.*;
import com.crm.wcx.entity.CpuInfoVo;
import com.crm.wcx.entity.ServerInfo;
import com.crm.wcx.utils.Operation;

/**
 * 
 * @ClassName: SystemController 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年12月4日 下午12:59:03
 */
@Controller
@RequestMapping("/system")
public class SystemController {
    
    @Autowired
    private IServiceInfoService serverService;
    /**
     * 
    * @Title: getSystemInfo 
    * @Description: TODO 
    * @param request
    * @return Map<String,Object>
    * @author ColdFingers
    * @date 2018年12月4日下午12:59:29
     */
    @Operation(name="查询系统信息")
    @RequestMapping("info")
    @ResponseBody
    public Map<String, Object> getSystemInfo(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String,Object>(16);
        
        ServerInfo serverInfo = serverService.getServiceInfo();

        InetAddress address;
        try {
            address = InetAddress.getLocalHost();
            serverInfo.setServerURL(
                    request.getScheme()                 //请求头
                    +"://" + address.getHostAddress()   //服务器地址  
                    + ":"   
                    + request.getServerPort()           //端口号  
                    + request.getContextPath());        //项目名称 
            ServletContext application = request.getSession().getServletContext();
            serverInfo.setServerType(application.getServerInfo());


        } catch (UnknownHostException e) {
        }

        map.put("serverInfo", serverInfo);
        return map;
    }
    /**
     * 
    * @Title: getCpuInfo 
    * @Description: TODO 
    * @param time
    * @return Map<String,Object>
    * @author ColdFingers
    * @date 2018年12月4日下午12:59:33
     */
    @Operation(name="查询cpu信息")
    @RequestMapping("cpu")
    @ResponseBody
    public Map<String, Object> getCpuInfo(String time){
        Map<String, Object> map = new HashMap<String,Object>(16);
        
        List<CpuInfoVo> list = serverService.getCpuInfo();
        
        map.put("time", time);
        map.put("cpuList", list);
        return map;
    }
    /**
     * 
    * @Title: getMemoryInfo 
    * @Description: TODO 
    * @param time
    * @return Map<String,Object>
    * @author ColdFingers
    * @date 2018年12月4日下午12:59:37
     */
    @Operation(name="查询cpu信息")
    @RequestMapping("memory")
    @ResponseBody
    public Map<String, Object> getMemoryInfo(String time){
        Map<String, Object> map = null;
        map = serverService.getMemeryInfo();
        map.put("success", true);
        map.put("time", time);
        return map;
    }
    
}
