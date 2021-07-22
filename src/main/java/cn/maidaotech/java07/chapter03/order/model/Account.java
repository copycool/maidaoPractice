package cn.maidaotech.java07.chapter03.order.model;

public class Account {
    //Account类包含账户名称、剩余金额等属性。
    private String userName;
    private String balance;

    public Account() {
    }

    public Account(String accountName, String leftMoney) {
        this.userName = accountName;
        this.balance = leftMoney;
    }

    public String getAccountName() {
        return userName;
    }

    public void setAccountName(String accountName) {
        this.userName = accountName;
    }

    public String getLeftMoney() {
        return balance;
    }

    public void setLeftMoney(String leftMoney) {
        this.balance = leftMoney;
    }
    
}