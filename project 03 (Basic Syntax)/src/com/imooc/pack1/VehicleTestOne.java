package com.imooc.pack1;

public class VehicleTestOne {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("car",180);
        car.setSpeed(-20);
        car.showInfo();

        System.out.println("\n============================================\n");

        Vehicle plane = new Vehicle("airplane",4000);
        plane.setSpeed(120);
        plane.showInfo();
    }
}

//静态代码块只会调用一次！！！