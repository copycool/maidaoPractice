package cn.maidaotech.java07.work3.order.model;



// 含账户名称、剩余金额等属性
public class Account {
    private String idname;
    private Integer balance;

    public Account(String idname,Integer balance) {
        this.idname=idname;
        this.balance=balance;
    }

    public Account() {
    }

    public String getIdname() {
        return idname;
    }

    public void setIdname(String idname) {
        this.idname = idname;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    
}
