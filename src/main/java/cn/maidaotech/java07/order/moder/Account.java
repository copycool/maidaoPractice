package cn.maidaotech.java07.order.moder;

public class Account {
    // Account类包含账户名称、剩余金额等属性。
    String accountname;
    int money;
    public Account(String accountname,int money){
        this.accountname=accountname;
        this.money=money;
    }
    public String getAccountname() {
        return accountname;
    }
    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    
}
