package cn.maidaotech.java07.chapter07.practice10;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) throws Exception {
       List<Ticket> tickets = new LinkedList<>();
       for (int i = 0; i < 100; i++) {
           tickets.add(new Ticket());
       }
       Platform p1 = new Platform(tickets);
       Platform p2 = new Platform(tickets);
       Platform p3 = new Platform(tickets);
       ExecutorService service = Executors.newCachedThreadPool();
       service.execute(p1);
       service.execute(p2);
       service.execute(p3);
       service.shutdown();
    }
}