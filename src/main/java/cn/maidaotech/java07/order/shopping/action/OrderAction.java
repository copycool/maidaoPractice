package cn.maidaotech.java07.order.action;

import cn.maidaotech.java07.order.model.Account;
import cn.maidaotech.java07.order.model.Order;
import cn.maidaotech.java07.order.model.Product;

// 创建一个 order 包，其下创建 model 包、service 包和 action 包。
// 在 model 包中包含 Product 类、 Order 类和 Account 类，其中 Product 类至少有名称、价格和库存数量等属性，
// Order 类包含购买 的什么商品和数量属service包中创建OrderService 类，
// 类中编写创建订单的方法 createOrder，所购买的商品及数量作为参数，实现验证商品库存 是否充足，以及账户金额是否足够支付本次购买，
// 满足这两个条件时 createOrder 方法返回 Order 信息。性，Account类包含账户名称、剩余金额等属性。
// 在 action 包中创建 OrderAction 类，编写 mian 方法调用创建订单的方法，打印输出订单 信息
public class OrderAction {
    public static void main(String[] args) {
         Account a1 = new Account();
         a1.setUseName("李逵");
         Order a2 = new Order();
         a2.name="可乐";
         a2.price=12;
         a2.quantity=23;
         System.out.println(a1.getUseName());
         System.out.println(a2.toString());
    }
}


