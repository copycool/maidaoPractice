package cn.maidaotech.chapter07.practice08;

public class Thread08 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();
        new Thread(new Runnable() {

            @Override
            public void run() {
                synchronized (lock1) {
                    System.out.println("线程1拿到了锁");
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                synchronized (lock2){
                    System.out.println("线程1的锁2");
                }
            }
        }).start();

        new Thread(new Runnable(){
        
            @Override
            public void run() {
                synchronized(lock2){
                    System.out.println("线程2拿到了锁");

                    synchronized (lock1){
                        System.out.println("线程2的锁1");
                    }
                }
            }
        }).start();

        
    }

}