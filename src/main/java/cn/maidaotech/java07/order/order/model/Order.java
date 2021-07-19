package cn.maidaotech.java07.order.order.model;
//Order 类包含购买 的什么商品和数量属性， 
public class Order {
  private  Product product;
   private int quantity;
   
public Product getProduct() {
    return product;
}
public void setProduct(Product product) {
    this.product = product;
}
public int getQuantity() {
    return quantity;
}
public void setQuantity(int quantity) {
    this.quantity = quantity;
}
   
}
