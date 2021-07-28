package cn.maidaotech.java07.chapter07.seatwork;

public class ThreadDemo extends Thread {

    @Override
    public void run() {
      System.out.println(Thread.currentThread().getName());
      
    }
    
    
}
