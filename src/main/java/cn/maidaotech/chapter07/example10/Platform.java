package cn.maidaotech.chapter07.example10;

import java.util.List;

public class Platform implements Runnable {
    private List<Ticket> tickets;
    private int count = 0;

    @Override
    public void run() {
        while (true) {
            if (tickets.isEmpty()) {
                break;
            }
            synchronized (Platform.class) {
                if (!tickets.isEmpty()) {
                    System.out.println(Thread.currentThread().getName() + "售出了" + tickets.remove(0));
                    count++;
                }
            }
        }
        System.out.println(Thread.currentThread().getName() + "共售出了" + count + "张票");
    }

    public Platform(List<Ticket> tickets) {
        this.tickets = tickets;
    }


}