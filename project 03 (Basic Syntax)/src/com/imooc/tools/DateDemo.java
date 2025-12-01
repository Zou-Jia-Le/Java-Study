package com.imooc.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //创建 Date 对象
        Date date1 = new Date();
        System.out.println("date对象：" + date1);
        //使用当前时间距基准时间的毫秒数来创建 Date 对象
        Date date2 = new Date(1762032043821L);
        System.out.println("date1对象：" + date2);
        System.out.println("");

        //获取 Date 对象的毫秒数
        System.out.println(date1.getTime());
        System.out.println(date2.getTime());
        System.out.println("");

        //默认格式创建 SimpleDateFormat 对象
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        //将 Date 对象格式化成字符串
        String dateToString1 = sdf1.format(date1);
        System.out.println("默认格式：" + dateToString1);

        //指定日期时间的格式来创建 SimpleDateFormat 对象
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将 Date 对象格式化成字符串
        String dateToString2 = sdf2.format(date1);
        System.out.println("指定格式：" + dateToString2);
        //指定日期时间的格式来创建 SimpleDateFormat 对象
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日");
        //将 Date 对象格式化成字符串
        String dateToString3 = sdf3.format(date1);
        System.out.println("指定格式：" + dateToString3);
        System.out.println("");

        //将时间字符串解析成 Date 对象
        String timeStr = "2023-10-05 12:00:00";
        try {
            Date strToDate = sdf2.parse(timeStr);
            System.out.println("strToDate:" + strToDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
