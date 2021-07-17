package cn.maidaotech.java07.work2.order.controller;

import java.util.HashMap;
import java.util.Map;

import cn.maidaotech.java07.work2.order.model.Account;
import cn.maidaotech.java07.work2.order.model.Product;
import cn.maidaotech.java07.work2.order.service.OrderServiceImpl;

public class OrderController {
    public static void main(String[] args) {
        // 实例化商品类,创建商城
        Product pro = new Product("小米12", 100.0, 500, "数码");
        Product pro2 = new Product("华为P40", 185.0, 500, "数码");
        Product pro3 = new Product("美的空调", 3500.0, 100, "家电");

        Map<String, Product> map = new HashMap<>();
        map.put("小米12", pro);
        map.put("华为P40", pro2);
        map.put("美的空调", pro3);
        // 初始化账户
        Account account = new Account("张三", 10000.0);

        OrderServiceImpl orderServiceImpl = new OrderServiceImpl();

        // String res = orderServiceImpl.createOrder("小米", 22, map, pro, account);
        String res = orderServiceImpl.createOrder("小米12", 22, map, account);

        System.out.println(res);
    }
}