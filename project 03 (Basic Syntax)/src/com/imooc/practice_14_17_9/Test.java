package com.imooc.practice_14_17_9;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //创建AvgScores对象
        AvgScores avgScores1 = new AvgScores(96.5F,98.8F,95.2F);
        AvgScores avgScores2 = new AvgScores(96.7F,97.5F,96.5F);
        AvgScores avgScores3 = new AvgScores(95.9F,98.2F,95.5F);
        AvgScores avgScores4 = new AvgScores(97.3F,97.9F,96.8F);
        AvgScores avgScores5 = new AvgScores(96.6F,98.5F,96.3F);

        //创建list集合
        List<AvgScores> list1 = new LinkedList<>();
        list1.add(avgScores1);
        List<AvgScores> list2 = new LinkedList<>();
        list2.add(avgScores2);
        List<AvgScores> list3 = new LinkedList<>();
        list3.add(avgScores3);
        List<AvgScores> list4 = new LinkedList<>();
        list4.add(avgScores4);
        List<AvgScores> list5 = new LinkedList<>();
        list5.add(avgScores5);

        //创建map集合
        Map<String, List<AvgScores>> map = new HashMap<>();
        map.put("一年1班",list1);
        map.put("一年2班",list2);
        map.put("一年3班",list3);
        map.put("一年4班",list4);
        map.put("一年5班",list5);

        //打印成绩
        Iterator<Map.Entry<String, List<AvgScores>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<AvgScores>> next = iterator.next();
            String keys = next.getKey();
            System.out.print(keys + " -> ");
            List<AvgScores> valueLists = next.getValue();
            for (AvgScores values : valueLists) {
                System.out.print("语文: " + values.getChineseAvgScore());
                System.out.print(", 数学: " + values.getMathAvgScore());
                System.out.println(", 英语: " + values.getEnglishAvgScore());
            }
        }
    }
}
