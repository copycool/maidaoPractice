package cn.maidaotech.java07.chapter03;

import java.util.Date;

import javax.xml.crypto.Data;

public class Product {
    private String name;
    private double price;
    private Date creatAt;
    public Product() {
    }
    public Product(String name, double price, Date creatAt) {
        this.name = name;
        this.price = price;
        this.creatAt = creatAt;
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
    public Date getCreatAt() {
        return creatAt;
    }
    public void setCreatAt(Date creatAt) {
        this.creatAt = creatAt;
    }
    
    

}
