package cn.maidaotech.java07.work.chapter07;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Question09 {
    public static void main(String[] args) {

        Data data = new Data();

        new Thread(()->{
            data.printA();
        },"T1").start();


        new Thread(()->{
            data.printB();
        },"T2").start();


        new Thread(()->{
            data.printC();
        },"T3").start();

    }
}

/**
 * Condition的特性:
 *
 * 　　　　1.Condition中的await()方法相当于Object的wait()方法，Condition中的signal()方法相当于Object的notify()方法，
 *          Condition中的signalAll()相当于Object的notifyAll()方法。
 *          不同的是，Object中的这些方法是和同步锁捆绑使用的；而Condition是需要与互斥锁/共享锁捆绑使用的。
 *
 * 　　　　2.Condition它更强大的地方在于：能够更加精细的控制多线程的休眠与唤醒。对于同一个锁，我们可以创建多个Condition，
 *          在不同的情况下使用不同的Condition。
 * 　　　　例如，假如多线程读/写同一个缓冲区：当向缓冲区中写入数据之后，唤醒"读线程"；
 *          当从缓冲区读出数据之后，唤醒"写线程"；并且当缓冲区满的时候，"写线程"需要等待；当缓冲区为空时，"读线程"需要等待。
 *
 * 　　　　  如果采用Object类中的wait(), notify(), notifyAll()实现该缓冲区，
 *          当向缓冲区写入数据之后需要唤醒"读线程"时，不可能通过notify()或notifyAll()明确的指定唤醒"读线程"，
 *          而只能通过notifyAll唤醒所有线程(但是notifyAll无法区分唤醒的线程是读线程，还是写线程)。
 *          但是，通过Condition，就能明确的指定唤醒读线程。
 */
class Data{  //资源类
    private Lock lock = new ReentrantLock();
    private Condition condition1  = lock.newCondition();
    private Condition condition2  = lock.newCondition();
    private Condition condition3  = lock.newCondition();
    private Integer number = 1;


    public void printA(){
        lock.lock();
        try {
            while (number != 1){
                condition1.wait();
            }
            System.out.println(Thread.currentThread().getName()+"=>AAAAAAAAA"+"  我是T1");
            //唤醒指定的线程
            number = 2;
            condition2.signal();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void printB(){
        lock.lock();
        try {
            while (number != 2){
                condition2.wait();
            }
            System.out.println(Thread.currentThread().getName()+"=>BBBBBBB"+"  我是T2");
            //唤醒指定的线程
            number = 3;
            condition3.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void printC(){
        lock.lock();
        try {
            while (number != 3){
                condition3.wait();
            }
            System.out.println(Thread.currentThread().getName()+"=>CCCCCCCCC"+"  我是T3");
            //唤醒指定的线程
            number = 1;
            condition1.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}