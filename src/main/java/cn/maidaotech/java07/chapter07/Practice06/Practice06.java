package cn.maidaotech.java07.chapter07.Practice06;

public class Practice06 {
    public static void main(String[] args) throws InterruptedException {
        oneThread othr = new oneThread();
        Thread thr1 = new Thread(othr);
        Thread thr2 = new Thread(othr);
        Thread thr3 = new Thread(othr);
        Thread thr4 = new Thread(othr);
        Thread thr5 = new Thread(othr);

        thr1.setName("线程一");
        thr1.start();
        thr2.setName("线程二");
        thr2.start();
        thr3.setName("线程三");
        thr3.start();
        thr4.setName("线程四");
        thr4.start();
        thr5.setName("线程五");
        thr5.start();

        thr1.join();
        thr2.join();
        thr3.join();
        thr4.join();
        thr5.join();
       System.out.println(othr.sum);

    }
}
