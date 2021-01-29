package com.vibes.todolist.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptUtil {

    private static final String DEFAULT_PASS = "123456";

    /**
     * 密码加密
     * 
     * @param password
     *            原密码
     * @return
     */
    public static String encode(String password) {
        BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
        String hashPass = bcryptPasswordEncoder.encode(password);
        return hashPass;
    }

    /**
     * 密码匹配
     * 
     * @param password
     *            原密码
     * @param encodedPassword
     *            加密后密码
     * @return
     */
    public static boolean match(String password, String encodedPassword) {
        BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
        boolean result = bcryptPasswordEncoder.matches(password, encodedPassword);
        return result;
    }

    /**
     * 默认密码
     * 
     * @return 返回加密后的默认密码
     */
    public static String getDefaultPass() {
        return encode(DEFAULT_PASS);
    }

    public static void main(String[] args) {
        System.out.println(getDefaultPass());
    }
}
