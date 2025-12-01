package com.imooc.practice_13_13_2_perfect;

public class Car{
    //静态方法
    static void buyCar() throws NullPointerException {//声明异常
        Object car = null;
        car.toString();
    }

    public static void main(String[] args) {
        try {
            buyCar();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}