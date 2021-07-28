//创建一个线程类，该类有一个整型的实例变量，
//默认为0。在run方法中对变量执行1000次自增运算，
//并打印变量值。然后创建5个该类的实例线程，调用执行，
//观察变量的最终结果。
package cn.maidaotech.java07.chapter07;

import java.util.concurrent.atomic.AtomicInteger;

public class Test06 extends Thread {
    public static  volatile AtomicInteger atomicInteger = new AtomicInteger(0);
    @Override
    public void run() {
		synchronized(Test06.class){
            for(int i=0; i<1000; i++){
                atomicInteger.incrementAndGet();
            }
            System.out.println(atomicInteger.get());
        }
    }

    public static void main(String[] args) {
        Test06 thread1 = new Test06();
        thread1.run();
        Test06 thread2 = new Test06();
        thread2.run();
        Test06 thread3 = new Test06();
        thread3.run();
        Test06 thread4 = new Test06();
        thread4.run();
        Test06 thread5 = new Test06();
        thread5.run();

        Test06 thread6 = new Test06();
        thread6.start();
        Test06 thread7 = new Test06();
        thread7.start();
        Test06 thread8 = new Test06();
        thread8.start();
        Test06 thread9 = new Test06();
        thread9.start();


    }
    
}