package cn.maidaotech.java07.syncaddlock.assistclass;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemo {
    public static void main(String[] args) {
        // 抢车位
        Semaphore semaphore = new Semaphore(3);

        for (int i = 1; i < 7; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();// 得到
                    System.out.println(Thread.currentThread().getName()+"抢到车位");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(Thread.currentThread().getName()+"离开车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally{
                    semaphore.release();//释放
                }
            }).start();
        }
        //原理：semaphore.acquire() 获得，假设如果已经满了，等待，等待被释放为止！
        //semaphore.release(); 释放，会将当前的信号量释放 + 1，然后唤醒等待的线程！
        //作用： 多个共享资源互斥的使用！并发限流，控制最大的线程数！

    }
}