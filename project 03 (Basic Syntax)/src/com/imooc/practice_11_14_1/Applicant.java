package com.imooc.practice_11_14_1;

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
}
