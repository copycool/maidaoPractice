package cn.maidaotech.java07.work.chapter07.question10;

public class Ticket {
    private Integer ticket  =30;
    public synchronized void sellTicket(){
        if (ticket >0){
            System.out.println(Thread.currentThread().getName()+"卖了第"+ticket+"张票，还剩"+(--ticket)+"张");
        }
    }
}
