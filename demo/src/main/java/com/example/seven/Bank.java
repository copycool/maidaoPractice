package com.example.seven;

public class Bank extends Thread {
    
    private static int a = 20;

    public static void main(String[] args) {
        Thread A = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println( "A:存了：" + a + "元");
            }
        });

        Thread B = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    A.join();

                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
            {
                System.out.println("B:取了："+a+"元");
            }
        });

        
        A.start();
        B.start();
        
    }
}