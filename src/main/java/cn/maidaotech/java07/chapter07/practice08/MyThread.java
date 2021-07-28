package cn.maidaotech.java07.chapter07.practice08;

public class MyThread implements Runnable {

    private Object object1;
    private Object object2;

    public MyThread(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public void run() {
        synchronized (object1) {
            System.out.println("MyThread拿到第一把锁！");
            synchronized (object2) {
                System.out.println("MyThread拿到第二把锁！");
            }
        }
    }

}