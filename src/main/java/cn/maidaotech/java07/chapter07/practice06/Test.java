package cn.maidaotech.java07.chapter07.practice06;

public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            new Thread(new MyThread(), "thread" + i).start();
        }
    }
}