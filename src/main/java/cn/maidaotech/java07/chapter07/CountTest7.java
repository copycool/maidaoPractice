package cn.maidaotech.java07.chapter07;

/**
 * 给定count为0，创建5个线程并发自增运算到1000。
 */

public class CountTest7 {
    private int count = 0;

    private class Counter implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    synchronized (Counter.class) {
                        if (count >= 1000) {
                            break;
                        }
                        System.out.println(Thread.currentThread().getName() + ":" + ++count);
                    }
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        CountTest7 test = new CountTest7();
        Thread test1 = new Thread(test.new Counter(), "t1");
        Thread test2 = new Thread(test.new Counter(), "t2");
        Thread test3 = new Thread(test.new Counter(), "t3");
        Thread test4 = new Thread(test.new Counter(), "t4");
        Thread test5 = new Thread(test.new Counter(), "t5");
        test1.start();
        test2.start();
        test3.start();
        test4.start();
        test5.start();



        System.out.println("result:" + test.count);

    }
}
