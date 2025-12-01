package com.imooc.practice_10_15_3.teacher;

public class Score {
    //成员变量
    private String g_class;//班级
    private double avgScore;//平均分

    //构造方法
    public Score(String g_class, double avgScore) {
        this.g_class = g_class;
        this.avgScore = avgScore;
    }

    //成员方法
    public void show() {
        System.out.println(g_class + "平均分: " + avgScore + "分");
    }
}
