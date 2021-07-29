package cn.maidaotech.java07.chapter07.instance;

public class JoinTest {
    public static void main(String[] args) {        
        try {            
            System.out.println("main start");            
            Thread mythread = new Thread(new MyThread());            
            mythread.start();            
            mythread.join();            
            System.out.println("main end");        
        } catch (Exception e) {            
            e.printStackTrace();        
        }    
    }
    public static class MyThread implements Runnable {        
        @Override        
        public void run() {            
            System.out.println(Thread.currentThread().getName());      
            System.out.println("thread end");          
        }    
    }
}
// mythread.join()保证了“myThread”在”main end“之前输出，插队保证
// 也就是说线程mythread执行完之后才会继续执行线程mian中之后的语句。