package cn.maidaotech.java07.thread;

public class MyThread06 implements Runnable {
    private volatile Integer num = 0;

    @Override
    public void run() {
        while (num < 1000) {
            num++;
        }
        System.out.println(Thread.currentThread().getName() + "当前i的值为：" + num);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new MyThread06()).start();
        }
    }

}