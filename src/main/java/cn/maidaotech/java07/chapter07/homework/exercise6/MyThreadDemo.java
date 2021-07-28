package cn.maidaotech.java07.chapter07.homework.exercise6;

public class MyThreadDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread(0));
        Thread thread2 = new Thread(new MyThread(0));
        Thread thread3 = new Thread(new MyThread(0));
        Thread thread4 = new Thread(new MyThread(0));
        Thread thread5 = new Thread(new MyThread(0));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
