package cn.maidaotech.java07.ch03.order.model;

public class Order {
    private Product product;
    private Integer amount;

    public Order(){

    }public Order(Product product,Integer amount){
        this.product =product;
        this.amount=amount;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    

    
}
