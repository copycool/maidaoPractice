package cn.maidaotech.java07.chapter07.Practice07;

public class Practice07 {
    public static void main(String[] args) throws InterruptedException {
        Runnerimpl a = new Runnerimpl();
        Thread b1 = new Thread(a, "线程1");
        Thread b2 = new Thread(a, "线程2");
        Thread b3 = new Thread(a, "线程3");
        Thread b4 = new Thread(a, "线程4");
        Thread b5 = new Thread(a, "线程5");
        b1.start();
        b2.start();
        b3.start();
        b4.start();
        b5.start();
        b1.join();
        b2.join();
        b3.join();
        b4.join();
        b5.join();
        a.stop();
        a.getCount();
    }
}
