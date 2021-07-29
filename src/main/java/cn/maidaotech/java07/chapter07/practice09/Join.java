package cn.maidaotech.java07.chapter07.practice09;

public class Join implements Runnable{
    private Thread thread;

    public Join(Thread thread) {
        this.thread = thread;
    }
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+ ":" + "begin");
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+ ":" + "end");
    }
}