package cn.maidaotech.java07.chapter07.thread;

public class JoinTest {
    public static void main(String[] args) {
        System.out.println("main start");
        Thread thread = new Thread(new MyThread());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main end");

    }

    public static class MyThread implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}