package cn.maidaotech.java07.chapter03.order01.model01;

public class Order {
    private Double price;// 商品类型
    private Integer productSum;// 商品数量
    private String name;

    public Order() {
    }

    public Order(Double price, Integer productSum, String name) {
        this.price = price;
        this.productSum = productSum;
        this.name = name;
    }




    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getProductSum() {
        return productSum;
    }

    public void setProductSum(Integer productSum) {
        this.productSum = productSum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Order [name=" + name + ", price=" + price + ", productSum=" + productSum + "]";
    }

}

