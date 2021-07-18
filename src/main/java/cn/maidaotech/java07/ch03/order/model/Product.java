package cn.maidaotech.java07.ch03.order.model;

public class Product {
    private String name;
    private Integer price;
    private Integer stock;

    public Product(){

    }
    public Product(String name,Integer price,Integer stock) {
        this.name=name;
        this.price=price;
        this.stock=stock;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    
}
