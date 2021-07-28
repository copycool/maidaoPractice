package cn.maidaotech.chapter07.practice06;
/**
 * 
 * 创建一个线程类，该类有一个整型的实例变量，默认为0。
 * 在run方法中对变量执行1000次自增运算，并打印变量值。然后创建5个该类的实例线程，调用执行，观察变量的最终结果。
 */
public class Thread06 {
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        ThreadTest t2 = new ThreadTest();
        ThreadTest t3 = new ThreadTest();
        ThreadTest t4 = new ThreadTest();
        ThreadTest t5 = new ThreadTest();
        t1.start();
        
        t2.start();
        
        t3.start();
        
        t4.start();
        
        t5.start();
    }
}
class ThreadTest extends Thread{
   private int i =0;
   @Override
   public void run() {
       for (int i = 0; i < 1000; i++) {
           i=i++;
           System.out.println(i);
       }
   }
}