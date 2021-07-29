package cn.maidaotech.java07.chapter07.test10;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Ticket> list = new LinkedList<>();
        for (int i = 2021000; i < 2021100; i++) {
            list.add(new Ticket(i));
        }
        Thread t1 = new Thread(new Platform(list));
        Thread t2 = new Thread(new Platform(list));
        Thread t3 = new Thread(new Platform(list));
        t1.start();
        t2.start();
        t3.start();
    }
}
