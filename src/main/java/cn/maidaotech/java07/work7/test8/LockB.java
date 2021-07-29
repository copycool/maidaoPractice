package cn.maidaotech.java07.work7.test8;

import java.util.Date;

public class LockB implements Runnable {
    public void run() {
        try {
            System.out.println(new Date().toString() + " LockB 开始执行");
            while (true) {
                // synchronized锁住对象
                synchronized (test.obj2) {
                    System.out.println(new Date().toString() + " LockB1 锁住 obj2");
                    Thread.sleep(3000*2); 
                    // 此处等待是给A能锁住机会
                    synchronized (test.obj1) {
                        System.out.println(new Date().toString() + " LockB2 锁住 obj1");
                        Thread.sleep(60 * 1000); // 为测试，占用了就不放
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
