package cn.maidaotech.java07.chapter03.order.service;

import cn.maidaotech.java07.chapter03.order.model.Account;
import cn.maidaotech.java07.chapter03.order.model.Order;
import cn.maidaotech.java07.chapter03.order.model.Product;

public interface OrderService {

    public String createOrder(Product product, int num, Account account);
}