package cn.maidaotech.java07.chapter07.answer.exercise10;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Platform implements Runnable {
    private ArrayList<Ticket> tickes;
    private int count = 0;

    public Platform(ArrayList<Ticket> tickes) {
        this.tickes = tickes;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            if (tickes.isEmpty()) {
                System.out.println(Thread.currentThread().getName() + " 票已售空");
                break;
            }
            synchronized (tickes) {
                if (!tickes.isEmpty()) {
                    Ticket ticket = tickes.remove(0);
                    System.out.println(Thread.currentThread().getName() + " 出售 " + ticket.getNumber());
                    count++;
                }
                try {
                    TimeUnit.MILLISECONDS.sleep(random.nextInt(200));
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        }
        System.out.println("共出售票 " + count);
    }
}
