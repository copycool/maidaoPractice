package cn.maidaotech.java07.chapter6.question7;

public class InThread implements Runnable {
    private Integer count = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (InThread.class) {
                if (count >= 1000) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + ":count:" + (++count));
                Thread.yield();
            }
        }

    }
}