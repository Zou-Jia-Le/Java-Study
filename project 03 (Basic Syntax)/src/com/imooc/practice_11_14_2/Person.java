package com.imooc.practice_11_14_2;

public class Person {
    //成员变量
    protected String name;//姓名
    protected String gender;//性别

    //getter、setter方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    //构造方法
    public Person() {
    }
    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    //成员方法
    protected void interview() {//面试
    }
}
