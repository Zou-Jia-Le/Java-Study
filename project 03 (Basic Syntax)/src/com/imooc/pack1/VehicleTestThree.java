package com.imooc.pack1;

public class VehicleTestThree {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("car",180);//实例化对象时会自动先执行构造代码块，后执行构造方法
        car.showInfo();

        System.out.println("\n==================\n");

        Vehicle car1 = new Vehicle("car",180);//实例化对象时会自动先执行构造代码块，后执行构造方法
        car1.showInfo();
    }
}

//总结：静态代码块 ==> 构造代码块 ==> 构造方法 ==> 局部代码块