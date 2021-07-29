package cn.maidaotech.java07.chapter07.answer.exercise7;

public class Count implements Runnable {
    private static int count = 0;

    @Override
    public void run() {
        try {
            while (true) {
                if (count > 100) {
                    break;
                }
                synchronized (Count.class) {
                    System.out.println(Thread.currentThread().getName() + " " + ++count);
                }
                Thread.yield();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
