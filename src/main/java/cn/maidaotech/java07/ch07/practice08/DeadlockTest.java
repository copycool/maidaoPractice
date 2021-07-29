package cn.maidaotech.java07.ch07.practice08;

public class DeadlockTest {
    
    public static void main(String[] args) {
        Deadlock t1 = new Deadlock(0);
        Deadlock t2 = new Deadlock(1);
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }
}