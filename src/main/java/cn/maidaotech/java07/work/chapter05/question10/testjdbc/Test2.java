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
    public void createData() {
        Long startTime = System.currentTimeMillis();
        Bigdata bigdata = null;
        int insert = 0;
        for (int i = 0; i < 73000; i++) {
            bigdata = new Bigdata();
            bigdata.setUserId(System.currentTimeMillis()+(long) (Math.random()*21+25));
            bigdata.setUsername(UUID.randomUUID().toString());
            bigdata.setAmount((int)(Math.random()*11+10));
            bigdata.setStatus((i%2==0)?0:1);
            bigdata.setCreatedAt(System.currentTimeMillis());
            bigdata.setUpdatedAt(System.currentTimeMillis());
            insert = bigdataMapper.insert(bigdata);
            if (insert > 0){
                System.out.println(i+"-----添加数据成功!");
            }
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间为："+(endTime-startTime)+"ms");



    }


}