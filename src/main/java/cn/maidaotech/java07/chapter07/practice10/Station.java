package cn.maidaotech.java07.chapter07.practice10;

import java.util.ArrayList;
import java.util.List;

public class Station {
    private static List<Ticket> tickets = new ArrayList<>();

    public static void main(String[] args) {
        new Thread(new Window(tickets), "窗口1").start();
        new Thread(new Window(tickets), "窗口2").start();
        new Thread(new Window(tickets), "窗口3").start();

    }

    static {
        initTicket();
    }

    static List<Ticket> initTicket() {
        for (int i = 1; i <= 100; i++) {
            tickets.add(new Ticket(i, "ticket" + i));
        }
        return tickets;
    }
}