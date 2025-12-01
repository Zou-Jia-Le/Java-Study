package com.imooc.practice_14_17_3;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Movie movie1 = new Movie("肖申克的救赎",1994,9.7F);
        Movie movie2 = new Movie("阿甘正传",1994,9.5F);
        Movie movie3 = new Movie("千与千寻",2001,9.4F);
        Movie movie4 = new Movie("星际穿越",2014,9.4F);
        Movie movie5 = new Movie("楚门的世界",1998,9.4F);
        Movie movie6 = new Movie("放牛班的春天",2004,9.3F);
        Movie movie7 = new Movie("当幸福来敲门",2006,9.2F);

        List<Movie> movieList = new LinkedList<>();
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
    }
}
