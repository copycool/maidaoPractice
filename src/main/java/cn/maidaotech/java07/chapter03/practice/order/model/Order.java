package cn.maidaotech.java07.chapter03.practice.order.model;

public class Order {
    private Integer id;
    private Integer totalPrice;
    private String productName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Order(Integer id, Integer totalPrice, String productName) {
        this.id = id;
        this.totalPrice = totalPrice;
        this.productName = productName;
    }
}