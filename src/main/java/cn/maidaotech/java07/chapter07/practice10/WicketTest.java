package cn.maidaotech.java07.chapter07.practice10;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WicketTest {
    public static void main(String[] args) {
        List<Ticket> tickets = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            tickets.add(new Ticket());
        }
        Wicket w1 = new Wicket(tickets);
        Wicket w2 = new Wicket(tickets);
        Wicket w3 = new Wicket(tickets);
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(w1);
        service.execute(w2);
        service.execute(w3);
        service.shutdown();
    }
}
