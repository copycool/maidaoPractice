package cn.maidaotech.java07.chapter07.practice09;

public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ":" + "begin");
        Thread previous = Thread.currentThread();
        
        for (int i = 1; i < 4; i++) {
            Thread thr = new Thread(new Join(previous),"T" +  String.valueOf(i));
            thr.start();
            previous = thr;
        }
        System.out.println(Thread.currentThread().getName() + ":" + "end");   
    }
}