package com.imooc.practice_14_17_5;

import com.imooc.practice_14_17_3.Movie;
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
        System.out.println("");

        Movie movie8 = new Movie("霸王别姬",1993,9.6F);
        movieList.add(1,movie8);//添加元素：霸王别姬
        movieList.remove(movieList.size() - 1);//删除最后一个元素
        movie5.setScore(9.5F);//将《楚门的世界》的评分改为9.5分
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
        System.out.println("");

        for (int i = 0; i < movieList.size() - 1; i++) {
            Movie item = movieList.get(i);
            //将评分低于9.5分的电影从集合中删除
            if(item.getScore() < 9.5F){
                movieList.remove(i);
            }
            System.out.println(movieList.get(i));
        }
    }
}
