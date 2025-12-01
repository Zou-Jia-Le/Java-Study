package com.imooc.practice_10_15_3.student;

public class Score {
    //成员变量
    private String name;//姓名
    private double score;//分数

    //构造方法
    public Score(String name, double score) {
        this.name = name;
        this.score = score;
    }

    //成员方法
    public void show() {
        System.out.println(name + "总分: " + score + "分");
    }
}
