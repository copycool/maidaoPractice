package cn.maidaotech.java07.ch07.practices10;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

 class Ticket implements Runnable {
    private Integer ticketNum = 100;
    // private Object obj = new Object();
    private Lock lock = new ReentrantLock(true);

    boolean flag = true;
    @Override
    public void run() {
    //    while (flag) {
    //     synchronized(Ticket.class){
    //        if (ticketNum>0) {
            
    //               System.out.println("线程" + Thread.currentThread().getName() + "出售了第" + ticketNum+"张票,还剩"+(--ticketNum));
    //        }else{
    //            flag = false;
    //        }
    //     }

    //    }
        while (true) {
            lock.lock();
            try {
                if (ticketNum > 0) {
                    // try {
                    //     Thread.sleep(100);
                    // } catch (InterruptedException e) {
                    //     e.printStackTrace();

                    // }
                    String name = Thread.currentThread().getName();
                    System.out.println("线程" + name + "出售了" + ticketNum--);
                }else{
                    break;
                }
               
            } finally {
                lock.unlock();
             
            }

            // synchronized(obj){

            // }

        }
    
    }

}
class T1{
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(ticket,"窗口1").start();
        new Thread(ticket,"窗口2").start();

        new Thread(ticket,"窗口3").start();

    }
}