package com.imooc.interfacedemo;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.speedUp();//Car 的方法实现
        car.speedDown();//Car 的方法实现
        car.charge();//Car 的方法实现
        car.brake();//Car 的成员方法
        car.drive();//Car 的成员方法,其内部还调用了 Vehicle 接口的默认方法（就近原则）
        System.out.println("");

        Vehicle.showSpeed();//Vehicle 的静态方法
        System.out.println("");

        MountainBike bike = new MountainBike();
        bike.drive();//MountainBike 的成员方法
    }
}
