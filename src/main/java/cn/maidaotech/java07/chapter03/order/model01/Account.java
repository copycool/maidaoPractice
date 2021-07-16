package cn.maidaotech.java07.chapter03.order.model01;

public class Account {
    private String accountTitle;//账户名称
    private Integer balance;//剩余金额

    public Account() {
    }

    public Account(String accountTitle, Integer balance) {
        this.accountTitle = accountTitle;
        this.balance = balance;
    }

    public String getAccountTitle() {
        return accountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
    
    
}
