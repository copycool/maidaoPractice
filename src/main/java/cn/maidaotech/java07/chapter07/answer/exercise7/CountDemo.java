package cn.maidaotech.java07.chapter07.answer.exercise7;

public class CountDemo {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Count());
        Thread thread2 = new Thread(new Count());
        Thread thread3 = new Thread(new Count());
        Thread thread4 = new Thread(new Count());
        Thread thread5 = new Thread(new Count());
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
