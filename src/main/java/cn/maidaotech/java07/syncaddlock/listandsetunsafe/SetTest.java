package cn.maidaotech.java07.syncaddlock.listandsetunsafe;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
* 同理可证 ： ConcurrentModificationException
* 1、Set<String> set = Collections.synchronizedSet(new HashSet<>());
* 2、
*/
//java.util.ConcurrentModificationException  并发修改异常
public class SetTest {
    public static void main(String[] args) {
        // Set set = new HashSet<>();
        // for (int i = 0; i < 10; i++) {
        //     new Thread(()->{
        //         set.add(UUID.randomUUID().toString().substring(0, 5));
        //         System.out.println(set);
        //     },String.valueOf(i)).start();
        // }
        // System.out.println(set.size());
        
        /**
         * 解决方案
         * 1.Set set = Collections.synchronizedSet(new HashSet<>());
         */
        // Set set = Collections.synchronizedSet(new HashSet<>());

        // for (int i = 0; i < 10; i++) {
        //     new Thread(()->{
        //         set.add(UUID.randomUUID().toString().substring(0, 5));
        //         System.out.println(set);
        //     },String.valueOf(i)).start();
        // }
        // try {
        //     TimeUnit.SECONDS.sleep(1);
        //     System.out.println(set.size());
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
    }
}