package cn.maidaotech.java07.chapter07;

public class MyThread02 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("sub thread:" + i);
            int time = (int) (Math.random() * 100);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}