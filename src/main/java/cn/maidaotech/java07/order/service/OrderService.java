package cn.maidaotech.java07.order.service;

import cn.maidaotech.java07.order.model.Account;
import cn.maidaotech.java07.order.model.Order;
import cn.maidaotech.java07.order.model.Product;

public interface OrderService {
    public String createOrder(Product product, Account user,Order order);
    
}
