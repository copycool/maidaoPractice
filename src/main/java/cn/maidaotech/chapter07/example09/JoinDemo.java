package cn.maidaotech.chapter07.example09;

public class JoinDemo implements Runnable {
    private Thread thread;

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + "开始执行。");
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "执行结束。");
    }

    public JoinDemo(Thread thread) {
        this.thread = thread;
    }

}