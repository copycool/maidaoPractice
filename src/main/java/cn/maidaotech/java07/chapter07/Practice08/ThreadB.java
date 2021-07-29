package cn.maidaotech.java07.chapter07.Practice08;

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
        synchronized (b) {
            System.out.println(Thread.currentThread().getName() + ":获取b锁");
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(a){
                System.out.println(Thread.currentThread().getName() + ":获取a锁");
            }
        }
    }
}