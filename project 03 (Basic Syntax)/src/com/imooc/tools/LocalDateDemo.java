package com.imooc.tools;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateDemo {
    public static void main(String[] args) {
        //根据当前的日期和时间创建对象
        LocalDate now_date = LocalDate.now();
        LocalTime now_time = LocalTime.now();
        LocalDateTime today = LocalDateTime.now();

        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        //格式化输出方法
        System.out.printf("year = %d, month = %d, day = %d\n",year, month, day);//%d称为转换符，代表整数变量，将双引号外面的整数值按顺序插入到对应的位置上
        System.out.println("");

        //根据指定的日期和时间创建对象
        LocalDate given_date = LocalDate.of(2020, 12, 30);
        LocalTime given_time = LocalTime.of(12, 30, 59);
        LocalDateTime given_day = LocalDateTime.of(2020, 12, 30, 12, 30, 59);

        int hour = given_day.getHour();
        int minute = given_day.getMinute();
        int secend = given_day.getSecond();
        System.out.printf("hour = %d, minute = %d, second = %d\n", hour, minute, secend);
        System.out.println("");

        //增加天数、减少天数
        LocalDate date = LocalDate.of(2003, 5, 30);
        System.out.println("减少1天：" + date.minusDays(1));
        System.out.println("增加2天：" + date.plusDays(2));
    }
}
