package cn.maidaotech.java07.chapter07.Practice07;

import java.util.concurrent.TimeUnit;

public class Runnerimpl implements Runnable {
    int count = 0;
    private volatile static boolean stop =false;
    @Override
    public void run() {

        // for (int i = 0; i <= 1000; i++) {
        //     synchronized (Runnerimpl.class) {
        //         if (count >= 1000) {
        //             break;
        //         }
        //         count++;
        //         System.out.println(Thread.currentThread().getName() + ">>>" + count);
        //     }
        //     try {
        //         TimeUnit.MILLISECONDS.sleep(1);
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // }
        while(!stop){
            synchronized(Runnerimpl.class){
                if (count>=1000) {
                    break;
                }
                System.err.println(Thread.currentThread().getName()+">>>"+ ++count);
            }
            try {
                        TimeUnit.MILLISECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
        }
    }
    
    public void stop(){
        stop = true;
    }
    public void getCount() {
        System.out.println("count==" + count);
    }

}
