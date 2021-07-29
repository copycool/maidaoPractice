package cn.maidaotech.java07.seven.ticket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// 三个窗口同时出售 100 张票： a. 票抽象为类，拥有票号等属性 b. 站台抽象为线程类 c. 同一张票不能重复销售
public class Ticket implements Runnable {
    int ticketnum=100;
    public Lock lock=new ReentrantLock(true);
    @Override
    public void run() {
        while(true){
            lock.lock();
            try{if(ticketnum>0){           
                try {                   
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程"+Thread.currentThread().getName()+"销售了电影票"+ticketnum--);
            }
        }finally{
            lock.unlock();
        }            
        }
    } 
}
    
