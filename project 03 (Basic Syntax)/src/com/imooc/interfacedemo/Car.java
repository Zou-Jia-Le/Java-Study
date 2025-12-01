package com.imooc.interfacedemo;

//接口的实现类
public class Car extends LandVehicle implements Vehicle, VehicleSupplement {//接口实现用 implements 关键字（继承用 extends 关键字）
    //方法实现
    @Override
    public void speedUp() {
        System.out.println("加速行驶");
    }
    @Override
    public void speedDown() {
        System.out.println("减速行驶");
    }
    @Override
    public void charge() {
        System.out.println("汽车正在充电...");
    }

    //成员方法
    @Override
    public void drive() {//重写接口重名的默认方法 drive)()
        Vehicle.super.drive();//调用 Vehicle 接口的默认方法（就近原则）
        System.out.println("汽车正在马路上狂奔...");
    }
}

/*1、非抽象类实现接口，必须重写所有的抽象方法
      2、一个类可以在继承父类的同时，实现多个接口
      3、接口的多实现过程中，重名的抽象方法只需要重写一次
      4、多个接口中有重名的默认方法，必须重写默认方法！！！
      5、父类成员方法和接口默认方法重名，子类执行父类的成员方法*/