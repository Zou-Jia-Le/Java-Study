package com.imooc.practice_14_17_8;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Inventory phone1 = new Inventory("Pura70",0);
        Inventory phone2 = new Inventory("Mate60",0);
        Inventory phone3 = new Inventory("Mate60Pro",0);
        Inventory phone4 = new Inventory("mi5s",0);
        Inventory phone5 = new Inventory("xiaomi13",65);
        Inventory phone6 = new Inventory("Redmi Note13",27);

        //创建list集合
        List<Inventory> huaWeiList = new LinkedList<>();
        List<Inventory> xiaoMiList = new LinkedList<>();
        huaWeiList.add(phone1);
        huaWeiList.add(phone2);
        huaWeiList.add(phone3);
        xiaoMiList.add(phone4);
        xiaoMiList.add(phone5);
        xiaoMiList.add(phone6);

        //创建map集合
        Map<String,List<Inventory>> phoneMap = new LinkedHashMap<>();
        phoneMap.put("华为",huaWeiList);
        phoneMap.put("小米",xiaoMiList);

        //打印输出
        Iterator<Map.Entry<String,List<Inventory>>> phoneMapIterator = phoneMap.entrySet().iterator();
        while (phoneMapIterator.hasNext()) {
            Map.Entry<String,List<Inventory>> next = phoneMapIterator.next();
            Boolean flag = false;
            for (Inventory item1 : next.getValue()) {
                if (item1.getInventoryLevel() != 0) {//打印库存量不全为 0 的品牌
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                System.out.print(next.getKey() + "  -->  ");
                List<Inventory> values = next.getValue();
                for (Inventory item2 : values) {
                    if (item2.getInventoryLevel() != 0) {
                        System.out.print("|" + item2.getMobilePhoneModel() + "的库存量：" + item2.getInventoryLevel() + "|  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
