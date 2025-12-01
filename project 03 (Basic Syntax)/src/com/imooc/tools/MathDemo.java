package com.imooc.tools;

public class MathDemo {
    public static void main(String[] args) {
        //向上取整、向下取整、四舍五入
        float price = 915.28F;
        System.out.println("向上取整 => " + Math.ceil(price));//916.0//接收一个 double 型参数，返回一个 double 型值
        System.out.println("向下取整 => " + Math.floor(price));//915.0//接收一个 double 型参数，返回一个 double 型值
        System.out.println("四舍五入 => " + Math.round(price));//915//对于一个 float 型参数，返回一个 int 型值；对于一个 double 型参数，返回一个 long 型值;
        System.out.println("");

        //生成随机数
        //[0,1)之间的随机数
        double rand1 = Math.random();
        System.out.println("rand1 = " + rand1);
        //[1,100)之间的随机数
        double rand2 = Math.random() * 99 + 1;
        System.out.println("rand2 = " + rand2);
        //[10,100]之间的随机整数
        int rand3 = (int)Math.ceil((Math.random() * 90)) + 10;//向上取整了,保证右封闭
        System.out.println("rand3 = " + rand3);
        System.out.println("");

        //返回最大值，最小值
        System.out.println("max = " + Math.max(rand1,rand2));
        System.out.println("min = " + Math.min(rand2,rand3));
        System.out.println("");

        //计算圆的面积
        double r = 9.9;
        double area = Math.PI * Math.pow(r, 2);//圆的面积 = π * r的平方
        area = Math.round(area * 100) / 100.0;//四舍五入//double 型 * 100 / 100.0 -> 精确到小数点后两位
        System.out.println("area = " + area);
    }
}
