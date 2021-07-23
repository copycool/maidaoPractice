package cn.maidaotech.java07.chapter03.order.model;

public class Account {
    private String name;
    private Integer Id;
    private Double balance;
    
    @Override
    public String toString() {
        return "Account [Id=" + Id + ", balance=" + balance + ", name=" + name + "]";
    }

    public Account() {
    }
    
    public Account(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }

    public Account(String name, Double balance,Integer Id) {
        this.name = name;
        this.balance = balance;
        this.Id = Id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }
    
}
