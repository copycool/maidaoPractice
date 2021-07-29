package cn.maidaotech.java07.chapter07.Practice08;

public class Practice08 {
    private class Runner1 implements Runnable{
        private Object a;
        private Object b;

        
        public Runner1(Object a, Object b) {
            this.a = a;
            this.b = b;
        }


        @Override
        public void run() {
            synchronized(a){
                System.out.println(Thread.currentThread().getName()+"拿到a锁");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                synchronized(b){
                    System.out.println(Thread.currentThread().getName()+"拿到了b锁");
                }
            }
        }
    }
    private class Runner2 implements Runnable{
        private Object a;
        private Object b;

        
        public Runner2(Object a, Object b) {
            this.a = a;
            this.b = b;
        }


        @Override
        public void run() {
            synchronized(b){
                System.out.println(Thread.currentThread().getName()+"拿到b锁");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                synchronized(a){
                    System.out.println(Thread.currentThread().getName()+"拿到了a锁");
                }
            }
        }
    }
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        Practice08 test = new Practice08();
        Runner1 runner1 =test.new Runner1(a, b);
        Runner2 runner2 =test.new Runner2(a, b);
        Thread thread1 = new Thread(runner1, "线程一");
        Thread thread2 = new Thread(runner2, "线程二");
        thread1.start();
        thread2.start();
    }
}
/**
 * 通过指令可以查看死锁过程
 * jps -l; 插看堆栈信息
 * jstack 内存地址;查看问题
 */
/**
 * "线程一":
        at cn.maidaotech.java07.chapter07.Practice08.Practice08$Runner1.run(Practice08.java:26)
        - waiting to lock <0x000000071205e2b0> (a java.lang.Object)
        - locked <0x000000071205e2a0> (a java.lang.Object)
        at java.lang.Thread.run(java.base@11.0.11/Thread.java:834)
"线程二":
        at cn.maidaotech.java07.chapter07.Practice08.Practice08$Runner2.run(Practice08.java:53)
        - waiting to lock <0x000000071205e2a0> (a java.lang.Object)
        - locked <0x000000071205e2b0> (a java.lang.Object)
        at java.lang.Thread.run(java.base@11.0.11/Thread.java:834)

Found 1 deadlock.
 */
