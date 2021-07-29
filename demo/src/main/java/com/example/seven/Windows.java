package com.example.seven;

public class Windows extends Thread {
    private static int ticket = 100;
    Object obj = new Object();
    

    @Override
    public void run() {

        while (true) {
            synchronized (obj) {
               if (ticket>0) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"：卖票，票号为："+ticket);
                ticket--;
               }else{
                break;
               }
            }
        }
    }
    public static void main(String[] args) {
        Windows t1 = new Windows();
        
        Thread w =  new Thread(t1);


        w.setName("窗口1");
        w.setName("窗口2");
        w.setName("窗口3");

        w.start();
        w.start();
        w.start();
    }
    
}