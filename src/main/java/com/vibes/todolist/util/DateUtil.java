/**
 * DateUtil.java
 *
 * @author SinghLee
 * @version V1.0
 * @description 日期相关工具类
 * @history 20191217 xieyan created
 */
package com.vibes.todolist.util;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * DateUtil.java
 *
 * @author SinghLee
 */
public class DateUtil {

    private static final DateTimeFormatter F_YYYYMMDD = DateTimeFormatter.ofPattern("yyyyMMdd");

    /**
     * 当前时间
     *
     * @return
     */
    public static Date now() {
        return new Date();
    }

    /**
     * 当前时间的毫秒数
     *
     * @return
     */
    public static long nowMS() {
        return new Date().getTime();
    }

    /**
     * 当前时间字符串
     * 
     * @return
     */
    public static String nowStr() {
        return String.valueOf(new Date().getTime());
    }

    /**
     * 当前时间字符串(yyyyMMdd)
     * 
     * @return
     */
    public static String nowStrYYYYMMDD() {
        return F_YYYYMMDD.format(LocalDateTime.now());
    }

    /**
     * 当前时间BigDecimal类型
     *
     * @return
     */
    public static BigDecimal nowBigDecimal() {
        return new BigDecimal(String.valueOf(new Date().getTime()));
    }

    public static BigDecimal getNowTime() {
        return new BigDecimal(String.valueOf(new Date().getTime()));
    }

}
