package cn.maidaotech.java07.chapter07;
/*public class Practice implements Runnable{
    public static void main(String[] args) {
        Thread th1 = new Thread(new Practice());
        th1.start();
    }
	@Override
	public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread() + "-->" + i);
        }	
	}     
} */

/*public class Practice extends Thread{
    public static void main(String[] args) {
       Practice th1 = new Practice();
       th1.start();
       System.out.println("运行结果"); 
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread() + "--> Practice");
        
    }
}*/

/*public class Practice extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("run threadName=" + this.currentThread().getName() + "begin=" + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run threadName=" + this.currentThread().getName() + " end" + System.currentTimeMillis());       
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
public static void main(String[] args) {
    Practice th1 = new Practice();
    System.out.println("begin = "+System.currentTimeMillis());
    th1.run();
    System.out.println("end = "+System.currentTimeMillis());

    Practice th2 = new Practice();
    System.out.println("begin = "+System.currentTimeMillis());
    th2.run();
    System.out.println("end = "+System.currentTimeMillis());
}
}*/

/*public class Practice{
    private static class MyThread1 extends Thread{
        private Object object;
        public MyThread1(Object o){
            super();
            this.object = o;
        }
        @Override
        public void run() {
            try {
                synchronized(object){
                    System.out.println("begin wait time = " + System.currentTimeMillis());
                    object.wait();
                    System.out.println("end wait time = " + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class MyThread2 extends Thread {
        private Object object;
        public MyThread2(Object o) {           
            super();           
            this.object = o;        
        }
        @Override
        public void run() {
            synchronized(object){
                System.out.println("begin notify time = " + System.currentTimeMillis());
                object.notify();
                System.out.println("end notify time = " + System.currentTimeMillis());
            }
        }
    }  

    public static void main(String[] args) {
        try {
            Object object = new Object();
            MyThread1 t1 = new MyThread1(object);
            t1.start();
            Thread.sleep(3000);
            MyThread2 t2 = new MyThread2(object);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}*/

/*import java.util.concurrent.TimeUnit;
public class Practice{
    public static void main(String[] args) throws InterruptedException{
        Runner one = new Runner();
        Thread counThread = new Thread(one,"one");
        counThread.start();
        TimeUnit.MILLISECONDS.sleep(100);
        counThread.interrupt();
    }
    private static class Runner implements Runnable{
        private long i;
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                i++;
            }
            System.out.println("count i =" + i);;
        }
    }
}*/

public class Practice{
    public static void main(String[] args) throws Exception{
        Runner runner = new Runner(0);
        Thread thread = new Thread(runner);
        thread.start();
        Thread.sleep(200);
        runner.cancel();
    }
    public static class Runner implements Runnable {
        private volatile boolean flag = true;
        private Integer i;
        public Runner(Integer i){
            super();
            this.i = i;
        }
        @Override
        public void run() {
            while (flag) {
                try {
                    System.out.println(i++);
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        public void cancel() {
            this.flag = false;
        }
    }
}