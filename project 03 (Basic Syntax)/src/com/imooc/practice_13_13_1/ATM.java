package com.imooc.practice_13_13_1;

public class ATM {
    //构造方法
    public ATM() {
    }

    //成员方法
    public boolean withdrawal (int withdrawalAmount) throws InputMismatchException {
        if(withdrawalAmount % 1 != 0) {
            System.out.println("取款的金额必须是整数");
        }
        return true;
    }
}
