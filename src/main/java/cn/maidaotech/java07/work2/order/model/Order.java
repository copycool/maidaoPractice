package cn.maidaotech.java07.work2.order.model;

public class Order {
    private String purchased;
    private Integer quantity;
    private Double onePrice;
    private Double sumPrice;
    private String types;

    public Order() {
    }

    public Order(String purchased, Integer quantity, Double onePrice, Double sumPrice, String types) {
        this.purchased = purchased;
        this.quantity = quantity;
        this.onePrice = onePrice;
        this.sumPrice = sumPrice;
        this.types = types;
    }

    @Override
    public String toString() {
        return "{  商品名：" + purchased + " 购买数量：" + quantity + " 单价：" + onePrice + "元  " + " 总价：" + sumPrice + "元"
                + "  类型： " + types + "}";

    }

    public String getPurchased() {
        return purchased;
    }

    public void setPurchased(String purchased) {
        this.purchased = purchased;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getOnePrice() {
        return onePrice;
    }

    public void setOnePrice(Double onePrice) {
        this.onePrice = onePrice;
    }

    public Double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Double sumPrice) {
        this.sumPrice = sumPrice;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

}