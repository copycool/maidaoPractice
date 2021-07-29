package cn.maidaotech.java07.seven.thread;
// 创建一个线程类，该类有一个整型的实例变量，默认为 0。
// 在 run 方法中对变量执行 1000 次自 增运算，并打印变量值。
// 然后创建 5 个该类的实例线程，调用执行，观察变量的最终结果。
public class MyThread extends Thread {
    public static void main(String[] args) {
        
        MyThread thread0=new MyThread();
        MyThread thread1=new MyThread();
        MyThread thread2=new MyThread();
        MyThread thread3=new MyThread();
        MyThread thread4=new MyThread();
        
        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();       
    } 
    static int a=0;
     @Override
     public void run() {
         for(int i=0;i<1000;i++){
             a++;
        }        
         System.out.println(Thread.currentThread().getName()+"    "+a);
     }   
}
    

