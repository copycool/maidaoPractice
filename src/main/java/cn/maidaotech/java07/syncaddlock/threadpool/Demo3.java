package cn.maidaotech.java07.syncaddlock.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 池的最大的大小如何去设置！
* 了解：IO密集型，CPU密集型：（调优）
 */
public class Demo3 {
    // 自定义线程池！工作 ThreadPoolExecutor
    // 最大线程到底该如何定义
    // 1、CPU 密集型，几核，就是几，可以保持CPu的效率最高！
    // 2、IO 密集型 > 判断你程序中十分耗IO的线程，
    // 程序 15个大型任务 io十分占用资源！
    // 获取CPU的核数
    public static void main(String[] args) {
        
        //创建线程池
        ExecutorService threadPool = new ThreadPoolExecutor(
                                                2, 
                                                Runtime.getRuntime().availableProcessors(), 
                                                3, 
                                                TimeUnit.SECONDS,
                                                new LinkedBlockingDeque<>(3),
                                                Executors.defaultThreadFactory(),
                                                new ThreadPoolExecutor.DiscardOldestPolicy());

        try {
            //用线程池创建线程
            for (int i = 1; i < 10; i++) {
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"ok");
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