package cn.maidaotech.java07.chapter07;

import java.util.concurrent.TimeUnit;

public class Shutdown {

    public static void main(String[] args) {
        Runner r1 = new Runner();
        Thread countThread = new Thread(r1, "r1");
        countThread.start();
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        countThread.interrupt();
    }
    private static class Runner implements Runnable{
        private long i;
        @Override
        public void run() {
            // TODO Auto-generated method stub
            while(!Thread.currentThread().isInterrupted()){
                i++;
            }
            System.out.println("count i = " + i);
        }
        
    }
    
}
