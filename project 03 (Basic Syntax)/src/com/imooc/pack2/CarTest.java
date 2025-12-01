package com.imooc.pack2;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("car",180);
        car.setSpeed(-20);
        car.showInfo();

        System.out.println("");

        Car plane = new Car("airplane",4000);
        plane.setSpeed(120);
        plane.showInfo();
    }
}

