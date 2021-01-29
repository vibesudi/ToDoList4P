/**
 * UuidUtil.java
 * 
 * @author SinghLee
 * @version V1.0
 * @description 数据库ID工具类
 * @history
 * 20191217 xieyan created
 */
package com.vibes.todolist.util;

import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

import com.vibes.todolist.util.consts.Const.SpecialChar;

/**
 * UuidUtil.java
 * 
 * @author SinghLee
 */
public class UuidUtil {

    /**
     * 获取ID
     * 
     * @return
     */
    public static String getId() {
        return StringUtils.replace(String.valueOf(UUID.randomUUID()), SpecialChar.MID_LINE, StringUtils.EMPTY);
    }

    /**
     * 左补字符串
     * 
     * @param str
     *            原字符串
     * @param fillStr
     *            填补字符
     * @param length
     *            需要的长度
     * @return
     */
    public static String leftFill(String str, String fillStr, int length) {
        int len = str.length();
        while (len < length) {
            str = fillStr + str;
        }
        return str;
    }

    /**
     * 左补0
     * 
     * @param id
     *            id
     * @param length
     *            总长度
     * @return
     */
    public static String leftFillZero(Integer id, int length) {
        if (null == id) {
            id = 1;
        } else {
            ++id;
        }

        String idStr = String.valueOf(id);
        return StringUtil.leftFillZero(idStr, length);
    }

}
