package cn.maidaotech.java07.chapter07.homework.exercise9;

public class Domino implements Runnable{
private Thread thread;

    public Domino(Thread thread) {
    this.thread = thread;
}

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+"begin");
            thread.join();
            System.out.println(Thread.currentThread().getName()+"terminate");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
    
}
