package cn.maidaotech.java07.syncaddlock.chapter07.test;

public class HasSelfPrivateNum {

    private int num = 0;
    public synchronized void addI(String username) {
        try {
            if (username.equals("a")) {
                num = 100; System.out.println("a set over!"); Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(username + " num=" + num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class ThreadA extends Thread {
    private HasSelfPrivateNum numRef;
    public ThreadA(HasSelfPrivateNum numRef) {
        this.numRef = numRef;
    }
    @Override
    public void run() {
        numRef.addI("a");
    }
}
class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;
    public ThreadB(HasSelfPrivateNum numRef) {
        this.numRef = numRef;
    }
    @Override
    public void run() {
        numRef.addI("b");
    }
}
 class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef);
        threadB.start();
    }
}