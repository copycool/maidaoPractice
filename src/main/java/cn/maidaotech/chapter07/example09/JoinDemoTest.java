package cn.maidaotech.chapter07.example09;

public class JoinDemoTest {
    public static void main(String[] args) {
       Thread perious = Thread.currentThread();
       for(int i=1; i<=3;i++){
         Thread thread = new Thread(new JoinDemo(perious),"T"+i); 
         thread.start();
         perious = thread;
       }  
    }
}