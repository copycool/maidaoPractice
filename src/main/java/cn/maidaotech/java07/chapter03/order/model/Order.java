package cn.maidaotech.java07.chapter03.order.model;

public class Order {
    private String productName;
    private Integer productNumber;

    public Order() {
    }

    public Order(String productName, Integer productNumber) {
        this.productName = productName;
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    @Override
    public String toString() {
        return "订单： 商品名称是" + productName + ", 商品数量是" + productNumber;
    }

}
