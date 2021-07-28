package com.example.seven;

import com.example.three.calculaton.Test;

public class Die {
    private static String A = "a";
    private static String B = "b";
    public static void main(String[] args) {
        Thread a = new Thread(new Lock1());
        Thread b = new Thread(new Lock2());
        a.start();
        b.start();
    }
}
class Lock1 implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Lock1 running");
            while (true) {
                synchronized(Test.A){
                    System.out.println("Lock1 lock a");
                    Thread.sleep(3000);
                    synchronized(Test.B){
                        System.out.println("Lock1 lock b");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Lock2 implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Lock2 running");
            while (true) {
                synchronized(Test.B){
                    System.out.println("Lock2 lock b");
                    Thread.sleep(3000);
                    synchronized(Test.A){
                        System.out.println("Lock2 lock a");
                    }
                }
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}