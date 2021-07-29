package cn.maidaotech.java07.chapter6.question9;

//现在有T1、T2、T3三个线程，你怎样保证T2在T1执行完后执行，T3在T2执行完后执行。
public class OrderThread implements Runnable {
    private Thread thread;

    public OrderThread() {

    }

    public OrderThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + "begin");
        try {
            thread.start();
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
/*
 * 
 * package cn.maidaotech.java07.seven.thread; // 现在有 T1、T2、T3 三个线程，你怎样保证 T2 在 T1
 * 执行完后执行，T3 在 T2 执行完后执行。 class MyThread2 extends Thread { public class
 * MyThread2 extends Thread { private Thread thread; public MyThread2(){} public
 * MyThread2(Thread th) { this.thread=th; }
 * 
 * @Override public void run() {
 * System.out.println("我是线程===>"+Thread.currentThread().getName()); try {
 * thread.start(); thread.join(); } catch (InterruptedException e) {
 * e.printStackTrace(); } } } class Test05{ public static void main(String[]
 * args) { Thread thread3 = new Thread(new MyThread2(),"T3"); Thread thread2 =
 * new Thread(new MyThread2(thread3),"T2"); Thread thread1 = new Thread(new
 * MyThread2(thread2),"T1"); thread1.start(); } }}
 * 
 */