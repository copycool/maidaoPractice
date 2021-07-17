package cn.maidaotech.java07.chapter03.order.model;

public class BetterOrder {
    private Product product;
    private Integer num;
    
    @Override
    public String toString() {
        return "BetterOrder [num=" + num + ", product=" + product + "]";
    }

    public BetterOrder() {
    }
    
    public BetterOrder(Product product, Integer num) {
        this.product = product;
        this.num = num;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Integer getNum() {
        return num;
    }
    public void setNum(Integer num) {
        this.num = num;
    }
    
}
