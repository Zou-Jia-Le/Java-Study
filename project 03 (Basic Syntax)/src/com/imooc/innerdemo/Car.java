package com.imooc.innerdemo;

import com.imooc.interfacedemo.Vehicle;

//外部类
public class Car {
    //静态变量
    public static String serialNumber = "007";

    //成员变量
    private String brand = "外部类 - 比亚迪";//品牌

    /*//成员内部类：
    1、内部类可以直接访问外部类的成员，包括私有成员
    2、外部类访问内部成员，必须创建内部类对象
    3、外部类的内部，实例化内部类：内部类 对象名 = new 内部类()
    4、外部类的外部，实例化内部类：外部类.内部类 对象名 = new 外部类().new 内部类()
    5、内部类：public、protected、默认、private
    6、外部类：public、默认
    7、private 修饰的内部类，只能在外部类的内部实例化对象
    8、内部类中，不允许定义静态成员
    9、内部类中，访问外部类对象：外部类名.this*/

    //成员内部类
    public class Engine {
        /*//静态变量
        public static String serialNumber = "007";成员内部类中，不允许定义静态成员！！！*/

        //成员变量
        private String model = "BYD-EV";//型号
        private String brand = "内部类 - 比亚迪";//品牌

        //成员方法
        public void show() {
            System.out.println("汽车品牌：" + brand);
            System.out.println("汽车品牌：" + Engine.this.brand);
            System.out.println("汽车品牌：" + Car.this.brand);
        }
    }

    /*//静态内部类：
    1、静态内部类，不能直接访问外部类的非静态成员
    2、静态内部类，可以直接访问外部类的静态成员
    3、外部类的内部，访问静态内部类中的静态成员：静态类名.静态成员
    4、外部类的外部，访问静态内部类中的静态成员：外部类名.静态内部类名.静态成员
    5、外部类的内部，实例化静态内部类：内部类名 对象名 = new 内部类()
    6、外部类的外部，实例化静态内部类：外部类.内部类 对象名 = new 外部类.内部类()
    7、访问内部类的非静态成员，先实例化静态内部类，通过静态内部类对象访问*/

    //静态内部类
    public static class ControlSystem {
        //静态方法
        public static void show() {
            System.out.println("静态内部类 - 静态方法");
        }

        //成员方法
        public void lightControl() {
            System.out.println("序列号：" + serialNumber);
        }
    }

    //成员方法
    public void drive() {
        //成员内部类对象
        Engine engine = new Engine();
        //访问成员内部类的成员变量
        System.out.println(engine.model);
        //访问成员内部类的成员方法
        engine.show();

        //访问静态内部类的静态方法
        ControlSystem.show();
        //静态内部类对象
        ControlSystem cs = new ControlSystem();
        //访问静态内部类的成员方法
        cs.lightControl();
    }
    public void drive(Vehicle v) {//方法重载
        v.speedUp();
        v.speedDown();
    }
}
