package cn.maidaotech.java07.syncaddlock.assistclass;

import java.util.concurrent.CountDownLatch;

public class CountDownLathDemo {
    public static void main(String[] args) throws InterruptedException {
        // 总数是6，必须要执行任务的时候，再使用！
        CountDownLatch countDownLatch = new CountDownLatch(6);  

        for (int i = 1; i <=6; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"====>go out");
                countDownLatch.countDown();//数量-1
            },String.valueOf(i)).start();
        }

        countDownLatch.await(); // 等待计数器归零，然后再向下执行

        System.out.println("Close door");// 等待计数器归零，然后再向下执行
        //每次有线程调用 countDown() 数量-1，假设计数器变为0，countDownLatch.await() 就会被唤醒，继续
        //执行！
    }
}