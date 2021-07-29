package cn.maidaotech.java07.chapter07.mq;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<PCData> queue = new LinkedBlockingDeque<>(10);
        Producer p1 = new Producer(queue);
        Producer p2 = new Producer(queue);
        Consumer c1 = new Consumer(queue);
        Consumer c2 = new Consumer(queue);
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(p1);
        service.execute(p2);
        service.execute(c1);
        service.execute(c2);
        Thread.sleep(10 * 1000);
        p1.stop();
        p2.stop();
        Thread.sleep(3 * 1000);
        service.shutdown();
    }
}