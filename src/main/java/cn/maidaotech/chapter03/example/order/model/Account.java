package cn.maidaotech.chapter03.example.order.model;

public class Account {
    private String name;
    private Integer money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Account() {
    }

    public Account(String name, Integer money) {
        this.name = name;
        this.money = money;
    }

}