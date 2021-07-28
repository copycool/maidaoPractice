package cn.maidaotech.java07.chapter07.instance.producerandconsumer;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class Test {
    public static void main(String[] args) throws InterruptedException {        
        BlockingDeque<PCData> queue = new LinkedBlockingDeque<>(10);     //队列长度是10   
        Producer p1 = new Producer(queue);        
        Producer p2 = new Producer(queue);        
        Consumer c1 = new Consumer(queue);        
        Consumer c2 = new Consumer(queue);        
        ExecutorService service = Executors.newCachedThreadPool();        
        //降低资源消耗。通过重复利用已创建的线程降低线程创建和销毁造成的消耗。
        //提高响应速度。当任务到达时，任务可以不需要等到线程创建就能立即执行。
        //提高线程的可管理性。线程是稀缺资源，如果无限制地创建，不仅会消耗系统资源，还会降低系统的稳定性，使用线程池可以进行统一分配、调优和监控
        service.execute(p1);        
        service.execute(p2);        
        service.execute(c1);        
        service.execute(c2);        
        Thread.sleep(10*1000);        
        p1.stop();        
        p2.stop();        
        Thread.sleep(3*1000);        
        //线程池自动关闭的两个条件：1、线程池的引用不可达；2、线程池中没有线程；
        service.shutdown();    //停止正在执行的，返回等待的线程
        System.out.println("线程池已关闭");
    } 
}