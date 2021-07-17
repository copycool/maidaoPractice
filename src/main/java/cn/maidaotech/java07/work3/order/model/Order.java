package cn.maidaotech.java07.work3.order.model;



// Order类包含购买的什么商品和数量等属性
public class Order {
    private Product product;

    private Integer num;

    public Order() {
    }

    public Order(Product product, Integer num) {
        this.num = num;

        this.product = product;
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
