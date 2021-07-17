package cn.maidaotech.chapter03.example.order.model;

public class Product {
    private String name;
    private Integer price;
    private Integer count;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Product( String name, Integer price, Integer count) {
        
        this.name = name;
        this.price = price;
        this.count = count;
    }


    

}