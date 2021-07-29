package cn.maidaotech.java07.order.seventh.practice7;

public class MyThread1 extends Thread {
   int count = 0;
 @Override
 public void run() {
    while(count<1000){
        count++; 
    }
    System.out.println(count);
    }     
 }
       
   
 