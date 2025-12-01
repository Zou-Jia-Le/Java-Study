package com.imooc.practice_10_15_2;

public class Order {
    //静态变量
    public static int totalnum;//总销量

    //构造方法
    public Order() {
    }
    public Order(int num) {//销量
        Order.totalnum += num;//创建对象时，访问静态变量
    }

    //静态方法
    public static void showInfo() {
        System.out.println("小慕的销售总量为 " + Order.totalnum + " 部手机");
    }
}
