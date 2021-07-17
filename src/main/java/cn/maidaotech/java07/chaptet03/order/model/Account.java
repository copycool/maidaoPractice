package cn.maidaotech.java07.chaptet03.order.model;

public class Account {
    private  String accountname;
    private  Integer accountmoney;


    public Account(){

    }
    public Account(String accountname,Integer accountmoney){
        this.accountname = accountname;
        this.accountmoney = accountmoney;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public Integer getAccountmoney() {
        return accountmoney;
    }

    public void setAccountmoney(Integer accountmoney) {
        this.accountmoney = accountmoney;
    }


    
}