package com.time.common.utils;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
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
}
