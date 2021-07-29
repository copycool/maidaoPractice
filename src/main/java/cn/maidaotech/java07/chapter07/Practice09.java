package cn.maidaotech.java07.chapter07;

public class Practice09 {
    // 现在有T1、T2、T3三个线程，你怎样保证T2在T1执行完后执行，T3在T2执行完后执行。
    // t1 join t2 t2 join t3 main
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + ":begin");

        Thread pre = Thread.currentThread();

        for (int i = 1; i < 4; i++) {
            Thread thread = new Thread(new MyThread(pre),"t"+String.valueOf(i));
            thread.start();
            pre = thread;
        }

        System.out.println(Thread.currentThread().getName() + ":end");
    }

    public static class MyThread implements Runnable {

        private Thread thread;

        public MyThread(Thread thread) {
            this.thread = thread;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ":开始执行");

            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ":执行完毕");

        }

    }

}