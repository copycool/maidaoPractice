package cn.maidaotech.java07.chapter6.question8;

public class DeadLockDemo {
    public static void main(String[] args) {
        DeadLock deadLock1 = new DeadLock();
        DeadLock deadLock2 = new DeadLock();
        deadLock1.flag = 0;
        deadLock2.flag = 1;
        deadLock1.start();
        deadLock2.start();
    }

}