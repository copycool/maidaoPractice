package cn.maidaotech.java07.third.order.moder;

public class Order {
    // Order 类包含购买的什么商品和数量属性o
    String commodityname;
    int quantity;
   
    public Order(String commodityname,int quantity){
        this.commodityname=commodityname;
        this.quantity=quantity;
    }
    public String getCommodityname() {
        return commodityname;
    }
    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
