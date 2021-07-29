package cn.maidaotech.java07.chapter07;

import java.util.concurrent.TimeUnit;

public class Practice07 {
    // 给定count为0，创建5个线程并发自增运算到1000。
    private int count = 0;

    public class Counter implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (Counter.class) {
                    if (count > 1000) {
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + count++);
                }
                try {
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Practice07 test = new Practice07();
        for (int i = 0; i < 5; i++) {
            Thread ti = new Thread(test.new Counter(),"t"+i);
            ti.start();
            TimeUnit.MILLISECONDS.sleep(1);
            System.out.println("result:"+test.count);
        }
    }

}