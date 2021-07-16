package cn.maidaotech.java07.syncaddlock.queue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 抛出异常
 */
public class Test1 {
    public static void main(String[] args) {
        //队列的大小
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue<>(3);

        //添加
        System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.add("b"));;
        System.out.println(blockingQueue.add("c"));;
        //Exception in thread "main" java.lang.IllegalStateException: Queue full
        //System.out.println(blockingQueue.add("d"));

        System.out.println("============");
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        // java.util.NoSuchElementException 抛出异常！
        //blockingQueue.remove();
    }
}