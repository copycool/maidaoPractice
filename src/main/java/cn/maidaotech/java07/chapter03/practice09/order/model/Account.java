package cn.maidaotech.java07.chapter03.practice09.order.model;

public class Account {
    private String name;
    private Integer balance;

    public Account(String name, Integer balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return this.balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

}