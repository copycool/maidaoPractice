package cn.maidaotech.java07.chapter6.question9;

public class Test {
    public static void main(String[] args) {
        Thread thread3 = new Thread(new OrderThread(), "T3");
        Thread thread2 = new Thread(new OrderThread(thread3), "T2");
        Thread thread1 = new Thread(new OrderThread(thread2), "T1");
        thread1.start();
    }

}