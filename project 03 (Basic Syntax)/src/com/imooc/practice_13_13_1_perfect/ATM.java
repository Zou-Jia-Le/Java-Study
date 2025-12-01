package com.imooc.practice_13_13_1_perfect;

public class ATM {
    //构造方法
    public ATM() {
    }

    //成员方法
    public boolean amountValidate (double balance,int amount) throws InputMismatchException {//验证输入的取款金额是否正确
        if(amount % 100 != 0) {
            throw new InputMismatchException("输入的金额必须是整百数，如100、200、300等！");
        } else if (amount > balance) {
            throw new InputMismatchException("账户余额不足！");
        }
        return true;
    }
}
