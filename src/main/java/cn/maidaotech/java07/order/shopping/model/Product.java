package cn.maidaotech.java07.order.model;

public class Product {
   public String tradeName;
   public  int price;
   public  int inventoryQuantity;

public void setTradeName(String a){
 this.tradeName=a;;
}
public String getTradeName(){
   return tradeName;
}
}
/**
 * setXXX(){}
 * 构造器   为属性赋值，，方法没有返回值，，有参数
 * 
 * getXXX(){}
 * 访问器   获取属性的值，，方法有返回值，，没有参数
 */