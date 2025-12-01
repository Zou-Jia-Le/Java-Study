package com.imooc.gasoline;

public class Tang2023 extends Tang {
    //成员变量
    //被 final 修饰的成员变量一定要赋值，要在该类实例化对象之前就要赋值，且只能赋值一次
    public final String MODEL = "唐";//显示初始化
    public final int YEAR;

    //构造代码块
    {
        this.YEAR = 2023;//构造初始化：在构造代码块中初始化 final 修饰的成员变量（构造代码块早于构造方法执行）
    }

    /*//构造方法
        public Tang2023(int YEAR) {
        this.YEAR = YEAR;//构造初始化：在构造方法中初始化 final 修饰的成员变量（构造方法晚于构造代码块执行）
    }*/

    //成员方法
    public void show2023() {
        System.out.println("比亚迪唐-油车系列已停产，没有2023款");
    }
}
