package com.imooc.practice_12_12_2;

//矩形类
public class Rectangles extends GeometricFigure {
    //成员变量
    private double a;
    private double b;

    //getter、setter方法
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    //方法实现
    @Override
    public void calArea() {//计算矩形面积
        double area;
        area = a * b;
        System.out.println("矩形两边长分别为" + this.a + "、" + this.b + "，矩形的面积 = " + area);
    }
    @Override
    public void calRound() {//计算矩形周长
        double round;
        round = 2 * (a + b);
        System.out.println("矩形两边长分别为" + this.a + "、" + this.b + "，矩形的周长 = " + round);
    }

    //构造方法
    public Rectangles(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
