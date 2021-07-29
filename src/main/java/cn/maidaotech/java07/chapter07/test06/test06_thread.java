package cn.maidaotech.java07.chapter07.test06;

public class test06_thread {
    public static void main(String[] args) {
        MyThread th = new MyThread();
        th.start();
        MyThread th1 = new MyThread();
        th1.start();
        MyThread th2 = new MyThread();
        th2.start();
        MyThread th3 = new MyThread();
        th3.start();
        MyThread th4 = new MyThread();
        th4.start();
    }
}
