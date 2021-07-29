package cn.maidaotech.java07.unit6.Test10;

import java.util.LinkedList;
import java.util.List;

public class Test10 {
    public static void main(String[] args) {
        List<Ticket> tickets = new LinkedList<>();
        for (int i = 0; i <= 10; i++) {
            tickets.add(new Ticket(i));
        }
    Thread thread=new Thread(new Window(tickets),"1号窗口");
    Thread thread1=new Thread(new Window(tickets),"2号窗口");
    Thread thread2=new Thread(new Window(tickets),"3号窗口");
    thread.start();
    thread1.start();
    thread2.start();
    }
}
