package cn.maidaotech.java07.chapter07.mq;

import java.util.Random;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable{
    private volatile boolean isRunning = true;
    private BlockingDeque<PCData> queue;
    private static AtomicInteger count = new AtomicInteger();//总数
    private static final int SLEEP_TIME = 1000;

    public Producer(BlockingDeque<PCData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            while (isRunning) {
                Thread.sleep(random.nextInt(SLEEP_TIME));
                PCData data = new PCData(count.incrementAndGet());
                if (queue.offer(data)) {
                    System.out.println(data + "已加入队列");
                } else {
                    System.out.println(data + "加入队列失败");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    public void stop() {
        isRunning = false;
    }
}
