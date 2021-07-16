package cn.maidaotech.java07.chapter03.order.model;

public class Order {
    private String productType;//商品类型
    private Integer productSum;//商品数量

    public Order() {
    }

    public Order(String productType, Integer productSum) {
        this.productType = productType;
        this.productSum = productSum;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getProductSum() {
        return productSum;
    }

    public void setProductSum(Integer productSum) {
        this.productSum = productSum;
    }
    
}
