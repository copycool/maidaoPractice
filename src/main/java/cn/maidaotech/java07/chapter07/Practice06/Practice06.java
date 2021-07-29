package cn.maidaotech.java07.chapter07.Practice06;

public class Practice06 {
    public static void main(String[] args) {
        oneThread thr1 = new oneThread();
        oneThread thr2 = new oneThread();
        oneThread thr3 = new oneThread();
        oneThread thr4 = new oneThread();
        oneThread thr5 = new oneThread();
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
    }
}
