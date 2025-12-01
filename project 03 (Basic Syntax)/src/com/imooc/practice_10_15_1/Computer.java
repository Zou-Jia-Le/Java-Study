package com.imooc.practice_10_15_1;

public class Computer {
    //成员变量
    private String brandName;
    private String modelNumber;

    //getter、setter方法
    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public String getModelNumber() {
        return modelNumber;
    }
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    //构造方法
    public Computer() {
    }
    public Computer(String brandName, String modelNumber) {
        this.brandName = brandName;
        this.modelNumber = modelNumber;
    }

    //成员方法
    public void work() {//工作方法
        System.out.println(getBrandName() + " " + getModelNumber() + " 工作效率非常高");
    }
    public void diversion() {//娱乐方法
        System.out.println(getBrandName() + " " +  getModelNumber() + " 听音乐也不错～");
    }

}
