package cn.maidaotech.java07.order.seventh.practice7;

public class MyThresd1Test {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();
        MyThread1 t3 = new MyThread1();
        MyThread1 t4 = new MyThread1();
        MyThread1 t5 = new MyThread1();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        } 
    }
