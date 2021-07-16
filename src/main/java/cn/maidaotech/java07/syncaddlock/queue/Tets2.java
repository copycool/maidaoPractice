package cn.maidaotech.java07.syncaddlock.queue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 有返回值，没有异常
 */
public class Tets2 {
    public static void main(String[] args) {
        //队列的大小
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("b"));
        System.out.println(blockingQueue.offer("c"));
        // System.out.println(blockingQueue.offer("d"));   //  false 不抛出异常！

        System.out.println("================");

        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());         // null 不抛出异常！
    }
}