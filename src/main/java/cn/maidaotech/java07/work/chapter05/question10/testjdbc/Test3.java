package cn.maidaotech.java07.work.chapter05.question10.testjdbc;


import cn.maidaotech.java07.work.chapter05.question10.dao.BigdataMapper;
import cn.maidaotech.java07.work.chapter05.question10.pojo.Bigdata;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;
import java.util.concurrent.*;


@SpringBootTest
public class Test3 {

    @Autowired
    private BigdataMapper bigdataMapper;

    @Test
    public void createData() {

        Long startTime = System.currentTimeMillis();

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

            for (int i = 1; i < 20; i++) {
                final int temp = i;
                threadPool.execute(()->{
                    Bigdata bigdata = null;
                    int insert = 0;
                    bigdata = new Bigdata();
                    bigdata.setUserId(System.currentTimeMillis()+(long) (Math.random()*21+25));
                    bigdata.setUsername(UUID.randomUUID().toString());
                    bigdata.setAmount((int)(Math.random()*11+10));
                    bigdata.setStatus((temp%2==0)?0:1);
                    bigdata.setCreatedAt(System.currentTimeMillis());
                    bigdata.setUpdatedAt(System.currentTimeMillis());
                    insert = bigdataMapper.insert(bigdata);
                    if (insert > 0){
                        System.out.println(temp+"---添加数据成功!");
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            // 线程池用完，程序结束，关闭线程池
            threadPool.shutdown();
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间为："+(endTime-startTime)+"ms");



    }


}