package com.imooc.abstractdemo;

public class MountainBike extends Bicycle {
    //实现方法：子类对父类抽象方法的实现
    @Override
    public void drive() {
        System.out.println("轮胎宽，阻力大，上坡锻炼身体，下坡省油～");
    }
}
