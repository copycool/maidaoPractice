package cn.maidaotech.java07.work2.order.model;

public class Product {
    private String name;
    private Double price;
    private Integer inventory;
    private String types;

    public Product() {
    }

    public Product(String name, Double price, Integer inventory, String types) {
        this.name = name;
        this.price = price;
        this.inventory = inventory;
        this.types = types;
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

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    

}
