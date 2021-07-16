package cn.maidaotech.java07.syncaddlock.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Executors 工具类、3大方法
/**
* new ThreadPoolExecutor.AbortPolicy() // 银行满了，还有人进来，不处理这个人的，抛出异常
* new ThreadPoolExecutor.CallerRunsPolicy() // 哪来的去哪里！
* new ThreadPoolExecutor.DiscardPolicy() //队列满了，丢掉任务，不会抛出异常！
* new ThreadPoolExecutor.DiscardOldestPolicy() //队列满了，尝试去和最早的竞争，也不会
抛出异常！
*/

public class Demo2 {
    public static void main(String[] args) {
        /**
         * 拒绝策略
         * 1.new ThreadPoolExecutor.DiscardOldestPolicy() // 队列满了，尝试和最早的竞争，也不会抛出异常
         * 2.new ThreadPoolExecutor.AbortPlicy()     // 银行满了，还有人进来，不处理这个人的，抛出异常
         *                         会抛出异常 java.util.concurrent.RejectedExecutionException: 
         * 3.new ThreadPoolExecutor.CallerRunsPolicy() // 哪来的去哪里！
         * 4.new ThreadPoolExecutor.DiscardPolicy() //队列满了，丢掉任务，不会抛出异常！
         */
        ExecutorService threadPool = new ThreadPoolExecutor(
                                        2, 
                                        5, 
                                        3, 
                                        TimeUnit.SECONDS,
                                        new LinkedBlockingDeque<>(3),
                                        Executors.defaultThreadFactory(),
                                        new ThreadPoolExecutor.DiscardPolicy());
        try {
            // 最大承载：Deque + max
            // 超过 RejectedExecutionException
            for (int i = 1; i < 10; i++) {
                final int temp = i;
                // 使用了线程池之后，使用线程池来创建线程
                threadPool.execute(()->{
                        System.out.println(Thread.currentThread().getName()+"ok====>"+temp);
                    });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            // 线程池用完，程序结束，关闭线程池
            threadPool.shutdown();
        }
        
    }
}