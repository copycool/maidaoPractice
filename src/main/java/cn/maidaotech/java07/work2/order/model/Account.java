package cn.maidaotech.java07.work2.order.model;

public class Account {
    private String userNamel;
    private Double remainMoney;

    public Account() {
    }

    public Account(String userNamel, Double remainMoney) {
        this.userNamel = userNamel;
        this.remainMoney = remainMoney;
    }

    public String getUserNamel() {
        return userNamel;
    }

    public void setUserNamel(String userNamel) {
        this.userNamel = userNamel;
    }

    public Double getRemainMoney() {
        return remainMoney;
    }

    public void setRemainMoney(Double remainMoney) {
        this.remainMoney = remainMoney;
    }

}