package com.imooc.polymorhism;

public class SeagullCar extends OceanCar {
    //成员变量
    private int speed = 130;//最高时速
    private int power = 350;//最高马力

    //getter、setter 方法
    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    @Override
    public int getPower() {
        return power;
    }
    @Override
    public void setPower(int power) {
        this.power = power;
    }

    //构造方法
    public SeagullCar() {
    }

    //成员方法
    @Override
    public void drive() {
        System.out.println("海鸥正在马路上狂奔，最高时速：" + this.speed + "千米/小时");
    }
    public void speedUp() {
        System.out.println("海鸥汽车加速行驶");
    }
}