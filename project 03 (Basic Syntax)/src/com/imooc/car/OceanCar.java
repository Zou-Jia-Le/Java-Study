package com.imooc.car;

public class OceanCar {
    //成员变量
    private String model;//型号
    private String level;//级别
    private String size;//长宽高
    private double price;//价格
    private int power;//最大马力

    //getter、setter方法
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    //构造方法
    /*public OceanCar() {
        System.out.println("父类的无参构造方法");
    }*/
    public OceanCar(String model) {
        this.model = model;
        System.out.println("父类的无参构造方法");
    }

    //成员方法
    private void drive() {
        System.out.println(this.model + "正在马路上狂奔");
    }
    public void show() {
        System.out.println("父类的 power：" + power);
    }
    public static void charge() {
        System.out.println("汽车正在充电...");
    }
}
