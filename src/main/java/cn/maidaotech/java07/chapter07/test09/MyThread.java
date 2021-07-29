package cn.maidaotech.java07.chapter07.test09;

public class MyThread implements Runnable {

    private Thread thread;

    public MyThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "begin");
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "end");
    }

}
