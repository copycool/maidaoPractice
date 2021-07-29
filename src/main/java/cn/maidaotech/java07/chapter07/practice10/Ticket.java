package cn.maidaotech.java07.chapter07.practice10;

public class Ticket {
    private static int INIT_NO = 10000;

    private int number;

    public Ticket() {
        number = INIT_NO++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
