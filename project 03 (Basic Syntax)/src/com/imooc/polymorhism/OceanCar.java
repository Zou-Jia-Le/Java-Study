package com.imooc.polymorhism;

public class OceanCar {
    //成员变量
    protected int speed;//最高时速
    protected int power;//最高马力

    //getter、setter 方法
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    //构造方法
    public OceanCar() {
    }

    //成员方法
    public void drive() {
        System.out.println("正在马路上狂奔");
    }
}
