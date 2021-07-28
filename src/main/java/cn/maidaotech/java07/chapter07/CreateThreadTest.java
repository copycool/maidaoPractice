package cn.maidaotech.java07.chapter07;

public class CreateThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread runnableDemo = new Thread(new RunnableDemo());
        runnableDemo.start();
        runnableDemo.join();
        System.out.println(Thread.currentThread().getName());
    }
}
