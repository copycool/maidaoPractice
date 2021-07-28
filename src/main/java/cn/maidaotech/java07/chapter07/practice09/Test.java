package cn.maidaotech.java07.chapter07.practice09;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 3; i++) {
            Thread thread = new Thread(new MyThread(), "T" + i);
            thread.start();
            thread.join();
        }
    }
}