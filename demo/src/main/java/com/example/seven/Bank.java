package com.example.seven;

public class Bank extends Thread{
    private Object object;
    
    private int a = 20;

    public Bank(Object o){
        super();
        this.object = o;
    }
    @Override
    public void run() {
        try {
            synchronized(object){
                System.out.println("存了"+a+"元");
                object.wait();
                System.out.println("取了"+a+"元");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            Object object = new Object();
            Bank A = new Bank(object);
            A.start();
            Thread.sleep(300);
            Bank B = new Bank(object);
            B.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}