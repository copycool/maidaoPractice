package cn.maidaotech.java07.chapter07;

public class Practice06 implements Runnable {
    // 创建一个线程类，该类有一个整型的实例变量，默认为0。
    // 在run方法中对变量执行1000次自增运算，并打印变量值。
    // 然后创建5个该类的实例线程，调用执行，观察变量的最终结果。
    private int i = 0;

    public static void main(String[] args) {

        Thread thread = new Thread();
        Practice06 t1 = new Practice06();

        t1.run();
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

    }

}