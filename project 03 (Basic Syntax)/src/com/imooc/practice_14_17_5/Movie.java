package com.imooc.practice_14_17_5;

public class Movie {
    //成员变量
    private String name;//电影名
    private int year;//上映时间
    private float score;//豆瓣评分

    //getter、setter方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public float getScore() {
        return score;
    }
    public void setScore(float score) {
        this.score = score;
    }

    //构造方法
    public Movie() {
    }
    public Movie(String name, int year, float score) {
        this.name = name;
        this.year = year;
        this.score = score;
    }

    //成员方法
    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", score=" + score +
                '}';
    }
}
