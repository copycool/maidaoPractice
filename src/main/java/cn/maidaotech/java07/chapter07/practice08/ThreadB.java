package cn.maidaotech.java07.chapter07.practice08;

import java.util.concurrent.TimeUnit;

public class ThreadB implements Runnable {
    private Object a;
    private Object b;

    public ThreadB(Object a, Object b) {
        super();
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                System.out.println(Thread.currentThread().getName() + "获取b锁");
                TimeUnit.SECONDS.sleep(1);
                synchronized (a) {
                    System.out.println(Thread.currentThread().getName() + "获取a锁");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
