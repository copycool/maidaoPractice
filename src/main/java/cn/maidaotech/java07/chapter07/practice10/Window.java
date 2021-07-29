package cn.maidaotech.java07.chapter07.practice10;

import java.util.List;

public class Window implements Runnable {
    private List<Ticket> tickets;
    private String name;

    public Window(List<Ticket> tickets, String name) {
        this.tickets = tickets;
        this.name = name;
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
                System.out.println("\n购票失败，票已售罄");
                return;
            }

            ticket = this.tickets.remove(tickets.size() - 1);

            StringBuffer buffer = new StringBuffer();
            buffer.append("\n").append(this.name).append("：卖出 1 张票 \n").append(ticket.toString()).append("\n剩余 ")
                    .append(remain).append(" 张票。");
            System.out.println(buffer.toString());
            try {
                Thread.currentThread().sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
