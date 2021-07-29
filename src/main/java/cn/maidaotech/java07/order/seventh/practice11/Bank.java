package cn.maidaotech.java07.order.seventh.practice11;

public class Bank {
    private volatile double amount = 1000;

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
