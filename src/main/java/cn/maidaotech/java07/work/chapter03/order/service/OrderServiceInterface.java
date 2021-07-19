package cn.maidaotech.java07.work.chapter03.order.service;

import cn.maidaotech.java07.work.chapter03.order.model.Order;

public interface OrderServiceInterface {
    Order createOrder(Integer accountId,Integer productId,Integer quantity);
}