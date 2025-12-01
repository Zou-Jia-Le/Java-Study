package com.imooc.practice_11_14_1;

public class Recruiter extends Person {
    //成员变量
    public String company;//公司

    //getter、setter方法
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    //构造方法
    public Recruiter(String name, String gender, String company) {
        this.name = name;
        this.gender = gender;
        this.company = company;
    }

    //成员方法
    public void postJob() {//发布岗位
    }
    public void screeningResumes() {//筛选简历
    }
}
