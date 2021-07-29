package cn.maidaotech.java07.thread.by_ticket;

/**
 * 车票类
 */
public class Ticket {
    private static Integer ticketNomm = 1355514;

    private Integer num;

    public Ticket() {
        num = ticketNomm++;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Ticket [num=" + num + "]";
    }

}