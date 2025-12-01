package com.imooc.abstractdemo;

//抽象类
public abstract class  Vehicle {
    //抽象方法
    public abstract void drive();

    //成员方法
    public void speedUP(){
        System.out.println("加速行驶");
    }
}

/*有关抽象类的总结:
1、有抽象方法的类必须是抽象类
2、抽象类中可以没有抽象方法
3、抽象类不能实例化对象，必须被子类继承*/