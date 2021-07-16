package cn.maidaotech.java07.chapter03.order.service;

import cn.maidaotech.java07.chapter03.order.model.Account;
import cn.maidaotech.java07.chapter03.order.model.Order;

public interface OrderServiceInterface {
    public  Order creatOrder(Account account, Order order);
   
}
