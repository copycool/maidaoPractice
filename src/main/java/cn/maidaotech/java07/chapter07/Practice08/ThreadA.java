package cn.maidaotech.java07.chapter07.Practice08;

import java.util.concurrent.TimeUnit;

public class ThreadA implements Runnable {
    //编写一个会导致死锁的程序。

    private Object a;
    private Object b;

    public ThreadA(Object a, Object b) {
        super();
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (a) {
            System.out.println(Thread.currentThread().getName() + ":获取a锁");
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(b){
                System.out.println(Thread.currentThread().getName() + ":获取b锁" );
            }
        }

    }
    
}