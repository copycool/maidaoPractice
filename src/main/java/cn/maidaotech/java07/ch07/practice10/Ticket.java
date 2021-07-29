package cn.maidaotech.java07.ch07.practice10;

// a. 票抽象为类，拥有票号等属性
public class Ticket {
    private Integer number;

    public Ticket() {

    }

    public Ticket(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

   

}