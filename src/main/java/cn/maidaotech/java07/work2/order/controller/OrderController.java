package cn.maidaotech.java07.work2.order.controller;

import cn.maidaotech.java07.work2.order.model.Account;
import cn.maidaotech.java07.work2.order.model.Product;
import cn.maidaotech.java07.work2.order.service.OrderServiceImpl;

public class OrderController {
    public static void main(String[] args) {
        // 实例化商品类,创建商城
        Product pro = new Product("小米12", 100.0, 500, "数码");

        // 初始化账户
        Account account = new Account("张三", 10000.0);

        OrderServiceImpl orderServiceImpl = new OrderServiceImpl();

        String res = orderServiceImpl.createOrder("小米", 22, pro, account);
        System.out.println(res);
    }
}