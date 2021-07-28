package cn.maidaotech.java07.chapter07.thread;

public class CreateThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread runnableDemo = new Thread(new RunnableDemo());
        runnableDemo.start();
        runnableDemo.join();
       // Thread.sleep(100);
        System.out.println("main"+Thread.currentThread().getName());
    }
}