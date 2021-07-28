package cn.maidaotech.java07.chapter07.instance.volatilepac;

//volatile关键字保证了在多线程环境下,被修饰的变量在被修改后会马上同步到主存,
//这样该线程对这个变量的修改就是对所有其他线程可见的,其他线程能够马上读到这个修改后值。

public class VolatileTest {
    private static volatile int count = 0;    
    private static final int times = Short.MAX_VALUE;    
    public static void main(String[] args) {        
        long curTime = System.nanoTime();        
        Thread decThread = new DecThread();        
        decThread.start();        
        // 使用run()来运行结果为0,原因是单线程执行不会有线程安全问题        
        // new DecThread().run();        
        System.out.println("Start thread: " + Thread.currentThread() + " i++");        
        for (int i = 0; i < times; i++) {            
            count++;        
        }        
        System.out.println("End thread: " + Thread.currentThread() + " i--");        
        // 等待decThread结束        
        while (decThread.isAlive());        
        long duration = System.nanoTime() - curTime;        
        System.out.println("Result: " + count);        
        System.out.format("Duration: %.2fs\n", duration / 1.0e9);    
    }    
    private static class DecThread extends Thread {        
        @Override        
        public void run() {            
            System.out.println("Start thread: " + Thread.currentThread() + " i--");            
            for (int i = 0; i < times; i++) {                
                count--;            
            }            
            System.out.println("End thread: " + Thread.currentThread() + " i--");        
        }    
    }   
}