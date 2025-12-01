package com.imooc.assembly.myset;

import java.util.Comparator;

public class MyComparator implements Comparator<Family> {
    //方法实现
    @Override
    public int compare(Family o1, Family o2) {
        float result = o2.getFamilyScore() - o1.getFamilyScore();//按家庭积分从大到小排序
        if(result > 0) {
            return 1;
        }else if (result < 0) {
            return -1;
        }else {
            return o1.getRegTime().compareTo(o2.getRegTime());//如果分数相等，按照注册时间排序(如果 compareTo 方法两边参数位置互换，排序顺序也会相反)
        }
    }
}
