package cn.maidaotech.java07.chapter07.thread;

public class RunnableDemo implements Runnable{
    @Override
    public void run(){
      
        System.out.println(Thread.currentThread().getName());

    }
}