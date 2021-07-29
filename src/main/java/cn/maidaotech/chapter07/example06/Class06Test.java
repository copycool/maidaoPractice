package cn.maidaotech.chapter07.example06;

public class Class06Test {
    public static void main(String[] args) {
        ThreadClass06 test = new ThreadClass06();
        // 实体化接口再次实体类
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

        // Thread previous = Thread.currentThread();
        // for (int i = 1; i < 6; i++) {
        // Thread thread = new Thread(new Domino(previous), "thread" +
        // String.valueOf(i));
        // thread.start();
        // previous = thread;
        // }
        // System.out.println(Thread.currentThread().getName() + " terminate.");
    }
}