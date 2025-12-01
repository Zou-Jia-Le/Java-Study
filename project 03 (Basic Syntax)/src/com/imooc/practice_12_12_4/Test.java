package com.imooc.practice_12_12_4;

public class Test {
    public static void main(String[] args) {
        System.out.println("华为手机有多种充电模式：");
        com.imooc.practice_12_12_4.Phone phone1 = new com.imooc.practice_12_12_4.Phone() {
            @Override
            public void charge() {
                System.out.println("1.超级快充");
            }
        };
        phone1.charge();//超级快充
        com.imooc.practice_12_12_4.Phone phone2 = new com.imooc.practice_12_12_4.Phone() {
            @Override
            public void charge() {
                System.out.println("2.普通充电");
            }
        };
        phone2.charge();//普通充电
        com.imooc.practice_12_12_4.Phone phone3 = new com.imooc.practice_12_12_4.Phone() {
            @Override
            public void charge() {
                System.out.println("3.智能充电");
            }
        };
        phone3.charge();//智能充电
    }
}
