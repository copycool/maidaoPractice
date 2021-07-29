package cn.maidaotech.java07.thread;

public class MyThread09 extends Thread {
    private Thread thread;

    public MyThread09(Thread thread) {
        this.thread = thread;
    }

    // 现在有T1、T2、T3三个线程，你怎样保证T2在T1执行完后执行，T3在T2执行完后执行。

    /**
     * 会出先三种
     */
    @Override
    public void run() {
        method1();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        method2();
    }

    public void method1() {
        System.out.println(Thread.currentThread().getName() + "------------->\t开始执行");
    }

    public void method2() {
        System.out.println(Thread.currentThread().getName() + "------------->\t执行结束了");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread P = Thread.currentThread();
        for (int i = 1; i <= 3; i++) {
            Thread thread = new Thread(new MyThread09(P), ("T" + i));
            thread.start();
            P = thread;
        }
        Thread.currentThread().sleep(10);
        System.out.println(Thread.currentThread() + "\t结束了");
    }
}