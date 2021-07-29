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
        
        Thread w1 =  new Thread(t1);
        Thread w2 =  new Thread(t1);
        Thread w3 =  new Thread(t1);


        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
    
}