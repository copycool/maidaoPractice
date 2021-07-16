package cn.maidaotech.java07.work.testposition3.order.action;

import cn.maidaotech.java07.work.testposition3.order.data.TestData;
import cn.maidaotech.java07.work.testposition3.order.model.Account;
import cn.maidaotech.java07.work.testposition3.order.model.Order;
import cn.maidaotech.java07.work.testposition3.order.model.Product;
import cn.maidaotech.java07.work.testposition3.order.service.OrderService;

public class OrderAction {
    public static void main(String[] args) {
       
        OrderService orderService  = new OrderService();

        Order order =  orderService.createOrder(2, 4, 2);

        System.out.println(order.toString());
    }
}