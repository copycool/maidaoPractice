package cn.maidaotech.java07.chapter03.order.model;

public class Product {
    private String name;
    private double price;
    private Integer inventoryNumber;
    public Product() {
    }
    public Product(String name, double price, Integer inventoryNumber) {
        this.name = name;
        this.price = price;
        this.inventoryNumber = inventoryNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getInventoryNumber() {
        return inventoryNumber;
    }
    public void setInventoryNumber(Integer inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }
    
}
