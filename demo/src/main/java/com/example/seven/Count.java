package com.example.seven;

public class Count extends Thread {
    private int count = 0;
    public static void main(String[] args) {
        Count c1 = new Count();
        c1.start();
        Count c2 = new Count();
        c2.start();
        Count c3 = new Count();
        c3.start();
        Count c4 = new Count();
        c4.start();
        Count c5 = new Count();
        c5.start();
        
    }
    @Override
    public void run() {
        for(int i = 0;i<1000;i++){
            count++;
            System.out.println(Thread.currentThread()+":"+count);
        }
        
    }
}