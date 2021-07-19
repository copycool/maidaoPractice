package cn.maidaotech.java07.order.order.model;
// 创建一个 order 包，其下创建 model 包、service 包和 action 包。
//  Product 类至少有名称、价格和库存数量等属性

public class Product {
  private  String name;
  private double price;
  private  int stock;
  public Product(String name,double price,int stock){
      this.name=name;
      this.price=price;
      this.stock=stock;
  }
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}
public int getStock() {
    return stock;
}
public void setStock(int stock) {
    this.stock = stock;
}
@Override
public String toString() {
    return "Product [name=" + name + ", price=" + price + ", stock=" + stock + "]";
}

  
}
