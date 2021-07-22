package cn.maidaotech.java07.chapter3.question9.order.model;
//Product类至少有名称、价格和库存数量等属性
public class Product {
    private String name;
    private Integer price;
    private Integer stock;

    public Product(){

    }
    public Product(String name,Integer price,Integer stock){
        this.name=name;
        this.price=price;
        this.stock=stock;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getPrice() {
        return price;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public Integer getStock() {
        return stock;
    }
}