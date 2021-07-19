package cn.maidaotech.java07.order.service;
// service 包下创建接口 OrderServiceInterface，接口中定义 createOrder 方法，让 
// OrderService 类继承该接口，并实现 createOrder 方法。
public interface OrderServiceInterface {
    public String createOrdertext(String accountname,String commodityname,int quantity);    
}
