package cn.maidaotech.java07.syncaddlock.listandsetunsafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

//java.util.ConcurrentModificationException 并发修改异常！
public class ListTest {
    public static void main(String[] args) {
        // !并发下 ArrayList 不安全
        // List<String> list = new ArrayList<>();//java.util.ConcurrentModificationException并发修改异常
        // for (int i = 1; i <=10; i++) {
        //     new Thread(()->{
        //         list.add(UUID.randomUUID().toString().substring(0,5));
        //         System.out.println(list);
        //     }).start();
        // }
        // System.out.println(list.size());
        /**
         * 解决方案:
         * 1、List<String> list = new Vector<>();
         */
        // List<String> list = new Vector<>();
        // for (int i = 1; i <=10; i++) {
        //     new Thread(()->{
        //         list.add(UUID.randomUUID().toString().substring(0,5));
        //         System.out.println(list);
        //     },String.valueOf(i)).start();
        // }
        // try {
        //     TimeUnit.SECONDS.sleep(1);
        //     System.out.println(list.size());
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        /**
         * 解决方案：
         * 2. List<String> list = Collections.synchronizedList(new ArrayList<>());
         */
        // List<String> list = Collections.synchronizedList(new ArrayList<>());
        // for (int i = 0; i < 10; i++) {
        //     new Thread(()->{
        //         list.add(UUID.randomUUID().toString().substring(0, 5));
        //         System.out.println(list);
        //     },String.valueOf(i)).start();
        // }
        // try {
        //     TimeUnit.SECONDS.sleep(1);
        //     System.out.println(list.size());
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

         /**
         * 解决方案：
         * 3.List<String> list = new CopyOnWriteArrayList<>()；  COW（写时复制）
         */
        // CopyOnWrite 写入时复制 COW 计算机程序设计领域的一种优化策略；
        // 多个线程调用的时候，list，读取的时候，固定的，写入（覆盖）
        // 在写入的时候避免覆盖，造成数据问题！
        // 读写分离
        // CopyOnWriteArrayList 比 Vector Nb 在哪里？
        List list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0, 5));
                System.out.println(list);
            },String.valueOf(i)).start();
        }
    try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(list.size());
    } catch (Exception e) {
            e.printStackTrace();
    }
    }
       

}