package cn.maidaotech.java07.set_practice.account;

public class Account {
    private Integer id;
    private String name;
    private Double remainMoney;

    public Account() {
    }

    public Account(Integer id, String name, Double remainMoney) {
        this.id = id;
        this.name = name;
        this.remainMoney = remainMoney;
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", remainMoney=" + remainMoney + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRemainMoney() {
        return remainMoney;
    }

    public void setRemainMoney(Double remainMoney) {
        this.remainMoney = remainMoney;
    }

}