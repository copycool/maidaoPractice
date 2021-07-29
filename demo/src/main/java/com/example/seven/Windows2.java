package com.example.seven;

public class Windows2 implements Runnable{
    private int ticket = 100;
    public static void main(String[] args) {
        Windows2 w = new Windows2();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.setName("一号窗口");
        t2.setName("二号窗口");
        t3.setName("三号窗口");
        t1.start();
        t2.start();
        t3.start();
    }
    @Override
    public void run() {
        while (ticket>0) {
            System.out.println(Thread.currentThread().getName()+":卖出，剩"+ticket);
            ticket--;
        }
    }
}