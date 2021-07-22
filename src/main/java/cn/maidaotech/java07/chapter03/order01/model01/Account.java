package cn.maidaotech.java07.chapter03.order01.model01;

public class Account {
    private String accountTitle;//账户名称
    private Double balance;//剩余金额

    public Account() {
    }

    public Account(String accountTitle, Double balance) {
        this.accountTitle = accountTitle;
        this.balance = balance;
    }

    public String getAccountTitle() {
        return accountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
    
}
