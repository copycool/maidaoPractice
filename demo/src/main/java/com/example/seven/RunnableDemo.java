package com.example.seven;

public class RunnableDemo implements Runnable{
    private int s;
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableDemo());
        t1.start();
        Thread t2 = new Thread(new RunnableDemo());
        t2.start();
        Thread t3 = new Thread(new RunnableDemo());
        t3.start();
        Thread t4 = new Thread(new RunnableDemo());
        t4.start();
        Thread t5 = new Thread(new RunnableDemo());
        t5.start();
    }
    @Override
    public void run() {
        for(int i = 0;i <1000;i++){
            s++;
            System.out.println(Thread.currentThread()+":"+s);
        }
    }
}