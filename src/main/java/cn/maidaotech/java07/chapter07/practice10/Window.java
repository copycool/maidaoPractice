package cn.maidaotech.java07.chapter07.practice10;

import java.util.ArrayList;
import java.util.List;

public class Window implements Runnable {
    private List<Ticket> tickets = new ArrayList<>();

    public Window(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public void run() {
        while (tickets.size() > 0) {
            this.ticketing();
        }
    }

    private void ticketing() {
        Ticket ticket;
        int remain;
        synchronized (tickets) {
            remain = tickets.size();

            if (remain == 0) {
                System.out.println("\n票已售罄");
                return;
            }

            ticket = this.tickets.remove(tickets.size() - 1);

            StringBuffer buffer = new StringBuffer();
            buffer.append("\n").append(Thread.currentThread().getName()).append("：卖出 1 张票 \n").append(ticket.toString())
                    .append("\n剩余 ").append(remain).append(" 张票。");
            System.out.println(buffer.toString());
        }
    }
}
