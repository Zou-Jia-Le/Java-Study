package com.imooc.assembly.mymap;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        System.out.println("===========================");
        //创建 map 集合
        Map<String,String> map = new HashMap<String,String>();
        //添加元素
        map.put("A101","Golf");
        map.put("A102","Sagitar");
        map.put("A102","Passat");//如果key已经存在，新的value值会替换原来的value值

        //获取 value 值
        System.out.println("A102键对应的值：" + map.get("A102"));
        System.out.println("");

        //获取集合中元素的个数
        System.out.println("集合元素个数：" + map.size());
        System.out.println("");

        //删除集合元素
        System.out.println("删除 A102 键对应的元素：" +  map.remove("A102"));
        System.out.println("删除后，A102 键所对应的值：" +  map.get("A102"));
        System.out.println("删除 A105 键对应的元素：" +  map.remove("A105"));//不存在 A105 键，返回 null
        System.out.println("删除后，A105 键所对应的值：" +  map.get("A105"));
        System.out.println("");

        //创建 parkingMap 集合
        Map<Car,String> parkingMap = new HashMap<Car,String>();
        Car car1 = new Car("Golf","White","京AQ1234");
        Car car2 = new Car("Passat","Black","京AQ1114");
        Car car3 = new Car("Golf","White","京AQ2222");
        Car car4 = new Car("Sagitar","White","京AQ1255");
        Car car5 = new Car("Volvo","Gray","京AQ6666");
        //添加元素
        parkingMap.put(car1,"A101");
        parkingMap.put(car2,"A102");
        parkingMap.put(car3,"A103");
        parkingMap.put(car4,"A104");
        parkingMap.put(car5,"A105");

        //判断集合是否包含指定的键
        System.out.println("集合是否包含 car1 此键：" + parkingMap.containsKey(car1));
        //System.out.println("集合是否包含 car7 此键：" + parkingMap.containsKey(car7));//没有 car7，会报错
        //判断集合是否包含指定的value值
        System.out.println("集合是否包含 A101 车位：" + parkingMap.containsValue("A101"));
        System.out.println("集合是否包含 A999 车位：" + parkingMap.containsValue("A999"));

        System.out.println("===========================");
        //keySet() 方法获取键集合
        Set<Car> keys = parkingMap.keySet();
        //遍历所有的key
        for (Car key : keys) {
            System.out.println(key.getMode() + ", " + key.getNumber() +  " -> " + parkingMap.get(key));
        }
        System.out.println("");

        //values() 方法获取value集合
        Collection values = parkingMap.values();
        //遍历所有的value
        Iterator iterator = values.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println("");

        //entrySet() 方法获取所有的键值对对象
        Set<Map.Entry<Car,String>> entrySet = parkingMap.entrySet();
        //遍历键值对对象集合，得到每一个键值对对象
        for (Map.Entry<Car,String> item : entrySet) {
            //根据键值对对象获取键和值
            Car key = item.getKey();//getKey() 方法获取键
            String value = item.getValue();//getValue() 方法获取值
            System.out.println(key.getMode() + "," + key.getNumber() +  "->" + value);
            //打印键值对
            System.out.println(item);
        }
        System.out.println("==========================================================");
    }
}
