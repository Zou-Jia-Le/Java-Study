package com.imooc.tools;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        //由于二进制没办法表示某些十进制浮点数，所以在进行浮点数计算时可能会出现误差，这是所有高级计算机语言都存在的问题
        double d1 = 0.1;
        double d2 = 0.2;
        System.out.println(d1 + d2);
        System.out.println("");

        //创建 BigDecimal 对象（建议参数使用字符串的数值表现形式，更加精确！）
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");
        //加减乘除运算
        System.out.println("0.1 + 0.2 = " + bd1.add(bd2));
        System.out.println("0.1 - 0.2 = " + bd1.subtract(bd2));
        System.out.println("0.1 * 0.2 = " + bd1.multiply(bd2));
        System.out.println("0.1 / 0.2 = " + bd1.divide(bd2));
    }
}
