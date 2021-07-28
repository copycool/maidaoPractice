package cn.maidaotech.java07.chapter07.instance;

import java.util.concurrent.TimeUnit;

// 通过调用该线程的interrupt()方法可以对其进行中断操作，
// 这种线程间的交互方式适合用来取消或停止任务。
// 线程通过检查自身是否被中断来进行响应，
// 线程通过方法isInterrupted()来进行判断是否被中断。
public class Shutdown {
    public static void main(String[] args) throws Exception {
    Runner one = new Runner();        
    Thread countThread = new Thread(one, "one");        
    countThread.start();        
    //睡眠100毫秒，确保线程countThread处于运行状态        
    TimeUnit.MILLISECONDS.sleep(100);        
    countThread.interrupt();
    //mian线程对countThread进行中断    
    }
    private static class Runner implements Runnable {
        private long i=0l;       
        @Override        
        public void run() {            
            while (!Thread.currentThread().isInterrupted()) {                   
                i++;            
            }            
            System.out.println("count i = " + i);

        }    
    }
}
