package cn.maidaotech.chapter04.example12.model;

public class Account {
    private Integer id;
    private String name;
    private Integer balance;

    public Account() {
    }

    public Account(Integer id, String name, Integer balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [balance=" + balance + ", id=" + id + ", name=" + name + "]";
    }

}