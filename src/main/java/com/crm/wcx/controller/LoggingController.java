package com.crm.wcx.controller;


import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



import com.crm.wcx.entity.LoggingEvent;
import com.crm.wcx.entity.LoggingEventExample.Criteria;
import com.crm.wcx.entity.LoggingEventExample;
import com.crm.wcx.entity.Pager;
import com.crm.wcx.service.ILoggingEventService;
import com.crm.wcx.utils.Operation;
import com.crm.wcx.utils.TimeStamp;

/**
 * 
 * @ClassName: LoggingController 
 * @Description: 日志控制器
 * @author: ColdFingers
 * @date: 2018年12月4日 下午12:49:39
 */
@Operation(name = "日志管理")
@Controller
@RequestMapping("/log")
public class LoggingController {

	@Autowired
	private ILoggingEventService loggingEventService;

	/**
	 * 
	* @Title: findLogging 
	* @Description: ajax分页获取日志记录数据 
	* @param limit
	* @param page
	* @param timeMax
	* @param timeMin
	* @return Map<String,Object>
	* @author ColdFingers
	* @date 2018年12月4日下午12:49:58
	 */
	@Operation(name = "查看日志")
	@RequiresPermissions("2001")
	@RequestMapping("/findLogging")
	@ResponseBody
	public Map<String, Object> findLogging(Long limit, Long page,
			@RequestParam(value = "timeMax", defaultValue = "") String timeMax,
			@RequestParam(value = "timeMin", defaultValue = "") String timeMin) {
		System.err.println("timeMax ：" + timeMax);
		System.err.println("timeMin : " + timeMin);
		Map<String, Object> maps = new HashMap<String, Object>();
		LoggingEventExample loggingEventExample = new LoggingEventExample();
		try {
			Criteria criteria = loggingEventExample.createCriteria();
			if (!"".equals(timeMax) && "".equals(timeMin)) {
				criteria.andTimestmpLessThanOrEqualTo(TimeStamp.dateToStamp(timeMax, "yyyy-MM-dd") + 86400000L);
			}
			if (!"".equals(timeMin) && "".equals(timeMax)) {
				criteria.andTimestmpGreaterThanOrEqualTo(TimeStamp.dateToStamp(timeMin, "yyyy-MM-dd"));
			}
			if (!"".equals(timeMin) && !"".equals(timeMax)) {
				criteria.andTimestmpBetween(TimeStamp.dateToStamp(timeMin, "yyyy-MM-dd"),
						TimeStamp.dateToStamp(timeMax, "yyyy-MM-dd") + 86400000L);
			}
		} catch (ParseException e) {
			maps.put("code", 200); // 状态码 正常为0
			maps.put("msg", "时间格式有误");
			return maps;
		}
		Pager pager = new Pager(page.intValue(), limit.intValue());

		Long count = loggingEventService.countByLoggingEventExample(loggingEventExample);
		pager.setTotal(count.intValue());
		List<LoggingEvent> loggingEvents = loggingEventService.selectByLoggingEventExample(loggingEventExample, pager);

		maps.put("code", 0); // 状态码 正常为0
		maps.put("count", pager.getTotal()); // 返回的数据总数
		maps.put("data", loggingEvents); // 返回的数据
		return maps;
	}

	@Operation(name = "删除或清空日志")
	@RequiresPermissions("2002")
	@RequestMapping("/delLogging")
	@ResponseBody
	public Map<String, Object> deleteLogging(@RequestParam(value = "timeMin", defaultValue = "") String timeMin,
			@RequestParam(value = "timeMax", defaultValue = "") String timeMax) {
		
		System.err.println("timeMax ：" + timeMax);
		System.err.println("timeMin : " + timeMin);
		Map<String, Object> maps = new HashMap<String, Object>();
		LoggingEventExample loggingEventExample = new LoggingEventExample();
		try {
			Criteria criteria = loggingEventExample.createCriteria();
			if (!"".equals(timeMax) && "".equals(timeMin)) {
				criteria.andTimestmpLessThanOrEqualTo(TimeStamp.dateToStamp(timeMax, "yyyy-MM-dd") + 86400000L);
			}
			if (!"".equals(timeMin) && "".equals(timeMax)) {
				criteria.andTimestmpGreaterThanOrEqualTo(TimeStamp.dateToStamp(timeMin, "yyyy-MM-dd"));
			}
			if (!"".equals(timeMin) && !"".equals(timeMax)) {
				criteria.andTimestmpBetween(TimeStamp.dateToStamp(timeMin, "yyyy-MM-dd"),
						TimeStamp.dateToStamp(timeMax, "yyyy-MM-dd") + 86400000L);
			}
		} catch (ParseException e) {
			maps.put("code", 200); // 状态码 正常为0
			maps.put("msg", "时间格式有误");
			return maps;
		}
		boolean result = loggingEventService.deleteByLoggingEventExample(loggingEventExample);
		if(result == true) {
			maps.put("code", 0);
		}else {
			maps.put("code", 200);
			maps.put("msg", "删除失败! 或沒有可刪除的日志记录");
		}
		return maps;
	}
}
