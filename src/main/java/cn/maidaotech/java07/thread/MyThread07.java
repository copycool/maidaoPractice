package cn.maidaotech.java07.thread;

public class MyThread07 implements Runnable {
    private Integer num = 0;

    @Override
    public void run() {
        // sale();
        for (int i = 0; i < 100; i++) {
            synchronized (MyThread07.class) {
                if (num <= 100)
                    System.out.println(Thread.currentThread().getName() + "------------>" + num++);
            }
        }
    }

    public static void main(final String[] args) {
        MyThread07 t07 = new MyThread07();
        Thread t1 = new Thread(t07);
        t1.setName("t1");
        t1.start();
        Thread t2 = new Thread(t07);
        t2.setName("t2");
        t2.start();
        Thread t3 = new Thread(t07);
        t3.setName("t3");
        t3.start();
        Thread t4 = new Thread(t07);
        t4.setName("t4");
        t4.start();
        Thread t5 = new Thread(t07);
        t5.setName("t5");
        t5.start();
    }
}