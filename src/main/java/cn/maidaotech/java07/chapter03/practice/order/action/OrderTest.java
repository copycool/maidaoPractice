package cn.maidaotech.java07.chapter03.practice.order.action;

import cn.maidaotech.java07.chapter03.practice.order.model.Account;
import cn.maidaotech.java07.chapter03.practice.order.model.Product;
import cn.maidaotech.java07.chapter03.practice.order.service.OrderService;
import cn.maidaotech.java07.chapter03.practice.order.service.impl.OrderServiceImpl;

public class OrderTest {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImpl();
        Product product = new Product();
        product.setName("banana");
        product.setPrice(2);
        product.setStock(5);
        Account account = new Account();
        account.setBalance(50);
        account.setUserName("peas");
        orderService.createOrder(product,account,10);
    }
}