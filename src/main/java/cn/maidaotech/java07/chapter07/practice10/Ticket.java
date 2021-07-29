package cn.maidaotech.java07.chapter07.practice10;

public class Ticket {
    private Integer ticketNumber;
    private String ticketName;

    public Ticket(Integer ticketNumber, String ticketName) {
        this.ticketNumber = ticketNumber;
        this.ticketName = ticketName;
    }

    public Integer getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(Integer ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    @Override
    public String toString() {
        return "票名： " + ticketName + "\t编号： " + ticketNumber;
    }
}