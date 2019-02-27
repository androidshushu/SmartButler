package com.shushu.smartbutlerapp.entity;

/**
 * 项目名：    SmartButlerApp
 * 包名：      com.shushu.smartbutlerapp.entity
 * 文件名：    UserBean
 * Created by shushu on 2019/1/27.
 * 创建时间：  2019.2019/1/27.14:28 .
 * 描述：  TODO
 */

public class UserBean {
    private String name; //姓名
    private int age; //年龄

    public UserBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
