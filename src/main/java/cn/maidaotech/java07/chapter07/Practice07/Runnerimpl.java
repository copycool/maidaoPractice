package cn.maidaotech.java07.chapter07.Practice07;

public class Runnerimpl implements Runnable {
    private static volatile int count = 0;

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            count++;
            System.out.println(Thread.currentThread().getName() + ">>>"+count);
        }
        
    }

    public static void getCount() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("count==" + count);
    }

}
