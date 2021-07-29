package cn.maidaotech.java07.seven.thread;
// 给定 count 为 0，创建 5 个线程并发自增运算到 1000
public class MyThread1 extends Thread {
    public static void main(String[] args) {
        MyThread1 thread0=new MyThread1();
        MyThread1 thread1=new MyThread1();
        MyThread1 thread2=new MyThread1();
        MyThread1 thread3=new MyThread1();
        MyThread1 thread4=new MyThread1();
        
        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
    int count=0;
    @Override
    public void run() {
        while(count<1000){
            count ++;
        }
       System.out.println(Thread.currentThread().getName() + "  "+count); 
    }
}
