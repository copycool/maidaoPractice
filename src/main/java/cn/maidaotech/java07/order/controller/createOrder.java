package cn.maidaotech.java07.order.controller;

import cn.maidaotech.java07.order.model.Account;
import cn.maidaotech.java07.order.model.Order;
import cn.maidaotech.java07.order.model.Product;
import cn.maidaotech.java07.order.service.ReallyOrder;

public class createOrder {
    public static void main(String[] args) {
        Product phone = new Product("手机", 1399.0, 10);
        Account ming = new Account("小明", 2000.0);
        Order order = new Order("手机", 1);
        ReallyOrder order1 = new ReallyOrder();
        System.out.println(order1.createOrder(phone,ming,order));
    }
}
