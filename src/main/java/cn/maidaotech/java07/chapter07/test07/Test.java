package cn.maidaotech.java07.chapter07.test07;

public class Test {
    public static void main(String[] args) {
        RunableImpl run = new RunableImpl();
        Thread th = new Thread(run);
        th.start();
        Thread th1 = new Thread(run);
        th1.start();
        Thread th2 = new Thread(run);
        th2.start();
        Thread th3 = new Thread(run);
        th3.start();
        Thread th4 = new Thread(run);
        th4.start();
    }
}
