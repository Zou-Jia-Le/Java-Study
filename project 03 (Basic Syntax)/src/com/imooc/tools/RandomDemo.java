package com.imooc.tools;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RandomDemo {
    //静态方法
    /*双色球摇号系统：
    1、红色容器：1～33；蓝色容器：1～16
    2、摇出6个红球号码，摇出1个蓝球号码*/
    public static void lotterySystem() {
        //红色球集合
        List<Integer> redBox = new LinkedList<>();
        for (int i = 1; i < 34; i++) {
            redBox.add(i);
        }
        //蓝色球集合
        List<Integer> blueBox = new LinkedList<>();
        for (int i = 1; i < 17; i++) {
            blueBox.add(i);
        }

        System.out.print("本期双色球开奖号码：");
        Random random = new Random();
        //摇出6个红球
        for (int i = 0; i < 6; i++) {
            //红球的索引编号：0～32
            int r_index = random.nextInt(redBox.size());
            //摇出1个红球
            int red_ball = redBox.get(r_index);
            System.out.print(String.format("%02d", red_ball) + "\t");
            //删除已经摇出的红球
            redBox.remove(r_index);
        }
        //篮球的索引编号：0～15
        int b_dex = random.nextInt(blueBox.size());
        //摇出1个蓝球
        int b_ball = blueBox.get(b_dex);
        System.out.print("+" + String.format("%02d", b_ball) + "\t");
    }

    public static void main(String[] args) {
        Random random = new Random();
        //生成一个随机的整数
        System.out.println(random.nextInt());
        //生成一个[0,100)之间的随机整数
        System.out.println(random.nextInt(100));
        //生成一个随机的 float 类型数值
        System.out.println(random.nextFloat());
        System.out.println("");

        lotterySystem();
    }
}
