package com.imooc.interfacedemo;

public interface VehicleSupplement {
    //抽象方法
    void charge();
    void speedUp();

    //默认方法
    default void drive() {
        System.out.println("默认方法，充电行驶的方法");
    }
}
