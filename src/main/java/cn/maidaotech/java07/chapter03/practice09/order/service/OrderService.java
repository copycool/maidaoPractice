package cn.maidaotech.java07.chapter03.practice09.order.service;

import cn.maidaotech.java07.chapter03.practice09.order.model.Order;

public interface OrderService {
    public Order createOrder(String accountName, String productName, Integer num);
}