package cn.maidaotech.java07.chapter07.test06;

public class MyThread extends Thread {
    private Integer i = 0;

    @Override
    public void run() {

        while (i < 1000) {
            i++;
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }

    }
}
