package com.imooc.tools;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //获取 GregorianCalendar 子类对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println("");

        //获取当前年份
        int year =  calendar.get(Calendar.YEAR);
        System.out.println("现在是" + year + "年");
        //获取当前月份
        int month = calendar.get(Calendar.MONTH) + 1;
        System.out.println("现在是" + month + "月");
        //获取当前日期
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("现在是" + day + "日");
        System.out.println("");

        //从现在往后推算100天，是哪年哪月哪日？
        calendar.add(Calendar.DAY_OF_MONTH, 100);
        int year_100 = calendar.get(Calendar.YEAR);
        int month_100 = calendar.get(Calendar.MONTH) + 1;
        int dayOfMonth_100 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("100天之后是：" + year_100 + "年" + month_100 + "月" + dayOfMonth_100 + "日");
        System.out.println("");

        //判断19883年10月1日是周几？
        calendar.set(Calendar.YEAR, 1983);
        calendar.set(Calendar.MONTH, 10-1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        //国际上每周的第一天是周日，最后一天是周六
        System.out.println("1983年10月1日是本周的第" + dayOfWeek + "天");//第7天是周六
    }
}
