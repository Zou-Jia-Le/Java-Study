package com.imooc.practice_16_20_2;

import java.util.Random;

public class Race implements Runnable {
    //成员变量
    private String name;//选手名字
    private int distance = 0;//已跑路程
    private static Boolean flag = false;

    //成员对象
    private Random random = new Random();

    //getter、setter方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //方法实现
    @Override
    public void run() {
        while (true) {
            distance++;
            if (this.name.equals("乌龟") && distance < 100 && distance % 1 == 0) {
                try {
                    int randomNumber = random.nextInt(11);
                    System.out.println(this.name + "跑了\t" + this.distance + "\t米，现在需要休息\t" + randomNumber + "\t毫秒");
                    Thread.currentThread().sleep(randomNumber);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            if (this.name.equals("兔子") && distance < 100 && distance % 10 == 0) {
                try {
                    System.out.println(this.name + "跑了\t" + this.distance + "\t米，现在需要休息\t200\t毫秒");
                    Thread.currentThread().sleep(200);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            if (distance == 100 && flag == false) {
                synchronized (this) {
                    System.out.println("");
                    System.out.println(this.name + "率先完成了比赛，获得了冠军！");
                    System.out.println("");
                    flag = true;
                    break;
                }
            }
            if (distance == 100 && flag == true) {
                System.out.println("");
                System.out.println(this.name + "完成了比赛，比赛结束！");
                break;
            }
        }
    }

    //构造方法
    public Race (String name) {
        this.name = name;
    }
}
