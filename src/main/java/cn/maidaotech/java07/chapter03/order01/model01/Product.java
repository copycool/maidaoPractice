package cn.maidaotech.java07.chapter03.order01.model01;

public class Product {
    private String productName;
    private Double productPrice;
    private Integer stockNum;//库存

    public Product() {
    }

    public Product(String productName, Double productPrice, Integer stockNum) {
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

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }
    
    
}
