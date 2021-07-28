package cn.maidaotech.java07.chapter07;

public class Practice {
    // 创建两个线程，一个线程负责打印奇数，另一个线程打印偶数，
    // 两个线程竞争同一个对象锁，每次打印一个数字后释放锁，然后另一个线程拿到锁打印下一个数字。
    private static int count;

    private static final Object object = new Object();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (count < 100) {
                    synchronized (object) {
                        if ((count & 1) == 0) {
                            System.out.println(Thread.currentThread().getName() + ":" + count++);
                        }
                    }
                }

            }
        }, "偶数线程").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (count < 100) {
                    synchronized (object) {
                        if ((count & 1) == 1) {
                            System.out.println(Thread.currentThread().getName() + ":" + count++);
                        }
                    }
                }

            }
        }, "奇数线程").start();
    }
}