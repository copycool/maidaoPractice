package cn.maidaotech.chapter03.example.order.service;

import cn.maidaotech.chapter03.example.order.model.Account;
import cn.maidaotech.chapter03.example.order.model.Order;
import cn.maidaotech.chapter03.example.order.model.Product;

public interface OrderService {
    //接口要这样写
    //因为是创建订单，这里要把返回类型改为order
    public Order  createOrder(Account account ,Product product, Integer number);
}