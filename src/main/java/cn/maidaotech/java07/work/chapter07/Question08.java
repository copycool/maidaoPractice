package cn.maidaotech.java07.work.chapter07;
import java.util.concurrent.TimeUnit;
//死锁：持有自己的锁，试图获取对方的锁
public class Question08 {
    public static void main(String[] args) {
        /**
         * 方法一：
         */
       String lockA = "lockA";
       String lockB = "lockB";

       new Thread(new MyThread08(lockA,lockB),"T1").start();
       new Thread(new MyThread08(lockB,lockA),"T2").start();
    }
}

/**
 * 死锁信息
 * 命令：jps -l 查询死锁进程
 *      jstack 进程号
 *      获取进程的堆栈信息
 * Java stack information for the threads listed above:
 * ===================================================
 * "T2":
 *         at cn.maidaotech.java07.syncaddlock.chapter07.MyThread08.run(Question08.java:34)
 *         - waiting to lock <0x00000000d60afdf8> (a java.lang.String)
 *         - locked <0x00000000d60afe30> (a java.lang.String)
 *         at java.lang.Thread.run(Thread.java:748)
 * "T1":
 *         at cn.maidaotech.java07.syncaddlock.chapter07.MyThread08.run(Question08.java:34)
 *         - waiting to lock <0x00000000d60afe30> (a java.lang.String)
 *         - locked <0x00000000d60afdf8> (a java.lang.String)
 *         at java.lang.Thread.run(Thread.java:748)
 */

class MyThread08 implements Runnable{
    private String lockA;
    private String lockB;

    public MyThread08(String lockA,String lockB){
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized (lockA){
            System.out.println(Thread.currentThread().getName()+"lock:"+lockA+"=>get"+lockB);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockB){
                System.out.println(Thread.currentThread().getName()+"lock:"+lockB+"=>get"+lockA);

            }
        }

    }
}