package cn.maidaotech.java07.work.chapter07.question10;

public class Station {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        new Thread(()->{
            for (int i = 0; i < 15; i++) {
                ticket.sellTicket();
            }
        },"窗口1").start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                ticket.sellTicket();
            }
        },"窗口2").start();

        new Thread(()->{
            for (int i = 0; i < 30; i++) {
                ticket.sellTicket();
            }
        },"窗口3").start();
    }
}
