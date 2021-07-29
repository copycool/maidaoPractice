package cn.maidaotech.java07.work7.test10;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Platform implements Runnable {
    private List<Ticket> list1;
    private int count1 = 0;
    private int count2 = 0;
    private int count3 = 0;

    public Platform(List<Ticket> list1) {
        this.list1 = list1;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            if (list1.size() == 0) {
                break;
            }
            synchronized (list1) {
                if (list1.size() != 0) {
                    Ticket ticket = list1.remove(0);
                    System.out.print(Thread.currentThread().getName() + "-出售：" + ticket.getId() + "   ");

                    if ("pool-1-thread-1".equals(Thread.currentThread().getName())) {
                        count1 = count1 + 1;
                        System.out.println("thread-0" + "-共出售" + (count1) + "张票");
                    }
                    if ("pool-1-thread-2".equals(Thread.currentThread().getName())) {
                        count2 = count2 + 1;
                        System.out.println("thread-1" + "-共出售" + (count2) + "张票");
                    }
                    if ("pool-1-thread-3".equals(Thread.currentThread().getName())) {
                        count3 = count3 + 1;
                        System.out.println("thread-2" + "-共出售" + (count3) + "张票");
                    }

                    // if ("Thread-0".equals(Thread.currentThread().getName())) {
                    // count1 = count1 + 1;
                    // }
                    // if ("Thread-1".equals(Thread.currentThread().getName())) {
                    // count2++;
                    // }
                    // if ("Thread-2".equals(Thread.currentThread().getName())) {
                    // count3++;
                    // }
                }
            }
            try {
                TimeUnit.MILLISECONDS.sleep(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // System.out.println(Thread.currentThread().getName());
        // System.out.println();
        // System.out.println("thread-0" + "-共出售" + (count1) + "张票");
        // System.out.println("thread-1" + "-共出售" + (count2) + "张票");
        // System.out.println("thread-2" + "-共出售" + (count3) + "张票");

    }

}
