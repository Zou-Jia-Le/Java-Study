package com.imooc.interfacedemo;

public interface AirPlane extends Vehicle, VehicleSupplement {
    //成员方法
    @Override
    default void drive() {//重写父接口重名的默认方法 drive)()
        System.out.println("飞机翱翔在蓝天");
    }
}
