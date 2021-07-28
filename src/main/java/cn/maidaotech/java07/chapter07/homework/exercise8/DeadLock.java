package cn.maidaotech.java07.chapter07.homework.exercise8;

public class DeadLock extends Thread {
    public int flag = 0;
    private static Object o1 = new Object();
    private static Object o2 = new Object();

    @Override
    public void run() {
        System.out.println("flag = " + flag);
        if (flag == 0) {
            synchronized (o1) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
                synchronized (o2) {
                    System.out.println(0);
                }
            }
        }
        if (flag == 1) {
            synchronized (o2) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1) {
                    System.out.println(1);
                }
            }
        }
    }
}
