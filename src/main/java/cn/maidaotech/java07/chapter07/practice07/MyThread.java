package cn.maidaotech.java07.chapter07.practice07;

public class MyThread implements Runnable {
    private static int count = 0;

    @Override
    public void run() {
        int i = 0;
        while (count < 100000) {
            count++;
            i++;
        }
        StringBuffer buffer = new StringBuffer();
        buffer.append(Thread.currentThread().getName()).append("进行了：").append(i).append("次自增");
        System.out.println(buffer.toString());
    }
}