package cn.maidaotech.java07.chapter03.practice.order.service.impl;

import cn.maidaotech.java07.chapter03.practice.order.exception.OrderException;
import cn.maidaotech.java07.chapter03.practice.order.model.Account;
import cn.maidaotech.java07.chapter03.practice.order.model.Order;
import cn.maidaotech.java07.chapter03.practice.order.model.Product;
import cn.maidaotech.java07.chapter03.practice.order.service.OrderService;

public class OrderServiceImpl implements OrderService {

    @Override
    public Order createOrder(Product product, Account account, Integer total) {

        if (total == 0 || product == null || account == null) {
            throw new OrderException("订单有信息错误，请检查");
        }

        if (product.getStock() <= total) {
            throw new OrderException("库存不足");
        }
        int grossPrice = product.getPrice() * total;
        if (grossPrice > account.getBalance()) {
            throw new OrderException("余额不足");
        }
        Order order = new Order(1, grossPrice, product.getName());
        return order;
    }

}