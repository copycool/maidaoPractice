package cn.maidaotech.java07.thread.by_ticket;

import java.util.LinkedList;
import java.util.List;

public class TicketWindowTest {
    public static void main(String[] args) {

        // 循环创建车票
        List<Ticket> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new Ticket());
        }
        for (int i = 1; i <= 3; i++) {
            new Thread(new TicketWindow(list), "窗口" + i).start();
        }
    }
}