package cn.maidaotech.java07.order.seventh.practice9;

public class MyThread3 extends Thread{
//   private Thread thread;
    // public void thread ( Thread name){
    //     this.thread= name;
    // }
  @Override
  public void run() {
    //   for (int i = 0; i < 5; i++) {
          System.out.println(Thread.currentThread().getName()+"====");
    //   }
    
  }
}
