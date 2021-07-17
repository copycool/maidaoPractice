package cn.maidaotech.java07.order.model;

public class Order {
    public int price;
    public String  name;
    public int quantity;
    public String toString() {
    return "商品 [商品名=" + name + ", 数量=" +quantity+ ", 价格=" + price +"]";
} 
}
