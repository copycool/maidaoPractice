package cn.maidaotech.java07.chapter07.practice10;

import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Wicket implements Runnable {

    private List<Ticket> tickets;
    private int count = 0;

    public Wicket(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            if (CollectionUtils.isEmpty(tickets)) {
                break;
            }
            synchronized (tickets) {
                if (!CollectionUtils.isEmpty(tickets)) {
                    Ticket ticket = tickets.remove(0);
                    System.out.println(Thread.currentThread().getName() + "-出售：" + ticket.getNumber());
                    count++;
                }
            }
            try {
                TimeUnit.MILLISECONDS.sleep(random.nextInt(200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "-共出售" + (count) + "张票");
    }
}
