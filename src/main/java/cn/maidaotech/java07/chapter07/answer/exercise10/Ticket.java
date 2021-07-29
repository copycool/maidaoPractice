package cn.maidaotech.java07.chapter07.answer.exercise10;

public class Ticket {
    private static int init_no=10000;
    private int number;

    public Ticket() {
        number=init_no++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    

    

   
}
