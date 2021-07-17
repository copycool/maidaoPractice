package cn.maidaotech.java07.chapter03.order.model;

public class Product {
    private String name;
    private Double price;
    private Integer inventory;
    
    public Product() {
    }
    
  

    @Override
    public String toString() {
        return "Product [inventory=" + inventory + ", name=" + name + ", price=" + price + "]";
    }



    public Product(String name, Double price, Integer inventory) {
        this.name = name;
        this.price = price;
        this.inventory = inventory;
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
    
}
