package cn.maidaotech.chapter07.example07;

//给定count为0，创建5个线程并发自增运算到1000。
public class ThreadClass07 {

    public static void main(String[] args) {
        Runner test = new Runner();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        Thread t3 = new Thread(test);
        Thread t4 = new Thread(test);
        Thread t5 = new Thread(test);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

    private static class Runner implements Runnable {
        private volatile static Integer count = 0;

        @Override
        public void run() {
            // 这里注意：while写在锁外面，不然锁住就会是一个线程跑。
            // 并且锁内部要加判断count，来实现进程启动后数据没更新
            while (count < 1000) {
                synchronized (ThreadClass07.class) {
                    if (count < 1000) {
                        count++;
                        System.out.println(Thread.currentThread().getName() + "----->" + count);
                    }
                }
            }
            // 另一种思路是五个线程每个跑200次
            for (int i = 0; i < 200; i++) {
                synchronized (ThreadClass07.class) {
                    count++;
                    System.out.println(Thread.currentThread().getName() + "----->" + count);
                }
            }
        }
    }
}