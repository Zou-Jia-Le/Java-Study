package com.imooc.practice_15_16_3;

public enum Position {
    //枚举常量对象列表
    VISITOR(1,"我是游客"),//游客
    TRAINEE(2,"我是学员"),//学员
    INSTRUCTOR(3,"我是讲师"),//讲师
    ADMINISTRATOR(4,"我是管理员"),//管理员
    SUPERADMINISTRATOR(5,"我是超级管理员");//超级管理员

    //成员变量
    private int statusCode;//状态码
    private String descriptionInformation;//描述信息

    //getter、setter方法
    public int getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    public String getDescriptionInformation() {
        return descriptionInformation;
    }
    public void setDescriptionInformation(String descriptionInformation) {
        this.descriptionInformation = descriptionInformation;
    }

    //构造方法
    Position(int statusCode, String descriptionInformation) {
        this.statusCode = statusCode;
        this.descriptionInformation = descriptionInformation;
    }

    //成员方法
    @Override
    public String toString() {
        return "Position{" +
                "statusCode=" + statusCode +
                ", descriptionInformation='" + descriptionInformation + '\'' +
                '}';
    }
}
