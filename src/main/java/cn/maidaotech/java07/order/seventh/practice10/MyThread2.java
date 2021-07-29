package cn.maidaotech.java07.order.seventh.practice10;

import ch.qos.logback.core.net.SyslogOutputStream;

public class MyThread2 extends Thread{
     private  Integer ticketNum = 100;
    @Override
    public void run() {
        while(ticketNum>0){
          synchronized(ticketNum){
          System.out.println(Thread.currentThread().getName()+"======"+ticketNum--);
        }
      }
      
  }
}


