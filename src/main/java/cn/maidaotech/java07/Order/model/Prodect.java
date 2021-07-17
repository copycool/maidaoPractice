package cn.maidaotech.java07.unit3.Order.model;

public class Prodect {
    private String name;
    private Double price;
    private Double amount;

    public Prodect() {
    }

    @Override
    public String toString() {
        return ",price=" + price + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Prodect(String name, Double price, Double amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

}