package cn.maidaotech.java07.chapter07.homework.exercise11;

public class UserDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();
        new Thread(() -> {
            bank.saveMoney(200);
        }, "userA").start();
        new Thread(() -> {
            bank.drawMoney(50);
        }, "userB").start();
    }
}
