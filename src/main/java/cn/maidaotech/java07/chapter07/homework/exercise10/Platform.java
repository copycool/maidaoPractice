package cn.maidaotech.java07.chapter07.homework.exercise10;

import java.util.ArrayList;

public class Platform extends Thread {
    private static ArrayList<Ticket> ticekts = new ArrayList<>(100);
    private static int flag = 99;
    static {
        for (int i = 0; i < 100; i++) {
            ticekts.add(new Ticket(i));
        }
    }

    @Override
    public void run() {
        while (true) {
            if (flag >= 0) {
                // System.out.println(Thread.currentThread().getName() + " " +
                // ticekts.get(flag).getNo()); 会出现三张99
                System.out.println(Thread.currentThread().getName() + " " + flag--);
                // flag--;
            } else {
                System.out.println("票售空");
                break;
            }
        }
    }
}
