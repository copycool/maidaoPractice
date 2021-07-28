package cn.maidaotech.java07.chapter07.practice06;

public class MyThread implements Runnable {

    static Integer num = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            num++;
        }
        StringBuffer sBuffer = new StringBuffer();
        sBuffer.append(Thread.currentThread().getName()).append("的结果为：").append(num);
        System.out.println(sBuffer.toString());
    }

}