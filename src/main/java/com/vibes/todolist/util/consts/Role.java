/**
 * Role.java
 * 
 * @author SinghLee
 * @version V1.0
 * @description 用户角色定义
 * @history
 * 2019-12-30 xy 初始做成
 */
package com.vibes.todolist.util.consts;

/**
 * Role.java
 * 
 * @author SinghLee
 */
public enum Role {

    SuperAdmin("0", "超级管理员"), SuperResAdmin("1", "爱丁素材管理员"), SchoolAdmin("21", "学校管理员"), SchoolManager("22",
            "超级管理员"), SchoolTeacher("23", "超级管理员");

    private String id;
    private String name;

    private Role(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
