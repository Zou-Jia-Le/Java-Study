package com.imooc.assembly.mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopTest {
    public static void main(String[] args) {
        Parking parking1 = new Parking("A101","京ADF1234");
        Parking parking2 = new Parking("A102","京ADF1111");
        Parking parking3 = new Parking("A103","京ADF6666");
        Parking parking4 = new Parking("A104","京ADF5678");
        Parking parking5 = new Parking("A105","京ADF8899");

        //创建集合
        List parkingList = new ArrayList<>();
        //添加集合元素
        parkingList.add(parking1);
        parkingList.add(parking2);
        parkingList.add(parking4);
        parkingList.add(parking5);
        //将元素添加到指定位置
        parkingList.add(1,parking3);

        //for循环遍历集合：
        for (int i = 0; i < parkingList.size(); i++) {
            Parking parking = (Parking) parkingList.get(i);//集合没有使用泛型，则其元素取出时默认类型为 Object 型
            System.out.println(parking);
        }
        System.out.println("");

        //foreach循环遍历集合：
        for(Object item : parkingList) {//集合没有使用泛型，则其元素取出时默认类型为 Object 型
            System.out.println(item);
        }
        System.out.println("");

        //迭代器遍历集合：
        Iterator it1 = parkingList.iterator();//创建迭代器
        while(it1.hasNext()) {
            Parking parking = (Parking) it1.next();//集合没有使用泛型，则其元素取出时默认类型为 Object 型
            System.out.println(parking);
        }
        System.out.println("");

        //注意:使用迭代器访问集合时，集合中的元素不能被改变，只能使用迭代器的 remove 方法删除集合中的元素，不能使用集合中的 remove 方法
        List nameList = new ArrayList<>();
        nameList.add("xiaomu");
        nameList.add("damao");
        System.out.println("删除前的nameList集合：" + nameList);
        Iterator it2 = nameList.iterator();
        while(it2.hasNext()) {
            Object next = it2.next();
            if(next == "damao") {
                //nameList.remove("xiaomu");//集合的remove方法
                it2.remove();//迭代器的remove方法
            }
        }
        System.out.println("删除后的nameList集合：" + nameList);
    }
}
