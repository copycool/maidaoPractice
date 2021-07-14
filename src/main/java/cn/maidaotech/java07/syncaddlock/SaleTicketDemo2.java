package cn.maidaotech.java07.syncaddlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SaleTicketDemo2 {
    public static void main(String[] args) {
        
        //并发：多个线程操作同一个资源
        Ticket2 ticket2 = new Ticket2();

        //开启多线程
        new Thread(()->{
            for (int i = 0; i < 40; i++) {
                ticket2.sale();
            }
        },"A").start();

        new Thread(()->{
            for (int i = 0; i < 40; i++) {
                ticket2.sale();
            }
        },"B").start();

        new Thread(()->{
            for (int i = 0; i < 40; i++) {
                ticket2.sale();
            }
        },"C").start();
    }
}
//资源类
/**
 * / Lock三部曲
 1、 new ReentrantLock();
 2、 lock.lock(); // 加锁
 3、 finally=> lock.unlock(); // 解锁
*/
class Ticket2 {

    private int number = 30;

    //创建可重入锁  非公平锁
    Lock lock = new ReentrantLock();

    public void sale(){
        //加锁
        lock.lock();

        try {
            //业务代码
            if(number>0){
                System.out.println(Thread.currentThread().getName()+"卖出了"+(number--)+"票,还剩余"+number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //解锁
            lock.unlock();
        }
    }


}