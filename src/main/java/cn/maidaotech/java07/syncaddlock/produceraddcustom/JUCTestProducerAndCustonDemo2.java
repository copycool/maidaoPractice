package cn.maidaotech.java07.syncaddlock.produceraddcustom;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *A 执行完调用B，B执行完调用C，C执行完调用A
 */

 //Condition 精准的通知和唤醒线程
public class JUCTestProducerAndCustonDemo2 {
    public static void main(String[] args) {
        Data4 data4 = new Data4();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data4.printA();
            }
        },"A").start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data4.printB();
            }
        },"B").start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data4.printC();
            }
        },"C").start();
    }
}
class Data4{// 资源类 Lock
    private int number = 1;

    Lock lock = new ReentrantLock();
    Condition condition1 = lock.newCondition();
    Condition condition2 = lock.newCondition();
    Condition condition3 = lock.newCondition();

    public void printA(){
        lock.lock();
        try {
            // 业务，判断-> 执行-> 通知
            while(number != 1){
                condition1.await();
            }
            number++;
            System.out.println(Thread.currentThread().getName()+"===>"+"AAAAAAAAA");
            //唤醒b
            condition2.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }
    public void printB(){
        lock.lock();
        try {
            // 业务，判断-> 执行-> 通知
            while (number != 2) {
                condition2.await();
            }
            number++;
            System.out.println(Thread.currentThread().getName()+"==>"+"BBBBB");
            //唤醒c
            condition3.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }
    
    public void printC(){
        lock.lock();
        try {
            // 业务，判断-> 执行-> 通知
            while (number != 3) {
                condition3.await();
            }
            number = 1;
            System.out.println(Thread.currentThread().getName()+"==>"+"CCCCCCC");
            //唤醒a
            condition1.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }
}