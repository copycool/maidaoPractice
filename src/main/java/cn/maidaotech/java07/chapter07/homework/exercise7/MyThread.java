package cn.maidaotech.java07.chapter07.homework.exercise7;

public class MyThread extends Thread {
    private static Integer count = 0;

    @Override
    public void run() {
        while (count < 1000) {
            count++;
            System.out.println(Thread.currentThread().getName() + " " + count);
        }
    }
}
