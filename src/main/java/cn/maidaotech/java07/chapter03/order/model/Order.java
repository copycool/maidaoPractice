package cn.maidaotech.java07.chapter03.order.model;

public class Order {
    //Order类包含购买的什么商品和数量等属性
   private Integer id;
   private Integer price;
   private String produceName;

    public Order() {
    }

    public Order(Integer id, Integer price, String produceName) {
        this.id = id;
        this.price = price;
        this.produceName = produceName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getProduceName() {
        return produceName;
    }

    public void setProduceName(String produceName) {
        this.produceName = produceName;
    }



}