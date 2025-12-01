package com.imooc.car;

public class SealCarTest {
    public static void main(String[] args) {
        SealCar seal = new SealCar();//子类不继承父类的构造方法，默认调用父类的构造方法：在创建子类的对象时，JVM 首先调用父类的构造方法，在调用子类的构造方法
        System.out.println("");

        seal.setModel("海豹冠军版");
        seal.drive();//方法重写（由于子类对象优先访问子类自己的成员方法，所以调用的其实是子类的无参 drive 方法 ==> “就近原则”）

        seal.show();//方法重载（由于无参，所以调用的其实是继承父类的无参 show 方法；有参的话就调用的是子类的有参 show 方法 ==> “调用的是哪个看形参，但其实都是子类的方法”）
    }
}
