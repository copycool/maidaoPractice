package cn.maidaotech.java07.chapter6.question10;

public class TicketTest {
    public static void main(String[] args) {
        TicketSell tic = new TicketSell();
        new Thread(tic, "售票口1").start();
        new Thread(tic, "售票口2").start();
        new Thread(tic, "售票口3").start();
    }
}