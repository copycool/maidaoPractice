package com.example.three.order.model;

public class Product {
    public Product(){

    }
    private String productName;
    private int price;
    private String inventory;
    public Product(String productName,int price,String inventory){
        this.productName = productName;
        this.price = price;
        this.inventory = inventory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }
    
    
    
}