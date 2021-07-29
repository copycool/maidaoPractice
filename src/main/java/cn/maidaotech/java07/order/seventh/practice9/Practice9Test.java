package cn.maidaotech.java07.order.seventh.practice9;

import java.time.chrono.MinguoChronology;

import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;

public class Practice9Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread3 t1 = new MyThread3();
        MyThread3 t2 = new MyThread3();
        MyThread3 t3 = new MyThread3();
        // t1.setPriority(9);
        // t2.setPriority(6);
        // t3.setPriority(1);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        System.out.println("=================");
       
    }
    
}