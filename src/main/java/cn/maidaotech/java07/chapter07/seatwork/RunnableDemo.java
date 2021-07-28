package cn.maidaotech.java07.chapter07.seatwork;

public class RunnableDemo implements Runnable {

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());

    }

}
