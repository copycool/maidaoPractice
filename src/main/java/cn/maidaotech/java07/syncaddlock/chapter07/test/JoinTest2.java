package cn.maidaotech.java07.syncaddlock.chapter07.test;

public class JoinTest2 {
    public static void main(String[] args) throws InterruptedException {
    Thread a= new Thread(new A());
        Thread b= new Thread(new B());
        Thread c= new Thread(new C());
        a.start();
        b.join();
        System.out.println("4");
    }
}
class A implements Runnable{


    @Override
    public void run() {
        System.out.println("1");
    }
}
class B implements Runnable{

    @Override
    public void run() {
        System.out.println("2");

    }
}
class C implements Runnable{

    @Override
    public void run() {
        System.out.println("3");
    }
}