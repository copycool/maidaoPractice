package cn.maidaotech.java07.chapter07;

public class MyThread extends Thread {

    @Override
    public void run() {
       try {
        System.out.println("run threadName=" + this.currentThread().getName() + " begin=" + System.currentTimeMillis());
        Thread.sleep(2000);
        System.out.println("run threadName=" + this.currentThread().getName() + " end=" + System.currentTimeMillis());
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
    public static void main(String[] args) {
        MyThread myThread =new MyThread();
        System.out.println("begin = "+System.currentTimeMillis());
        myThread.run();
        System.out.println("end = "+System.currentTimeMillis());
    }
}
