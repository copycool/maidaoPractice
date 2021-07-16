package cn.maidaotech.java07.chapter03.practice.order.model;

public class Product {
    private String name;
    private Integer price;
    private Integer stock;
    private ProductTag productTag;

    public String getName() {
        return name;
    }

    public ProductTag getProductTag() {
        return productTag;
    }

    public void setProductTag(ProductTag productTag) {
        this.productTag = productTag;
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

    public Product(String name, Integer price, Integer stock) {
        super();
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(){
        super();
    }
    
}