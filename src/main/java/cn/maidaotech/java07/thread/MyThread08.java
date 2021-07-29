package cn.maidaotech.java07.thread;

public class MyThread08 implements Runnable {
    private final Integer ins = 0;
    private final String str = "0";

    @Override
    public void run() {
        try {
            method1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void method1() throws InterruptedException {
        if ("t1".equals(Thread.currentThread().getName())) {
            synchronized (ins) {
                System.out.println(Thread.currentThread().getName() + "获取了ins锁");
                Thread.sleep(1000);
                synchronized (str) {

                }
            }
        } else {
            synchronized (str) {
                System.out.println(Thread.currentThread().getName() + "获取了str锁");
                synchronized (ins) {

                }
            }
        }

    }

    public static void main(String[] args) {
        MyThread08 myThread08 = new MyThread08();
        Thread thread1 = new Thread(myThread08, "t1");
        Thread thread2 = new Thread(myThread08, "t2");

        thread1.start();
        thread2.start();
    }

}
