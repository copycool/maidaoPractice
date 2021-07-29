package cn.maidaotech.java07.chapter07.Practice10_Self;

import java.util.ArrayList;
import java.util.List;

public class Mythread10 implements Runnable {
    private Integer i = 0;
    private volatile boolean stop = true;
    private List<Ticket> tickets = new ArrayList<>();
    private int idex = 0;
    private int count1;
    private int count2;
    private int count3;

    @Override
    public void run() {

        while (stop) {
            synchronized (Mythread10.class) {
                if (i >= 100) {
                    break;
                }
                tickets.add(new Ticket(i + 1));
                i++;

                // System.out.println(tickets.size() + "张票靠开始出售");

                if (tickets.size() != 0) {
                    System.out.println(tickets.get(idex).getId() + "号票在" + Thread.currentThread().getName() + "被买走了");
                    tickets.remove(idex);
                }
                if (Thread.currentThread().getName().equals("站台1")) {
                    count1++;
                }
                if (Thread.currentThread().getName().equals("站台2")) {
                    count2++;
                }
                if (Thread.currentThread().getName().equals("站台3")) {
                    count3++;
                }
            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }

    // 安全退出
    public void stop() {
        stop = false;
    }
    public void getCount(){
        System.out.println("站台一售卖了"+count1+"张票");
        System.out.println("站台一售卖了"+count2+"张票");
        System.out.println("站台一售卖了"+count3+"张票");
    }
}
