package com.imooc.practice_11_14_2;

public class Applicant extends Person {
    //成员变量
    private int age;//年龄

    //getter、setter方法
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //构造方法
    public Applicant(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //成员方法
    public void browseVacancies() {//浏览岗位
    }
    public void submitCV() {//投递简历
    }
    @Override
    public void interview() {//面试
        System.out.println("应聘者：" + this.name);
        System.out.println("性别：" + this.gender);
        System.out.println("年龄：" + this.age);
        System.out.println("已收到面试邀请，准时赴约！");
    }
}
