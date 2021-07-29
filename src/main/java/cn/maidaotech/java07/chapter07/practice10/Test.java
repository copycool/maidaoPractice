package cn.maidaotech.java07.chapter07.practice10;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private static List<Ticket> tickets = new ArrayList<>();
    private static List<Window> windows = new ArrayList<>();

    public static void main(String[] args) {
        Thread thread = new Thread(new Station(windows));
        thread.start();
    }

    static {
        initTicket();
        initWindow();
    }

    static void initTicket() {
        for (int i = 1; i <= 100; i++) {
            tickets.add(new Ticket(i, "ticket" + i));
        }
    }

    static void initWindow() {
        for (int i = 1; i < 4; i++) {
            windows.add(new Window(tickets, "窗口" + i));
        }
    }
}