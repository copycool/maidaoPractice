package cn.maidaotech.java07.chapter07.practice08;

public class YouThread implements Runnable {
    private Object object1;
    private Object object2;

    public YouThread(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public void run() {
        synchronized (object2) {
            System.out.println("YouThread拿到第一把锁！");
            synchronized (object1) {
                System.out.println("YouThread拿到第二把锁！");
            }
        }
    }
}