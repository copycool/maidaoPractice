package cn.maidaotech.java07.chapter07;

public class Test03 {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        MyRunnable myRunnable = new MyRunnable();
        //创建线程对象
        Thread thread = new Thread(myRunnable);
        //启动线程
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main:"+i);
    
        }
    }
}