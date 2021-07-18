package cn.maidaotech.java07.ch03.order.model;

public class Account {
    private String name;
    private Integer balance;

    public Account(){

    }public Account(String name,Integer balance){
        this.name=name;
        this.balance=balance;
    }

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name= name;
    }
    public Integer getBalance() {
        return balance;
    }
    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    
}
