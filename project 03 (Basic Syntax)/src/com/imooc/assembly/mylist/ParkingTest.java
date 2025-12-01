package com.imooc.assembly.mylist;

import java.util.ArrayList;
import java.util.List;

public class ParkingTest {
    public static void main(String[] args) {
        Parking parking1 = new Parking("A101","京ADF1234");
        Parking parking2 = new Parking("A102","京ADF1111");
        Parking parking3 = new Parking("A103","京ADF6666");

        //创建集合
        List parkingList = new ArrayList<>();
        //添加集合元素
        parkingList.add(parking1);
        parkingList.add(parking2);
        //将元素添加到指定位置
        parkingList.add(1,parking3);

        //获取集合元素
        System.out.println("最初的 parkingList：");
        System.out.println(parkingList.get(0));
        System.out.println(parkingList.get(1));
        System.out.println(parkingList.get(2));
        System.out.println("");

        //获取集合元素的个数
        System.out.println("parkingList 的元素个数：" + parkingList.size());
        System.out.println("");

        //查找集合中的元素
        int index = parkingList.indexOf(parking3);
        System.out.println("index：" + index);
        System.out.println("");

        //移除集合中的元素
        parkingList.remove(1);
        System.out.println("移除元素后的 parkingList：");
        System.out.println(parkingList.get(0));
        System.out.println(parkingList.get(1));
        System.out.println("");

        //清空集合
        parkingList.clear();
        //判断集合是否为空
        System.out.println("parkingList 是否为空：" + parkingList.isEmpty());
    }
}
