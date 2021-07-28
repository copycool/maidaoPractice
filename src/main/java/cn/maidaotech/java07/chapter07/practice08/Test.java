package cn.maidaotech.java07.chapter07.practice08;

public class Test {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();
        Thread thread1 = new Thread(new MyThread(object1, object2));
        Thread thread2 = new Thread(new YouThread(object1, object2));
        thread1.start();
        thread2.start();
    }
}