package com.imooc.interfacedemo;

public class MountainBike implements Vehicle {
    //实现方法：子类对父类抽象方法的实现
    @Override
    public void speedUp() {
    }
    @Override
    public void speedDown() {
    }

    //成员方法
    @Override
    public void drive() {//重写接口的默认方法 drive)()
        System.out.println("山地自行车-车胎宽，阻力大，上坡锻炼身体，下坡省油～");
    }
}
