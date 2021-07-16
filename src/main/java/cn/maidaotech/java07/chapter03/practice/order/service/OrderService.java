package cn.maidaotech.java07.chapter03.practice.order.service;

import cn.maidaotech.java07.chapter03.practice.order.model.Account;
import cn.maidaotech.java07.chapter03.practice.order.model.Order;
import cn.maidaotech.java07.chapter03.practice.order.model.Product;

public interface OrderService {
    Order createOrder(Product product, Account account, Integer total);
}