package com.imooc.assembly.mylist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        //创建集合对象
        List<String> carlist = new LinkedList<String>();
        for (int i = 0; i < 20; i++) {
            carlist.add("京AQ123" + i);
        }

        System.out.println("第一辆车：" + ((LinkedList<String>)carlist).getFirst());//LinkedList实现类 特有的方法，需要进行强制类型转换
        System.out.println("最后一辆车：" + ((LinkedList<String>)carlist).getLast());//LinkedList实现类 特有的方法，需要进行强制类型转换

        ((LinkedList<String>) carlist).removeLast();//LinkedList实现类 特有的方法，需要进行强制类型转换
        ((LinkedList<String>) carlist).removeFirst();//LinkedList实现类 特有的方法，需要进行强制类型转换
        System.out.println("第一辆车：" + ((LinkedList<String>)carlist).getFirst());//LinkedList实现类 特有的方法，需要进行强制类型转换
        System.out.println("最后一辆车：" + ((LinkedList<String>)carlist).getLast());//LinkedList实现类 特有的方法，需要进行强制类型转换
    }
}
