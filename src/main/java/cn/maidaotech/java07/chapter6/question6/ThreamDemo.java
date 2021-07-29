package cn.maidaotech.java07.chapter6.question6;

public class ThreamDemo {
    public static void main(String[] args) {
        MyThread qu = new MyThread();
        new Thread(qu).start();
        new Thread(qu).start();
        new Thread(qu).start();
        new Thread(qu).start();
        new Thread(qu).start();
    }
}