package cn.maidaotech.java07.work7.test10.control;

public class SellingTickets implements Runnable {
    int i = 100;

    public static void main(String[] args) {

        SellingTickets s = new SellingTickets();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);
        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            // 锁住的是同一对象
            synchronized (this) {
                if (i < 0) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + ":count:" + (i--));
                // 测试时，线程更容易切换
                Thread.yield();
            }
        }

    }
}
