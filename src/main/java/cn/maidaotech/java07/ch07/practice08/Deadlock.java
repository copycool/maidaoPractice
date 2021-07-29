package cn.maidaotech.java07.ch07.practice08;

// 编写一个会导致死锁的程序。
public class Deadlock implements Runnable {

    private int flag;
    static Object lock1 = new Object();
    static Object lock2 = new Object();

    public Deadlock(int flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        System.out.println("当前锁的状态：" + flag);
        if (flag == 0) {
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + "已获得锁lock1");
                try {

                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
                System.out.println(Thread.currentThread().getName() + "等待获得锁lock2");
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + "已获得锁lock2");

                }
            }
        }

        if (flag == 1) {
            synchronized (lock2) {
                try {
                    System.out.println(Thread.currentThread().getName() + "已获得锁lock2");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
                System.out.println(Thread.currentThread().getName() + "等待获得锁 lock1");
                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName() + "已获得锁 lock1");
                }

            }
        }

    }

    // @Override
    // public String toString() {
    //     return "Deadlock [flag=" + flag + "]";
    // }

}
