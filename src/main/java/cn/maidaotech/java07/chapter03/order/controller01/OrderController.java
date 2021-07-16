package cn.maidaotech.java07.chapter03.order.controller01;

import cn.maidaotech.java07.chapter03.order.model01.Account;
import cn.maidaotech.java07.chapter03.order.model01.Product;
import cn.maidaotech.java07.chapter03.order.serviec01.OrderServiceImpl;

public class OrderController {
    public static void main(String[] args) {
        OrderServiceImpl osi = new OrderServiceImpl();
        Product p = new Product("手机", 1000,50);
        Account a = new Account("小王", 10000);
        osi.creatOrder(p,20, a);
    }
}
