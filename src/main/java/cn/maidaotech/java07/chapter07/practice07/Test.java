package cn.maidaotech.java07.chapter07.practice07;

public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            new Thread(new MyThread(), "Thread" + i).start();
        }
    }
}