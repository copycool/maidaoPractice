package cn.maidaotech.java07.chapter3.question9.order.model;
//Account类包含账户名称、剩余金额等属性
public class Account {
    private String accountTitle;
    private Double balance;
    public Account(){

    }
    public Account(String accountTitle,Double balance){
        this.accountTitle=accountTitle;
        this.balance=balance;
    }
    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }
    public String getAccountTitle() {
        return accountTitle;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public Double getBalance() {
        return balance;
    }

}