package cn.maidaotech.java07.chapter07.instance.producerandconsumer;

import java.util.Random;
import java.util.concurrent.BlockingDeque;

public class Consumer implements Runnable {
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
                PCData data = queue.take();  //检索并删除头部元素              
                if(data != null){                    
                    System.out.println(data+"取出队列，被消费了。");                
                }                
                Thread.sleep(random.nextInt(SLEEP_TIME));            
            }        
        } catch (Exception e) {            
            e.printStackTrace();            
            Thread.currentThread().interrupt();      //线程中断  
        }    
    }    
    public void stop() {        
        isRunning = false;    
    }
}