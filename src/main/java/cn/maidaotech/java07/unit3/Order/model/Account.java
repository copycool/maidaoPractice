package cn.maidaotech.java07.unit3.Order.model;

public class Account {
    private String account;
    private Double surplus;

    public Account() {
    }

    public Account(String account, Double surplus) {
        this.account = account;
        this.surplus = surplus;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Double getSurplus() {
        return surplus;
    }

    public void setSurplus(Double surplus) {
        this.surplus = surplus;
    }

}