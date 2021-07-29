package cn.maidaotech.java07.chapter07.test10;

import java.util.List;

import org.springframework.util.CollectionUtils;

public class Platform implements Runnable {
    private List<Ticket> tickets;
    private int count = 0;

    public Platform(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public void run() {

        while (true) {
            if (CollectionUtils.isEmpty(tickets)) {
                break;
            }
            synchronized (tickets) {
                if (!CollectionUtils.isEmpty(tickets)) {
                    Ticket ticket = tickets.remove(0);
                    System.out.println(Thread.currentThread().getName() + "卖了" + ticket.getTkNumber() + "票");
                    count++;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }
        System.out.println(Thread.currentThread().getName() + "总共卖了" + count + "张票");
    }

}
