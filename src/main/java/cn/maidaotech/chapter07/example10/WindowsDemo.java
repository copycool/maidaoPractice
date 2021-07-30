package cn.maidaotech.chapter07.example10;

import java.util.LinkedList;
import java.util.List;

public class WindowsDemo {
    // private static Integer count=100;
    public static void main(String[] args) {
        List<Ticket> tickets = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            tickets.add(new Ticket("车票" + (i + 1)));
        }
        //Platform test = new Platform(tickets);
        Thread t1 = new Thread(new Platform(tickets));
        Thread t2 = new Thread(new Platform(tickets));
        Thread t3 = new Thread(new Platform(tickets));
        t1.start();
        t2.start();
        t3.start();
    }
}