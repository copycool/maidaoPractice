package com.example.seven;

public class Windows extends Thread{
    private static int ticket = 100;
    @Override
    public void run() {
        synchronized(this){
        while (ticket>0) {
            System.out.println(getName()+"：卖票，剩"+ticket--);              
            }
        }
    
    }
    public static void main(String[] args) {
        Windows t1 = new Windows();
        Windows t2 = new Windows();
        Windows t3 = new Windows();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
    
}