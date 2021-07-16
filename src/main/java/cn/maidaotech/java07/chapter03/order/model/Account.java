package cn.maidaotech.java07.chapter03.order.model;

public class Account {
    //Account类包含账户名称、剩余金额等属性。
    private String accountName;
    private String leftMoney;

    public Account() {
    }

    public Account(String accountName, String leftMoney) {
        this.accountName = accountName;
        this.leftMoney = leftMoney;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(String leftMoney) {
        this.leftMoney = leftMoney;
    }
    
}