package cn.maidaotech.java07.chapter03.order.action;

// import org.springframework.core.annotation.Order;


import cn.maidaotech.java07.chapter03.order.service.OrderService;

import cn.maidaotech.java07.chapter03.order.model.Account;
import cn.maidaotech.java07.chapter03.order.model.Order;

//service包中创建OrderService 类，类中编写创建订单的方法 createOrder，
//所购买的商品及数量作为参数，
//实现验证商品库存 是否充足，
//以及账户金额是否足够支付本次购买，
//满足这两个条件时 createOrder 方法返回 Order 信息
public class OrderAction {

    public static void main(String[] args) {
        Account account = new Account("陈佳楠", 10000);
        Order order = new Order("小米手机", 1);
        OrderService orderService = new OrderService();
        Order isValidOrder = orderService.creatOrder(account, order);
        if (isValidOrder != null) {
            System.out.println(isValidOrder.toString());
        }

        Order order2 = new Order("小米手机", 150);
        Order isValidOrder2 = orderService.creatOrder(account, order2);
        if (isValidOrder2 != null) {
            System.out.println(isValidOrder2.toString());
        }

        Order order3 = new Order("电脑", 150);
        Order isValidOrder3 = orderService.creatOrder(account, order3);
        if (isValidOrder3 != null) {
            System.out.println(isValidOrder3.toString());
        }
    }

}
