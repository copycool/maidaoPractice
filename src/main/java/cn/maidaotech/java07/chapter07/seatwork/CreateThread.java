package cn.maidaotech.java07.chapter07.seatwork;

public class CreateThread {
    public static void main(String[] args) throws InterruptedException {
        Thread runnableDemo= new Thread (new RunnableDemo());
        runnableDemo.start();
        Thread.sleep(100);
        //runnableDemo.join();//也可以让runnableDemo先执行
        System.out.println(Thread.currentThread().getName());
    }
}
