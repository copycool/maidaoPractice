package cn.maidaotech.java07.order.model;
// 在 model 包中包含 Product 类、 Order 类和 Account 类，其中 Product 类至少有名称、价格和库存数量等属性，
// Order 类包含购买 的什么商品和数量属性，Account类包含账户名称、剩余金额等属性
public class Account {
   private String useName;
   public   int remainingAmount; 
   public void setUseName(String useName) {
    this.useName = useName;
}
public String getUseName(){
    return useName;
}  
}
