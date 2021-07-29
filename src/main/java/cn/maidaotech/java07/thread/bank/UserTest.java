package cn.maidaotech.java07.thread.bank;

public class UserTest {
    public static void main(String[] args) {
        new Thread(new User(new Bank()), "用户A").start();
        new Thread(new User(new Bank()), "用户B").start();
    }
}