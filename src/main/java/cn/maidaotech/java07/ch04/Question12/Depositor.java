package cn.maidaotech.java07.ch04.Question12;

public class Depositor {
    private int id;
    private String name;
    private double balance;

    public Depositor(){

    }
    public Depositor(int id,String name,double balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Depositor [balance=" + balance + ", id=" + id + ", name=" + name + "]";
    }
  
}
