/**   
 * 
 * @Package: com.crm.wcx.service.impl 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午8:08:34 
 */
package com.crm.wcx.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.wcx.dao.ReportMapper;
import com.crm.wcx.dao.UserMapper;
import com.crm.wcx.entity.Report;
import com.crm.wcx.entity.User;
import com.crm.wcx.entity.UserExample;
import com.crm.wcx.service.IReportService;

/** 
 * @ClassName: ReportServiceImpl 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午8:08:34  
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class ReportServiceImpl implements IReportService {

	
	@Autowired
	private ReportMapper reportMapper;
	
	@Autowired
	private UserMapper userMapper;
	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IReportService#countCustomerIncrease(int)
	 */
	@Override
	public List<Map<String, Object>> countCustomerIncrease(int n) {
		// TODO Auto-generated method stub
		return reportMapper.countCustomerIncrease(n);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IReportService#countCustomerDecrease(int)
	 */
	@Override
	public List<Map<String, Object>> countCustomerDecrease(int n) {
		// TODO Auto-generated method stub
		return reportMapper.countCustomerDecrease(n);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IReportService#countCustomerByYear(java.lang.String, java.lang.Integer)
	 */
	@Override
	public List<Map<String, Object>> countCustomerByYear(String year,
			Integer userId) {
		Date date = null;
        try {
            date = new SimpleDateFormat("yyyy").parse(year);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
        Report report = new Report();
        report.setUserId(userId);
        report.setResultDateFormat(Report.TIME_YEAR);
        report.setTimeFormat(Report.TIME_YEAR);
        report.setStartTime(date);
        report.setEndTime(date);
        
        List<Map<String, Object>> list = null;
        try {
            list = reportMapper.countCustomerByDate(report);
        }catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IReportService#countCustomerByMonth(java.lang.String, java.lang.Integer)
	 */
	@Override
	public List<Map<String, Object>> countCustomerByMonth(String year,
			Integer userId) {
		Date startTime = null;
        Date endTime = null;
        try {
            startTime = new SimpleDateFormat("yyyy").parse(year);
            endTime = new SimpleDateFormat("yyyy").parse(year);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
        Report report = new Report();
        report.setUserId(userId);
        report.setResultDateFormat(Report.TIME_YEAR_MONTH);
        report.setTimeFormat(Report.TIME_YEAR);
        report.setStartTime(startTime);
        report.setEndTime(endTime);
        
        List<Map<String, Object>> list = null;
        try {
            list = reportMapper.countCustomerByDate(report);
        }catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IReportService#countCustomerByDay(java.lang.String, java.lang.Integer)
	 */
	@Override
	public List<Map<String, Object>> countCustomerByDay(String yearMonth,
			Integer userId) {
		Date startTime = null;
        Date endTime = null;
        try {
            startTime = new SimpleDateFormat("yyyy-MM").parse(yearMonth);
            endTime = new SimpleDateFormat("yyyy-MM").parse(yearMonth);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
        Report report = new Report();
        report.setUserId(userId);
        report.setResultDateFormat(Report.TIME_MONTH_DAY);
        report.setTimeFormat(Report.TIME_YEAR_MONTH);
        report.setStartTime(startTime);
        report.setEndTime(endTime);
        
        List<Map<String, Object>> list = null;
        try {
            list = reportMapper.countCustomerByDate(report);
        }catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IReportService#countFollowUpByYear(java.lang.String, java.lang.Integer)
	 */
	@Override
	public List<Map<String, Object>> countFollowUpByYear(String year,
			Integer userId) {
		Date date = null;
        try {
            date = new SimpleDateFormat("yyyy").parse(year);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
        Report report = new Report();
        report.setUserId(userId);
        report.setResultDateFormat(Report.TIME_YEAR);
        report.setTimeFormat(Report.TIME_YEAR);
        report.setStartTime(date);
        report.setEndTime(date);
        
        List<Map<String, Object>> list = null;
        try {
            list = reportMapper.countFollowupByDate(report);
        }catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IReportService#countFollowUpByMonth(java.lang.String, java.lang.Integer)
	 */
	@Override
	public List<Map<String, Object>> countFollowUpByMonth(String year,
			Integer userId) {
		Date startTime = null;
        Date endTime = null;
        try {
            startTime = new SimpleDateFormat("yyyy").parse(year);
            endTime = new SimpleDateFormat("yyyy").parse(year);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
        Report report = new Report();
        report.setUserId(userId);
        report.setResultDateFormat(Report.TIME_YEAR_MONTH);
        report.setTimeFormat(Report.TIME_YEAR);
        report.setStartTime(startTime);
        report.setEndTime(endTime);
        
        List<Map<String, Object>> list = null;
        try {
            list = reportMapper.countFollowupByDate(report);
        }catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IReportService#countFollowUpByDay(java.lang.String, java.lang.Integer)
	 */
	@Override
	public List<Map<String, Object>> countFollowUpByDay(String yearMonth,
			Integer userId) {
		Date startTime = null;
        Date endTime = null;
        try {
            startTime = new SimpleDateFormat("yyyy-MM").parse(yearMonth);
            endTime = new SimpleDateFormat("yyyy-MM").parse(yearMonth);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
        Report report = new Report();
        report.setUserId(userId);
        report.setResultDateFormat(Report.TIME_MONTH_DAY);
        report.setTimeFormat(Report.TIME_YEAR_MONTH);
        report.setStartTime(startTime);
        report.setEndTime(endTime);
        
        List<Map<String, Object>> list = null;
        try {
            list = reportMapper.countFollowupByDate(report);
        }catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IReportService#countCustomerByCategoryWithYear(java.lang.String, java.lang.String, java.lang.Integer)
	 */
	@Override
	public List<Map<String, Object>> countCustomerByCategoryWithYear(
			String category, String year, Integer userId) {
		Date date = null;
        try {
            date = new SimpleDateFormat("yyyy").parse(year);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
        Report report = new Report();
        report.setUserId(userId);
        report.setCategory(category);
        report.setResultDateFormat(Report.TIME_YEAR);
        report.setTimeFormat(Report.TIME_YEAR);
        report.setStartTime(date);
        report.setEndTime(date);
        
        List<Map<String, Object>> list = null;
        try {
            list = reportMapper.countCustomerByCategory(report);
        }catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IReportService#countCustomerByCategoryWithMonth(java.lang.String, java.lang.String, java.lang.Integer)
	 */
	@Override
	public List<Map<String, Object>> countCustomerByCategoryWithMonth(
			String category, String yearMonth, Integer userId) {
		Date startTime = null;
        Date endTime = null;
        try {
            startTime = new SimpleDateFormat("yyyy-MM").parse(yearMonth);
            endTime = new SimpleDateFormat("yyyy-MM").parse(yearMonth);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
        Report report = new Report();
        report.setUserId(userId);
        report.setCategory(category);
        report.setResultDateFormat(Report.TIME_YEAR_MONTH);
        report.setTimeFormat(Report.TIME_YEAR_MONTH);
        report.setStartTime(startTime);
        report.setEndTime(endTime);
        
        List<Map<String, Object>> list = null;
        try {
            list = reportMapper.countCustomerByCategory(report);
        }catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IReportService#countCustomerByCategoryWithDay(java.lang.String, java.lang.String, java.lang.Integer)
	 */
	@Override
	public List<Map<String, Object>> countCustomerByCategoryWithDay(
			String category, String yearMonthDay, Integer userId) {
		Date startTime = null;
        Date endTime = null;
        try {
            startTime = new SimpleDateFormat("yyyy-MM-dd").parse(yearMonthDay);
            endTime = new SimpleDateFormat("yyyy-MM-dd").parse(yearMonthDay);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
        Report report = new Report();
        report.setUserId(userId);
        report.setCategory(category);
        report.setResultDateFormat(Report.TIME_MONTH_DAY);
        report.setTimeFormat(Report.TIME_YEAR_MONTH_DAY);
        report.setStartTime(startTime);
        report.setEndTime(endTime);
        
        List<Map<String, Object>> list = null;
        try {
            list = reportMapper.countCustomerByCategory(report);
        }catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IReportService#countManagerService(java.lang.String, java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public List<Map<String, Object>> countManagerService(String service,
			Integer day, Integer userId) {
		Report report = new Report();
        if(service != null && !"".equals(service)) {
            //对前端传来的数据进行判断，防止SQL注入
            if(service.equals(Report.SERVICE_STATUS)) {
                report.setService(Report.SERVICE_STATUS);
                //对应数据字典类型ID为78
                report.setDictionaryTypeId(78);
            }else if(service.equals(Report.SERVICE_TYPE)){
                //对应数据字典类型ID为77
                report.setService(Report.SERVICE_TYPE);
                report.setDictionaryTypeId(77);
            }else {
                return null;
            }
            report.setDay(day);
            report.setUserId(userId);
            return reportMapper.countManagerSerivce(report);   
        }else {
            return null;
        }
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IReportService#countAllManagerService(java.lang.String, java.lang.Integer)
	 */
	@Override
	public Map<String, Object> countAllManagerService(String service,
			Integer day) {
		Map<String, Object> map = new HashMap<String,Object>();
        //查询所有的客户经理
        UserExample userExample = new UserExample();
        userExample.createCriteria().andRoleIdEqualTo(1);
        List<User> users = userMapper.selectByExample(userExample);
        //遍历所有客户经理，并封装每个客户经理的服务情况
        for (User user : users) {
            Report report = new Report();
            if(service != null && !"".equals(service)) {
                //对前端传来的数据进行判断，防止SQL注入
                if(service.equals(Report.SERVICE_STATUS)) {
                    report.setService(Report.SERVICE_STATUS);
                    //对应数据字典类型ID为78
                    report.setDictionaryTypeId(78);
                }else if(service.equals(Report.SERVICE_TYPE)){
                    //对应数据字典类型ID为77
                    report.setService(Report.SERVICE_TYPE);
                    report.setDictionaryTypeId(77);
                }
                report.setDay(day);
                report.setUserId(user.getId());
                map.put(user.getAccount(), reportMapper.countManagerSerivce(report));   
            }
        }
        return map;
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IReportService#countManagerCustomerRank(com.crm.wcx.entity.Report)
	 */
	@Override
	public List<Map<String, Object>> countManagerCustomerRank(Report report) {
		// TODO Auto-generated method stub
		return reportMapper.countManagerCustomerRank(report);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IReportService#customerOrderPriceRank(com.crm.wcx.entity.Report)
	 */
	@Override
	public List<Map<String, Object>> customerOrderPriceRank(Report report) {
		// TODO Auto-generated method stub
		return reportMapper.customerOrderPriceRank(report);
	}

	/* (non-Javadoc)
	 * @see com.crm.wcx.service.IReportService#countCustomerSource()
	 */
	@Override
	public List<Map<String, Object>> countCustomerSource() {
		// TODO Auto-generated method stub
		return reportMapper.countCustomerSource();
	}

}
