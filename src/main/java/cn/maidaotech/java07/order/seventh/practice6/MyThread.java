package cn.maidaotech.java07.order.seventh.practice6;

public class MyThread extends Thread {
    static int a = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            a = a + 1;
        }
        System.out.println(Thread.currentThread().getName() + a);
    }

}
