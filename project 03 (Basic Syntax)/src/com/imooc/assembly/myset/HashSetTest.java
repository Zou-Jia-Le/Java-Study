package com.imooc.assembly.myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> carNUmberSet = new HashSet<String>();
        carNUmberSet.add("京AQ111");
        carNUmberSet.add("京AQ123");
        carNUmberSet.add("京AQ233");
        carNUmberSet.add("京AQ233");//不可重复
        System.out.println(carNUmberSet);
        System.out.println("");

        //foreach循环遍历集合：
        for(String item : carNUmberSet) {//集合使用了泛型<String>，从集合中取出的元素,其类型为String型
            System.out.println(item);
        }
        System.out.println("");

        //迭代器遍历集合：
        //创建迭代器
        Iterator<String> i = carNUmberSet.iterator();
        while(i.hasNext()) {
            String next = i.next();//迭代器使用了泛型，从集合中取出的元素无需进行强制类型转换
            System.out.println(next);
        }
    }
}
