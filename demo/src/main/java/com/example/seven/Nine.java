package com.example.seven;

public class Nine extends Thread {

    public static void main(String[] args) {
         Thread T1 = new Thread(new Runnable() {
            
            @Override
            public void run() {
                System.out.println("T1 running");
            }
        });

         Thread T2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    T1.join();

                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }{
                System.out.println("T2 running");
            }
        });

         Thread T3 = new Thread(new Runnable(){
        
            @Override
            public void run() {
                try {
                    T2.join();

                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }{
                System.out.println("T3 running");
            }
        });
        T1.start();
        T2.start();
        T3.start();
        
        
    }
    
    
}