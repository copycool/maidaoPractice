package cn.maidaotech.java07.chapter07.instance.producerandconsumer;

import java.util.Random;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
//生产者负责生产一个数组并存入缓存区
//生产者消费者通过阻塞队列进行通信  
public class Producer implements Runnable{
    private volatile boolean isRunning = true;//每次修改volatile变量都会同步到主存中,每次读取volatile变量的值都强制从主存读取最新的值
    //阻塞队列   
    private BlockingDeque<PCData> queue;   
    //生成入队的数据
    private static AtomicInteger count = new AtomicInteger();    //，无参构造，默认传0，基于多线程并且支持原子操作的Integer类
    private static final int SLEEP_TIME = 1000;    
    public Producer(BlockingDeque<PCData> queue) {        
        this.queue = queue;    
    }    
    @Override    
    public void run() {        
        Random random = new Random();        
        try {            
            while (isRunning) {                
                Thread.sleep(random.nextInt(SLEEP_TIME)); //暂停线程时间，[0,1000)随机数   
                
                //product data to blockingdequeue
                PCData data = new PCData(count.incrementAndGet());  
                // getAndIncrement返回的是当前值；=i++
                // incrementAndGet返回的是加1后的值。=++i           
                if (queue.offer(data)) {      //putlast(e)队列尾部添加              
                    System.out.println(data + "已加入队列");                
                } else {                    

                    System.out.println(data + "加入队列失败");                
                }            
            }        
        } catch (Exception e) {            
            e.printStackTrace();            
            Thread.currentThread().interrupt();   //中断操作   
        }    
    }    
    public void stop() {        
        isRunning = false;    
    }
}
    