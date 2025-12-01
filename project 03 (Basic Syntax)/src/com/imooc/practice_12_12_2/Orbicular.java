package com.imooc.practice_12_12_2;

//圆形类
public class Orbicular extends GeometricFigure {
    //成员变量
    private double r;

    //setter、getter方法
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }

    //方法实现
    @Override
    public void calArea() {//计算圆形面积
        double area;
        area = 3.14 * this.r * this.r;
        System.out.println("圆形半径为" + this.r + "，圆形的面积 = " + area);
    }
    @Override
    public void calRound() {//计算圆形周长
        double round;
        round = 3.14 * 2 * this.r;
        System.out.println("圆形半径为" + this.r + "，圆形的周长 = " + round);
    }

    //构造方法
    public Orbicular(double r) {
        this.r = r;
    }
}
