package cn.maidaotech.java07.chapter07.seatwork;

public class Runner implements Runnable {
    private volatile boolean flag = true;
    private Integer i;

    public Runner(Integer i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (flag) {
            try {
                System.out.println(i++);
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public void cancel() {
        flag = false;
    }
}
