package cn.maidaotech.java07.chapter07.example07;

import java.util.concurrent.TimeUnit;

public class CountTest07 {
    private int count = 0;

    private class Counter implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    synchronized (Counter.class) {
                        if (count >= 10) {
                            break;
                        }
                        System.out.println(Thread.currentThread().getName() + ":" + ++count);
                    }
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CountTest07 test = new CountTest07();
        Runnable runner= test.new Counter();
        Thread t1 = new Thread(runner, "t1");
        Thread t2 = new Thread(runner, "t2");
        Thread t3 = new Thread(runner, "t3");
        Thread t4 = new Thread(runner, "t4");
        Thread t5 = new Thread(runner, "t5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("result:" + test.count);
    }

}
