package cn.maidaotech.java07.chapter07.practice08;

public class DeadLock {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        Thread threadA = new Thread(new TreadA(a,b),"threadA");
        Thread threadB = new Thread(new TreadB(a,b),"threadB");
        threadA.start();
        threadB.start();
    }
}