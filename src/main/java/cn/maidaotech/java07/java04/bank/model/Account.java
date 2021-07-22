package cn.maidaotech.java07.java04.bank.model;

public class Account {
    private int id;
    private String name;
    private Integer money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Account(int id, String name, Integer money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

}