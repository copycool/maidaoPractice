package cn.maidaotech.java07.unit3.Order.model;

public class Order {
    private String commodity;
    private Double quantity;

    public Order() {
    }

    public Order(String commodity, Double quantity) {
        this.commodity = commodity;
        this.quantity = quantity;
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Oder [commodity=" + commodity + ", quantity=" + quantity;
    }

}