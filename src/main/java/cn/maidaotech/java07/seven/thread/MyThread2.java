package cn.maidaotech.java07.seven.thread;
// 现在有 T1、T2、T3 三个线程，你怎样保证 T2 在 T1 执行完后执行，T3 在 T2 执行完后执行。 
 public class MyThread2 extends Thread {
    
    @Override
     public void run() {
         for(int i = 0;i<10;i++){
             System.out.println(Thread.currentThread().getName()+" "+i);
         }
     }
//     private Thread thread;
//     public MyThread2(){}
//     public  MyThread2(Thread th) {
//         this.thread=th;
//     }
//     @Override
//     public void run() {
//      System.out.println("我是线程===>"+Thread.currentThread().getName());
//      try {
//          thread.start();
//         thread.join();
//     } catch (InterruptedException e) {
//         e.printStackTrace();
//     }
//     }
// }
// class Test05{
//     public static void main(String[] args) {        
//         Thread thread3 = new Thread(new MyThread2(),"T3");
//         Thread thread2 = new Thread(new MyThread2(thread3),"T2");
//         Thread thread1 = new Thread(new MyThread2(thread2),"T1");
//         thread1.start();
//     }
public static void main(String[] args) throws InterruptedException {
    MyThread2 T1=new MyThread2();
    MyThread2 T2=new MyThread2();
    MyThread2 T3=new MyThread2();
    Thread thread1=new Thread(T1);
    Thread thread2=new Thread(T2);
    Thread thread3=new Thread(T3);
    
    T1.start();
    T1.join();
    T2.start();
    T2.join();
    T3.start();
    T3.join();
 }
 }