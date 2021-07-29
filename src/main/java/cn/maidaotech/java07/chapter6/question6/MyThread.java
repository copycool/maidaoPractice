package cn.maidaotech.java07.chapter6.question6;

public class MyThread implements Runnable {
    private Integer num = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "     " + num++);
            Thread.yield();
        }
    }
}