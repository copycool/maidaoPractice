package cn.maidaotech.java07.chapter04.homework.exercise12;

public class BankStorage {
    // 用于存储银行储户的信息（其中储户的主要信息有储户的ID、姓名和余额）。
    private Integer id;
    private String name;
    private double balance;

    public BankStorage() {
    }

    public BankStorage(Integer id, String name, double balance) {
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankStorage [balance=" + balance + ", id=" + id + ", name=" + name + "]";
    }

}
