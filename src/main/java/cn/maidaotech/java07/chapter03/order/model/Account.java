package cn.maidaotech.java07.chapter03.order.model;

public class Account {
    String accountName;
    Double balance;

    public Account(String accountName, Double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }
    public Account() {
    }

    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }     
}