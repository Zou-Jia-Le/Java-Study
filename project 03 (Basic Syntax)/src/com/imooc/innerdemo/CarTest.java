package com.imooc.innerdemo;

import com.imooc.interfacedemo.Vehicle;

public class CarTest {
    public static void main(String[] args) {
        //外部类：
        //外部类对象
        Car car = new Car();
        //外部类的成员方法
        car.drive();
        System.out.println("");

        //成员内部类：
        //成员内部类对象
        Car.Engine engine = new Car().new Engine();
        //访问成员内部类的成员方法
        engine.show();
        System.out.println("");

        //静态内部类：
        //访问静态内部类中的静态方法
        Car.ControlSystem.show();
        //静态内部类对象
        Car.ControlSystem cs = new Car.ControlSystem();
        //访问静态内部类的成员方法
        cs.lightControl();
        System.out.println("");

        /*//匿名内部类：
        1、包含：继承或实现关系、方法重写、创建对象
        2、等号右侧：匿名内部类，定义并创建接口的子类对象
        3、等号左侧：多态赋值，接口类型引用指向子类对象*/

        //匿名内部类：
        Vehicle vehicle = new Vehicle() {
            @Override
            public void speedUp() {
                System.out.println("加速行驶");
            }
            @Override
            public void speedDown() {
                System.out.println("减速行驶");
            }
        };
        vehicle.speedUp();
        vehicle.speedDown();

        System.out.println("");

        car.drive(vehicle);
        car.drive(new Vehicle() {
            @Override
            public void speedUp() {
                System.out.println("小邹加速行驶");
            }
            @Override
            public void speedDown() {
                System.out.println("小邹减速行驶");
            }
        });
    }
}
