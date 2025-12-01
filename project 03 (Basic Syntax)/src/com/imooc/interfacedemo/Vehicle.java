package com.imooc.interfacedemo;

//接口，接口不能实例化对象
public interface Vehicle {
    //静态常量：
    //默认添加 public static final 修饰符
    public static final int minSpeed = 0;

    //抽象方法：
    //默认添加 public abstract 修饰符
    public abstract void speedUp();
    public abstract void speedDown();

    //静态方法：
    //静态方法是属于接口的（定义在类中就属于类），不能被继承，接口中的静态方法只能通过接口名直接调用
    static void showSpeed() {
        System.out.println("静态方法 - minSpeed = " + minSpeed);
    }

    //默认方法：
    //子类可以直接使用默认方法，也可以根据实际需要重写默认方法
    default void drive() {
        System.out.println("默认方法，行驶的方法");
    }
    default void brake() {
        System.out.println("接口默认方法，刹车的方法");
    }
}
