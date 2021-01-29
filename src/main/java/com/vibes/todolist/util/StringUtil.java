/**
 * StringUtil.java
 * 
 * @author SinghLee
 * @version V1.0
 * @description 字符串处理工具类
 * @history
 * 20191217 xieyan created
 */
package com.vibes.todolist.util;

import org.apache.commons.lang3.StringUtils;

/**
 * StringUtil.java
 * 
 * @author SinghLee
 */
public class StringUtil extends StringUtils {

    private static final String ZERO = "0";

    /**
     * 字符串首字母大写
     * 
     * @param str
     * @return
     */
    public static String upFirstLetter(String str) {
        if (StringUtil.isEmpty(str)) {
            return StringUtil.EMPTY;
        }

        return StringUtils.capitalize(str);
    }

    public static String leftFillZero(String str, int length) {
        int len = str.length();
        while (len < length) {
            str = ZERO + str;
            len = str.length();
        }
        return str;
    }

    public static String rightFillZero(String str, int length) {
        int len = str.length();
        while (len < length) {
            str = str + ZERO;
            len = str.length();
        }
        return str;
    }

    public static String concat(String str, String add) {
        String res = null;
        if (StringUtil.isEmpty(str)) {
            res = add;
        } else if (StringUtil.isEmpty(add)) {
            res = str;
        } else {
            res = str + add;
        }
        return res == null ? StringUtil.EMPTY : res;
    }
}
