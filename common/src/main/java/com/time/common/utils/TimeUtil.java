package com.time.common.utils;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author yanghao
 */
public class TimeUtil {

    /**
     * LocalDateTime转Date
     *
     * @param localDateTime
     * @return
     */
    public static Date localDateTimeToDate(LocalDateTime localDateTime){
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * Date转LocalDateTime
     *
     * @param date
     * @return
     */
    public static LocalDateTime dateToLocalDateTime(Date date){
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    /**
     * 获取当前日期，带时分秒
     *
     * @return
     */
    public static Date getNow() {
        return localDateTimeToDate(LocalDateTime.now());
    }

    /**
     * 获取两个日期相差的天数
     *
     * @param start
     * @param end
     * @return
     */
    public static Long getDayMinusBetweenTowDays(Date start, Date end) {
        LocalDateTime localStart = dateToLocalDateTime(start);
        LocalDateTime localEnd = dateToLocalDateTime(end);
        return Duration.between(localStart,localEnd).toDays();
    }

    /**
     * 获取两个日期相差小时数
     *
     * @param start
     * @param end
     * @return
     */
    public static Long getHourMinusBetweenTowDays(Date start, Date end){
        LocalDateTime localStart = dateToLocalDateTime(start);
        LocalDateTime localEnd = dateToLocalDateTime(end);
        return Duration.between(localStart,localEnd).toHours();
    }

    /**
     * 获取两个日期相差的分钟数
     *
     * @param start
     * @param end
     * @return
     */
    public static Long getMinuteMinusBetweenTowDays(Date start, Date end){
        LocalDateTime localStart = dateToLocalDateTime(start);
        LocalDateTime localEnd = dateToLocalDateTime(end);
        return Duration.between(localStart,localEnd).toMinutes();
    }

    /**
     * 获取两个日期相差的毫秒数
     *
     * @param start
     * @param end
     * @return
     */
    public static Long getMillisMinusBetweenTowDays(Date start, Date end){
        LocalDateTime localStart = dateToLocalDateTime(start);
        LocalDateTime localEnd = dateToLocalDateTime(end);
        return Duration.between(localStart,localEnd).toMillis();
    }

    /**
     * 获取自定义年月日时分时间
     *
     * @param year
     * @param month
     * @param day
     * @param hours
     * @param minutes
     * @return
     */
    public static Date getCustomDate(int year, int month, int day, int hours, int minutes){
        return localDateTimeToDate(LocalDateTime.of(year, month, day, hours, minutes));
    }

    /**
     * 获取自定义年月日时分秒时间
     *
     * @param year
     * @param month
     * @param day
     * @param hours
     * @param minutes
     * @param seconds
     * @return
     */
    public static Date getCustomDate(int year, int month, int day, int hours, int minutes, int seconds){
        return localDateTimeToDate(LocalDateTime.of(year, month, day, hours, minutes, seconds));
    }

    /**
     * 减天
     *
     * @param beforeMinusTime
     * @param minusDays
     * @return
     */
    public static LocalDateTime minusDays(LocalDateTime beforeMinusTime, int minusDays){
        return beforeMinusTime.minusDays(minusDays);
    }

    /**
     * 加天
     *
     * @param beforePlusTime
     * @param plusDays
     * @return
     */
    public static LocalDateTime plusDays(LocalDateTime beforePlusTime, int plusDays){
        return beforePlusTime.plusDays(plusDays);
    }

    /**
     * 减月
     *
     * @param beforeMinusTime
     * @param minusMonths
     * @return
     */
    public static LocalDateTime minusMonth(LocalDateTime beforeMinusTime, int minusMonths){
        return beforeMinusTime.minusMonths(minusMonths);
    }

    /**
     * 加月
     *
     * @param beforePlusTime
     * @param plusMonths
     * @return
     */
    public static LocalDateTime plusMonth(LocalDateTime beforePlusTime, int plusMonths){
        return beforePlusTime.plusMonths(plusMonths);
    }

    /**
     * 减时
     *
     * @param beforeMinusTime
     * @param minusHours
     * @return
     */
    public static LocalDateTime minusHours(LocalDateTime beforeMinusTime, int minusHours){
        return beforeMinusTime.minusHours(minusHours);
    }

    /**
     * 加时
     *
     * @param beforePlusTime
     * @param plusHours
     * @return
     */
    public static LocalDateTime plusHours(LocalDateTime beforePlusTime, int plusHours){
        return beforePlusTime.plusHours(plusHours);
    }

    /**
     * 减分
     *
     * @param beforeMinusTime
     * @param minusMinutes
     * @return
     */
    public static LocalDateTime minusMinutes(LocalDateTime beforeMinusTime, int minusMinutes){
        return beforeMinusTime.minusMinutes(minusMinutes);
    }

    /**
     * 加分
     *
     * @param beforePlusTime
     * @param plusMinutes
     * @return
     */
    public static LocalDateTime plusMinutes(LocalDateTime beforePlusTime, int plusMinutes){
        return beforePlusTime.plusMinutes(plusMinutes);
    }

    /**
     * 减年
     *
     * @param beforeMinusTime
     * @param minusYears
     * @return
     */
    public static LocalDateTime minusYears(LocalDateTime beforeMinusTime, int minusYears){
        return beforeMinusTime.minusYears(minusYears);
    }

    /**
     * 加年
     *
     * @param beforePlusTime
     * @param plusYears
     * @return
     */
    public static LocalDateTime plusYears(LocalDateTime beforePlusTime, int plusYears){
        return beforePlusTime.plusYears(plusYears);
    }
}
