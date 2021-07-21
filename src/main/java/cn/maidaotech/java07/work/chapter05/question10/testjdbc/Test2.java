package cn.maidaotech.java07.work.chapter05.question10.testjdbc;


import cn.maidaotech.java07.work.chapter05.question10.dao.BigdataMapper;
import cn.maidaotech.java07.work.chapter05.question10.pojo.Bigdata;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.*;


@SpringBootTest
public class Test2 {

    @Autowired
    private BigdataMapper bigdataMapper;

    @Test
    public void createData(){

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
            Bigdata bigdata = null;
            for (int i = 1; i < 2000000; i++) {
                threadPool.execute(()->{
                    bigdata.setUserId(System.currentTimeMillis()+(long) (Math.random()*21+25));
                    bigdata.setUsername(UUID.randomUUID().toString());
                    bigdata.setAmount((int)(Math.random()*21+25));
                    bigdata.setStatus(1);
                    bigdata.setCreatedAt(System.currentTimeMillis());
                    bigdata.setUpdatedAt(System.currentTimeMillis());
                    bigdataMapper.insert(bigdata);
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }finally{
            // 线程池用完，程序结束，关闭线程池
            threadPool.shutdown();
        }
        System.err.println("创建完成");
    }

}