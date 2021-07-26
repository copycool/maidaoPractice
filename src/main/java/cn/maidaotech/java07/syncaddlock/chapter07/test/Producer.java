package cn.maidaotech.java07.syncaddlock.chapter07.test;

import java.util.Random;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable {
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
            e.printStackTrace(); Thread.currentThread().interrupt();
        }
    }
    public void stop() {
        isRunning = false;
    }
}
class Consumer implements Runnable {
    private volatile boolean isRunning = true;
    private BlockingDeque<PCData> queue;
    private static final int SLEEP_TIME = 1000;
    public Consumer(BlockingDeque<PCData> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        Random random = new Random();
        try {
            while (isRunning) {
                PCData data = queue.take();
                if(data != null){
                    System.out.println(data+"取出队列，被消费了。");
                }
                Thread.sleep(random.nextInt(SLEEP_TIME));
            }
        } catch (Exception e) {
            e.printStackTrace(); Thread.currentThread().interrupt();
        }
    }
    public void stop() {
        isRunning = false;
    }
}
class PCData {
    private Integer num;
    public PCData(int num) {
        this.num = num;
    }
    public Integer getNum() {
        return num;
    }
    public void setNum(Integer num) {
        this.num = num;
    }
    @Override
    public String toString() {
        return "data:" + num;
    }
}
class Test {
    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<PCData> queue = new LinkedBlockingDeque<>(10);
        Producer p1 = new Producer(queue);
        Producer p2 = new Producer(queue); Consumer c1 = new Consumer(queue); Consumer c2 = new Consumer(queue);
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(p1);
        service.execute(p2);
        service.execute(c1);
        service.execute(c2);
        Thread.sleep(10*1000);
        p1.stop();
        p2.stop(); Thread.sleep(3*1000);
        service.shutdown();
    }
}