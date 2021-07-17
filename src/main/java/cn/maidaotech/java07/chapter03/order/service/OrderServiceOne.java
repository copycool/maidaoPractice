package cn.maidaotech.java07.chapter03.order.service;

import cn.maidaotech.java07.chapter03.order.model.BetterOrder;


public interface OrderServiceOne {
    public BetterOrder createOrderOne(String accountName, String productName, Integer num);
}
