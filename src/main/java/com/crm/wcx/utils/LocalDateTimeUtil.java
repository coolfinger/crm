package com.crm.wcx.utils;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;

/**
 * 
 * @ClassName: LocalDateTimeUtil 
 * @Description: TODO
 * @author: CoolFingers
 * @date: 2018年11月10日 上午10:08:41
 */
public class LocalDateTimeUtil {

    //获取当前时间的LocalDateTime对象
    //LocalDateTime.now();

    //根据年月日构建LocalDateTime
    //LocalDateTime.of();

    //比较日期先后
    //LocalDateTime.now().isBefore(),
    //LocalDateTime.now().isAfter(),

    /**
     * 
    * @Title: convertDateToLDT 
    * @Description: Date转换为LocalDateTime 
    * @param date
    * @return LocalDateTime
    * @author CoolFingers
    * @date 2018年11月10日上午10:08:54
     */
    public static LocalDateTime convertDateToLDT(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }

    /**
     * 
    * @Title: convertLDTToDate 
    * @Description: LocalDateTime转换为Date 
    * @param time
    * @return Date
    * @author CoolFingers
    * @date 2018年11月10日上午10:09:03
     */
    public static Date convertLDTToDate(LocalDateTime time) {
        return Date.from(time.atZone(ZoneId.systemDefault()).toInstant());
    }


    /**
     * 
    * @Title: getMilliByTime 
    * @Description: 获取指定日期的毫秒 
    * @param time
    * @return Long
    * @author CoolFingers
    * @date 2018年11月10日上午10:09:13
     */
    public static Long getMilliByTime(LocalDateTime time) {
        return time.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    /**
     * 
    * @Title: getSecondsByTime 
    * @Description: 获取指定日期的秒 
    * @param time
    * @return Long
    * @author CoolFingers
    * @date 2018年11月10日上午10:09:21
     */
    public static Long getSecondsByTime(LocalDateTime time) {
        return time.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond();
    }

    /**
     * 
    * @Title: formatTime 
    * @Description: 获取指定时间的指定格式 
    * @param time
    * @param pattern
    * @return String
    * @author CoolFingers
    * @date 2018年11月10日上午10:09:33
     */
    public static String formatTime(LocalDateTime time,String pattern) {
        if(time != null) {
            return time.format(DateTimeFormatter.ofPattern(pattern));
        }
        return null;
    }

    /**
     * 
    * @Title: formatNow 
    * @Description: 获取当前时间的指定格式 
    * @param pattern
    * @return String
    * @author CoolFingers
    * @date 2018年11月10日上午10:09:41
     */
    public static String formatNow(String pattern) {
        return  formatTime(LocalDateTime.now(), pattern);
    }

    /**
     * 
    * @Title: plus 
    * @Description: 日期加上一个数,根据field不同加不同值,field为ChronoUnit.* 
    * @param time
    * @param number
    * @param field
    * @return LocalDateTime
    * @author CoolFingers
    * @date 2018年11月10日上午10:09:54
     */
    public static LocalDateTime plus(LocalDateTime time, long number, TemporalUnit field) {
        return time.plus(number, field);
    }

    /**
     * 
    * @Title: minu 
    * @Description: 日期减去一个数,根据field不同减不同值,field参数为ChronoUnit.* 
    * @param time
    * @param number
    * @param field
    * @return LocalDateTime
    * @author CoolFingers
    * @date 2018年11月10日上午10:10:03
     */
    public static LocalDateTime minu(LocalDateTime time, long number, TemporalUnit field){
        return time.minus(number,field);
    }

    /**
     * 
    * @Title: betweenTwoTime 
    * @Description: 获取两个日期的差  field参数为ChronoUnit.* 
    * @param startTime
    * @param endTime
    * @param field
    * @return long
    * @author CoolFingers
    * @date 2018年11月10日上午10:10:12
     */
    public static long betweenTwoTime(LocalDateTime startTime, LocalDateTime endTime, ChronoUnit field) {
        Period period = Period.between(LocalDate.from(startTime), LocalDate.from(endTime));
        if (field == ChronoUnit.YEARS) {
            return period.getYears();
        }
        if (field == ChronoUnit.MONTHS) {
            return period.getYears() * 12 + period.getMonths()  ;
        }
        return field.between(startTime, endTime);
    }

    /**
     * 
    * @Title: getDayStart 
    * @Description: 获取一天的开始时间，2017,7,22 00:00 
    * @param time
    * @return LocalDateTime
    * @author CoolFingers
    * @date 2018年11月10日上午10:10:22
     */
    public static LocalDateTime getDayStart(LocalDateTime time) {
        return time.withHour(0)
                .withMinute(0)
                .withSecond(0)
                .withNano(0);
    }

    /**
     * 
    * @Title: getDayEnd 
    * @Description: 获取一天的结束时间，2017,7,22 23:59:59.999999999 
    * @param time
    * @return LocalDateTime
    * @author CoolFingers
    * @date 2018年11月10日上午10:10:32
     */
    public static LocalDateTime getDayEnd(LocalDateTime time) {
        return time.withHour(23)
                .withMinute(59)
                .withSecond(59)
                .withNano(999999999);
    }
    
    /**
     * 
    * @Title: parse 
    * @Description: String转为LocalDateTime 
    * @param localDateTimeStr
    * @param pattern
    * @return LocalDateTime
    * @author CoolFingers
    * @date 2018年11月10日上午10:10:41
     */
    public static LocalDateTime parse(String localDateTimeStr, String pattern){
        DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.parse(localDateTimeStr, df);
    }

}