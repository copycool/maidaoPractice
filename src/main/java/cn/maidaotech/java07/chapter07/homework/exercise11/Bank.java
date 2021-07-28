package cn.maidaotech.java07.chapter07.homework.exercise11;

public class Bank{
    private volatile int amount = 100;

    public synchronized void drawMoney(int money) {
        if (money > amount) {
            System.out.println("余额不足");
        } else {
            amount = amount - money;
            System.out.println(Thread.currentThread().getName() + "余额还有" + amount);
        }
    }

    public synchronized void saveMoney(int money) {
        amount = amount + money;
        System.out.println(Thread.currentThread().getName() + "余额还有" + amount);
    }
}
