package cn.maidaotech.java07.chaptet03.order.service;

import cn.maidaotech.java07.chaptet03.order.model.Order;

public interface OrderService {
    public Order createOrder(String accountname, String productname, Integer productnum);


}