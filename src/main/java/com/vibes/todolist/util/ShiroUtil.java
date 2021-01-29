package com.vibes.todolist.util;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class ShiroUtil {

    /** 加密方式 */
    public static final String ALGORITHM_NAME = "MD5";
    /** 加密次数 */
    public static final int HASH_ITERATIONS = 1024;
    /** 学生账号默认密码 */
    public static final String STUDENT_DEFAULT_PASSWORD = "123456";

    /**
     * 获取shiro加密后的密文
     *
     * @param salt 盐
     * @param password 密码
     * @return 加密后的密文
     */
    public static String getPassword(final String salt, final String password) {
        final ByteSource saltByte = ByteSource.Util.bytes(salt);
        final Object obj = new SimpleHash(ShiroUtil.ALGORITHM_NAME, password, saltByte, ShiroUtil.HASH_ITERATIONS);
        return obj.toString();
    }

    /**
     * 获取默认密码
     *
     * @param salt 盐
     * @return 加密后的密文
     */
    public static String getDefaultPassword(final String salt) {
        final ByteSource saltByte = ByteSource.Util.bytes(salt);
        final Object obj = new SimpleHash(ShiroUtil.ALGORITHM_NAME, ShiroUtil.STUDENT_DEFAULT_PASSWORD, saltByte,
                ShiroUtil.HASH_ITERATIONS);
        return obj.toString();
    }
}
