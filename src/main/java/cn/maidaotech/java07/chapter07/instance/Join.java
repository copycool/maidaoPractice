package cn.maidaotech.java07.chapter07.instance;

public class Join {
    public static void main(String[] args) throws Exception {        
        Thread previous = Thread.currentThread();       //设置previous,使先初始化的线程插入到后面的线程
        for (int i = 0; i < 3; i++) {            
            Thread thread = new Thread(new Domino(previous), "thread" + String.valueOf(i));            
            thread.start();            
            previous = thread; 
        }        
        System.out.println(Thread.currentThread().getName() + " terminate.");    
    }
    static class Domino implements Runnable {        
        private Thread thread;        
        public Domino(Thread thread) {            
            this.thread = thread;        
        }
        @Override        
        public void run() {            
            try {                
                System.out.println(Thread.currentThread().getName() + "begin");                
                thread.join();     //thread0插队到main里面，保证main先结束  
            } catch (InterruptedException e) {                
                e.printStackTrace();            
            }            
            System.out.println(Thread.currentThread().getName() + " terminate.");        
        }    
    }
}
// 线程开始的时间是随机的，尽管创建的时间是有序的，线程是上下文切换的
// 线程终止的前提是前驱线程的终止，
// 每个线程等待前驱线程终止后，
// 才从join()方法返回
//结束的顺序是一定的
