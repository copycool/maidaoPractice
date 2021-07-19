package cn.maidaotech.java07.order.order.service;
//service包中创建OrderService 类，类中编写创建订单的方法 createOrder，
//所购买的商品及数量作为参数，
// 实现验证商品库存 是否充足，以及账户金额是否足够支付本次购买，满足这两个条件时 createOrder 方法返回 Order 信息
public class  OrderService {
    public String createOrder(String name,int quantity,int stock,double price,double remainingamount){
 if(quantity>stock&&price>remainingamount){
     return  "购买成功";
}else{
     return "购买失败";
}
}
}


