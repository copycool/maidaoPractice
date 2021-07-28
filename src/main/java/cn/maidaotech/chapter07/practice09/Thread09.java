package cn.maidaotech.chapter07.practice09;
/**
 * 现在有T1、T2、T3三个线程，你怎样保证T2在T1执行完后执行，T3在T2执行完后执行。
 */
public class Thread09 extends Thread {
    private int i = 1;
    public Thread09(String name){
        setName(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
           i++;
        }
        System.out.println("线程"+Thread.currentThread().getName()+"执行完毕"+i);
    }

    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread(new Thread09("T1"));
        Thread t2 = new Thread(new Thread09("T2"));
        Thread t3 = new Thread(new Thread09("T3"));
        
        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();

        
    }
}