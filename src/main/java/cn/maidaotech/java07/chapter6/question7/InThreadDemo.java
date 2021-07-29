package cn.maidaotech.java07.chapter6.question7;

public class InThreadDemo {
    public static void main(String[] args) {
        InThread qu = new InThread();
        new Thread(qu).start();
        new Thread(qu).start();
        new Thread(qu).start();
        new Thread(qu).start();
        new Thread(qu).start();
    }
}