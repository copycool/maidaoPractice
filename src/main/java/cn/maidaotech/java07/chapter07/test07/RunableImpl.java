package cn.maidaotech.java07.chapter07.test07;

public class RunableImpl implements Runnable {
    private volatile Boolean isRunning = true;
    private Integer count = 0;

    @Override
    public void run() {
        while (isRunning) {
            synchronized (RunableImpl.class) {
                if (count > 10) {
                    break;
                }
                count++;
                System.out.println(Thread.currentThread().getName() + "count" + (count));
                // Thread.yield();
            }
        }

    }

    public void stop() {
        isRunning = false;
    }
}
