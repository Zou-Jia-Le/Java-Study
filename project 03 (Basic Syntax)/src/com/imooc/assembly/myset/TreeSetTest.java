package com.imooc.assembly.myset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        //案例一：浮点型数据 - 自然排序
        System.out.println("案例一：浮点型数据 - 自然排序：");
        Set<Float> scorelist = new TreeSet<Float>();
        scorelist.add(138F);
        scorelist.add(56.5F);
        scorelist.add(35F);
        scorelist.add(66F);
        scorelist.add(50.5F);
        for (float score : scorelist) {
            System.out.println(score);
        }
        System.out.println("");

        //案例二：自定义类对象 - 自然排序
        System.out.println("案例二：自定义类对象 - 自然排序：");
        Set<Parking> parkingSet = new TreeSet<Parking>();
        Parking parking1 = new Parking("A101","京ADF1234");
        Parking parking2 = new Parking("A199","京ADF1111");
        Parking parking3 = new Parking("A100","京ADF6666");
        parkingSet.add(parking1);
        parkingSet.add(parking2);
        parkingSet.add(parking3);
        /*要求：按车位编号自然排序
          思路：1、Parking类实现 Comparable 接口
               2、重写 ComparableTo 方法*/
        for(Parking parking : parkingSet) {
            System.out.println(parking);
        }
        System.out.println("");

        //案例三：自定义对象 - 比较器排序
        System.out.println("案例三：自定义对象 - 比较器排序：");
        MyComparator comparator = new MyComparator();
        Set<Family> familySet1 = new TreeSet<Family>(comparator);

        Set<Family> familySet2 = new TreeSet<Family>(new Comparator<Family>() {
            @Override
            public int compare(Family o1, Family o2) {
                float result = o2.getFamilyScore() - o1.getFamilyScore();//按家庭积分从大到小排序
                if(result > 0) {
                    return 1;
                }else if (result < 0) {
                    return -1;
                }else {
                    //如果 compareTo 方法两边参数位置互换，排序顺序也会相反
                    return o1.getRegTime().compareTo(o2.getRegTime());//如果分数相等，按照注册时间排序
                }
            }
        });//使用匿名内部类简化比较器排序

        Family xiaomu = new Family("588108159",88,"20080910");
        Family damao = new Family("588108123",65,"20201010");
        Family xiaoming = new Family("588108111",125,"20120912");
        Family yaya = new Family("588108155",65,"20080512");
        Family ermao = new Family("588108666",28,"20231001");
        familySet1.add(xiaomu);
        familySet1.add(damao);
        familySet1.add(xiaoming);
        familySet1.add(yaya);
        familySet1.add(ermao);
        familySet2.add(xiaomu);
        familySet2.add(damao);
        familySet2.add(xiaoming);
        familySet2.add(yaya);
        familySet2.add(ermao);

        /*要求：按家庭积分从大到小排序，如果分数相同，按照注册时间排序
          思路：1、定义子类，实现Comparator接口
               2、重写compare方法
               3、创建子类对象
               4、子类对象作为参数传给TreeSet集合*/
        for(Family family : familySet1) {
            System.out.println(family);
        }
        System.out.println("================================================================================================");
        for(Family family : familySet2) {
            System.out.println(family);
        }
    }
}
