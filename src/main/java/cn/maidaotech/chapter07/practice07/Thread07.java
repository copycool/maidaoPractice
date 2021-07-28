package cn.maidaotech.chapter07.practice07;
/**
 * 给定count为0，创建5个线程并发自增运算到1000
 */
public class Thread07 {
    int count = 0;
    public static void main(String[] args) {
        Thread07 t1 = new Thread07();
        MyRunnable m1 = t1.new MyRunnable();
        MyRunnable m2 = t1.new MyRunnable();
        MyRunnable m3 = t1.new MyRunnable();
        MyRunnable m4 = t1.new MyRunnable();
        MyRunnable m5 = t1.new MyRunnable();
        //创建五个线程
        new Thread(m1).start();
        new Thread(m2).start();
        new Thread(m3).start();
        new Thread(m4).start();
        new Thread(m5).start();
        
    }

class MyRunnable implements Runnable{
    @Override
    public void run() {
        while(true){
            synchronized(MyRunnable.class){
                if(count >= 1000){
                    break;
                }
                System.out.println(Thread.currentThread().getName()+":count:"+(++count));
                Thread.yield();
            }
        }
    }
}
}