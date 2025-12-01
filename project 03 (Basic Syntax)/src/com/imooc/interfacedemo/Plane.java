package com.imooc.interfacedemo;

public class Plane implements AirPlane {
    //方法实现
    @Override
    public void speedUp() {
    }
    @Override
    public void speedDown() {
    }
    @Override
    public void charge() {
    }

    //成员方法
    @Override
    public void drive() {
        AirPlane.super.drive();//调用接口的默认方法 drive()
    }
    @Override
    public void brake() {
        AirPlane.super.brake();//调用接口的默认方法 brake()
    }
}
