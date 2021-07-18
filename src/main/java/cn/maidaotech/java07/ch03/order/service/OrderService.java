package cn.maidaotech.java07.ch03.order.service;

import cn.maidaotech.java07.ch03.order.model.Order;

public interface OrderService {
    public Order createOrder(String accountName,String productName,Integer amount );
}
