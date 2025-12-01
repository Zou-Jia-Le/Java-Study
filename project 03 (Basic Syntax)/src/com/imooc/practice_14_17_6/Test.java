package com.imooc.practice_14_17_6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        //创建周六投票对象集合
        Set<String> saturdayVotes = new HashSet<>();
        //添加周六投票集合的元素
        saturdayVotes.add("小慕");
        saturdayVotes.add("Lily");
        saturdayVotes.add("Lucy");
        saturdayVotes.add("大毛");
        saturdayVotes.add("Tony");
        saturdayVotes.add("小刚");
        saturdayVotes.add("小慕");
        saturdayVotes.add("大毛");

        //创建周日投票对象集合
        Set<String> sundayVotes = new HashSet<>();
        //添加周日投票集合的元素
        sundayVotes.add("Tom");
        sundayVotes.add("彭彭");
        sundayVotes.add("Kate");
        sundayVotes.add("彭彭");
        sundayVotes.add("二毛");

        //二毛因为临时有事，取消参加团建，取消其周六投票结果；Lily和Lucy改投周日的票，取消她们周六的投票
        Iterator<String> saturdayIterator = saturdayVotes.iterator();
        while (saturdayIterator.hasNext()) {
            String next = saturdayIterator.next();
            if(next.equals("大毛") || next.equals("Lily") || next.equals("Lucy")) {
                saturdayIterator.remove();
            }
        }

        //打印周六投票结果
        System.out.print("支持周六团建的人是：");
        for (String item : saturdayVotes) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("支持周六团建的总票数为：" + saturdayVotes.size());

        //二毛因为临时有事，取消参加团建，取消其周日投票结果（实际上，大毛并没有投周日票）
        Iterator<String> sundayIterator = sundayVotes.iterator();
        while (sundayIterator.hasNext()) {
            String next = sundayIterator.next();
            if(next.equals("大毛")) {
                sundayIterator.remove();
            }
        }
        //Lily和Lucy改投周日的票，取消她们周六的投票
        sundayVotes.add("Lily");
        sundayVotes.add("Lucy");
        //打印周日投票结果

        System.out.print("支持周日团建的人是：");
        for (String item : sundayVotes) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("支持周日团建的总票数为：" + sundayVotes.size());
    }
}
