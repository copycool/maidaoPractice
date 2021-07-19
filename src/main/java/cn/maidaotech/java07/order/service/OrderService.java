package cn.maidaotech.java07.order.service;
// 创建OrderService类，类中编写创建订单的方法 createOrder，所购买的商品及数量作为参数，实现验证商品库存 
// 是否充足，以及账户金额是否足够支付本次购买，满足这两个条件时 createOrder 方法返回 Order 信息。



public class  OrderService implements OrderServiceInterface {
    public static void main(String[] args) {
        OrderService orderService=new OrderService();
        System.out.println(orderService.createOrdertext("小红", "苹果", 2));
    }

    @Override
    public String createOrdertext(String accountname, String commodityname, int quantity) {
        
        return accountname+"购买了"+commodityname +quantity+"个";
        
    }
   }



