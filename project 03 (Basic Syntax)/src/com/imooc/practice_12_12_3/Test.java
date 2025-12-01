package com.imooc.practice_12_12_3;

public class Test {
    public static void main(String[] args) {
        System.out.println("华为手机有多种充电模式：");
        Phone phone1 = new SuperFastCharging();
        phone1.charge();
        Phone phone2 = new NormalCharge();
        phone2.charge();
        Phone phone3 = new SmartCharging();
        phone3.charge();
    }
}
