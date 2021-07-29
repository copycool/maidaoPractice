package cn.maidaotech.java07.chapter07.practice06;

public class ThreadDemo implements Runnable {
    private static Integer num = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            num++;
        }
        System.out.println(Thread.currentThread().getName() + ":" + num);
    }
}