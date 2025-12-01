package com.imooc.practice_14_17_4;

import com.imooc.practice_14_17_3.Movie;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        com.imooc.practice_14_17_3.Movie movie1 = new com.imooc.practice_14_17_3.Movie("肖申克的救赎",1994,9.7F);
        com.imooc.practice_14_17_3.Movie movie2 = new com.imooc.practice_14_17_3.Movie("阿甘正传",1994,9.5F);
        com.imooc.practice_14_17_3.Movie movie3 = new com.imooc.practice_14_17_3.Movie("千与千寻",2001,9.4F);
        com.imooc.practice_14_17_3.Movie movie4 = new com.imooc.practice_14_17_3.Movie("星际穿越",2014,9.4F);
        com.imooc.practice_14_17_3.Movie movie5 = new com.imooc.practice_14_17_3.Movie("楚门的世界",1998,9.4F);
        com.imooc.practice_14_17_3.Movie movie6 = new com.imooc.practice_14_17_3.Movie("放牛班的春天",2004,9.3F);
        com.imooc.practice_14_17_3.Movie movie7 = new com.imooc.practice_14_17_3.Movie("当幸福来敲门",2006,9.2F);

        List<com.imooc.practice_14_17_3.Movie> movieList = new LinkedList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);
        movieList.add(movie6);
        movieList.add(movie7);
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
        System.out.println("");

        com.imooc.practice_14_17_3.Movie movie8 = new com.imooc.practice_14_17_3.Movie("霸王别姬",1993,9.6F);
        movieList.add(1,movie8);//添加元素：霸王别姬
        movieList.remove(movieList.size()-1);//删除最后一个元素
        movie5.setScore(9.5F);
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }
}
