package cn.maidaotech.java07.work.chapter07.question11;

import java.math.BigDecimal;

public class Bank {

    private volatile double amount = 500;

    public synchronized boolean drawMoneyByATM(double num){
            if (num > amount){
                System.out.println("余额不足，取款失败");
                return false;
            }
            amount -= num;
            System.out.println(Thread.currentThread().getName()+"取款"+num+"元，余额为:"+amount);
            return true;
    }

    public synchronized boolean remittanceToOther(double num){
        amount += num;
        System.out.println(Thread.currentThread().getName()+"汇款"+num+"元，余额为:"+amount);
        return true;
    }

    public void printAmount(){
        System.out.println("现在余额为："+amount);
    }
}