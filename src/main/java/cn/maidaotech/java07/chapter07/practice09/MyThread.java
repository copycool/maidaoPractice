package cn.maidaotech.java07.chapter07.practice09;

public class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("当前线程是：" + Thread.currentThread().getName());
    }

}