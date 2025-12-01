package com.imooc.assembly.mymap;

import java.util.*;

public class TreeMapTest {
    public static void main(String[] args) {
        //创建TreeMap集合
        Map<Car,String> parkingMap = new TreeMap<Car,String>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o2.getNumber().compareTo(o1.getNumber());//车牌号由大到小排
            }
        });

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

        //获取所有的键值对对象
        Set<Map.Entry<Car,String>> entrySet = parkingMap.entrySet();
        for(Map.Entry<Car,String> item : entrySet){
            Car key = item.getKey();
            String value = item.getValue();
            System.out.println(key.getMode() + ", " + key.getNumber() + " -> " + value);
        }
    }
}
