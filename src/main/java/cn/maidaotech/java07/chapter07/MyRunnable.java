package cn.maidaotech.java07.chapter07;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("sub thread:"+i);
    
        }
    }
    
}