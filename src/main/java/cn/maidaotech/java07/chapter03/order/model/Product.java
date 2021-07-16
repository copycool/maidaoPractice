package cn.maidaotech.java07.chapter03.order.model;

public class Product {
    private String productName;
    private Integer productPrice;
    private Integer stockNum;//库存

    public Product() {
    }

    public Product(String productName, Integer productPrice, Integer stockNum) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.stockNum = stockNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }
    
    
}
