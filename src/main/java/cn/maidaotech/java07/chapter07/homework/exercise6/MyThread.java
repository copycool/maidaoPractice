package cn.maidaotech.java07.chapter07.homework.exercise6;

public class MyThread implements Runnable {
    private Integer i;

    public MyThread(Integer i) {
        this.i = i;
    }

    @Override
    public void run() {
        //i=1000 为什么不从0开始？
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

    }

}
