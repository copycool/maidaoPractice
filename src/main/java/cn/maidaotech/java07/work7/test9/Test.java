package cn.maidaotech.java07.work7.test9;

import java.util.concurrent.atomic.AtomicInteger;

//可见性、原子性

public class Test {
    // private static volatile AtomicInteger count = new AtomicInteger(0);
    // private static final int times = Short.MAX_VALUE;

    public static void main(String[] args) throws InterruptedException {
        long curTime = System.nanoTime();// 随机数有关
        Test t = new Test();
        Thread t1 = new DecThread();
        Thread t2 = new DecThread();
        Thread t3 = new DecThread();
        Thread t4 = new DecThread();
        Thread t5 = new DecThread();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t5.start();
        t5.join();
        t3.start();
        t4.start();

    }

    private static class DecThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "执行");
            // synchronized (this) {
            // System.out.println(Thread.currentThread().getName());
            // for (int i = 0; i < times; i++) {
            // count.decrementAndGet();
            // }
            // System.out.println(Thread.currentThread().getName());
            // }
        }
    }
}
