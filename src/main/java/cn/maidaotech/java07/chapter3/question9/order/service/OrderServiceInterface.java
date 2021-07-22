package cn.maidaotech.java07.chapter3.question9.order.service;

import cn.maidaotech.java07.chapter3.question9.order.model.Account;
import cn.maidaotech.java07.chapter3.question9.order.model.Order;

/*service包中创建OrderService接口及其实现类
编写创建订单的方法createOrder
所购买的商品及数量作为参数，实现验证商品库存是否充足，以及账户金额是否足够支付本次购买
满足这两个条件时createOrder方法返回Order信息*/
public interface OrderServiceInterface {
    public  Order creatOrder(Account account, Order order);
    
}