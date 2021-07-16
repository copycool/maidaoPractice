package cn.maidaotech.java07.syncaddlock.readwritelock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {
    public static void main(String[] args) {
      //  MyCahe myCahe = new MyCahe();
        MyCaheLock myCahe = new MyCaheLock();
        //写入
        for (int i = 1; i < 6; i++) {
            final int temp = i;
            new Thread(()->{
                myCahe.put(temp+"", temp+"");
            },String.valueOf(i)).start();
        }

        //读取
        for (int i = 1; i < 6; i++) {
            final int temp = i;
            new Thread(()->{
                myCahe.get(temp+"");
            },String.valueOf(i)).start();
        }
    }
}

/**
 * 自定义缓存  加锁
 */
class MyCaheLock{
    private volatile Map<String,Object> map = new HashMap<>();

    // 读写锁： 更加细粒度的控制
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private Lock lock = new ReentrantLock();

    //存，写
    public void put(String key,Object value){
        readWriteLock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"写入"+key);
            map.put(key, value);
            System.out.println(Thread.currentThread().getName()+"写入ok");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            readWriteLock.writeLock().unlock();
        }
    }

    //读，取
    public void get(String key){
        readWriteLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"读取key");
            map.get(key);
            System.out.println(Thread.currentThread().getName()+"读取ok");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            readWriteLock.readLock().unlock();
        }
    }
}
/**
 * 自定义缓存
 */
class MyCahe{
    private volatile Map<String,Object> map = new HashMap<>();
    
    //存，写
    public void put(String key,Object value){
        System.out.println(Thread.currentThread().getName()+"写入"+key);
        map.put(key, value);
        System.out.println(Thread.currentThread().getName()+"写入ok");
    }

    //读，取
    public void get(String key){
        System.out.println(Thread.currentThread().getName()+"读取key");
        Object o = map.get(key);
        System.out.println(Thread.currentThread().getName()+"读取ok");
    }
}