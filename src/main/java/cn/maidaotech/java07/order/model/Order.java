package cn.maidaotech.java07.order.model;

public class Order {
    private String good;
    private Integer amount;
    
    public Order() {
    }
    public Order(String good, Integer amount) {
        this.good = good;
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "Order [amount=" + amount + ", good=" + good  ;
    }
    public String getGood() {
        return good;
    }
    public void setGood(String good) {
        this.good = good;
    }
    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    
}
