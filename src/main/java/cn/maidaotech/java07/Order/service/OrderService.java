package cn.maidaotech.java07.unit3.Order.service;

import cn.maidaotech.java07.unit3.Order.model.Account;
import cn.maidaotech.java07.unit3.Order.model.Order;
import cn.maidaotech.java07.unit3.Order.model.Prodect;

public interface OrderService {

    public String creatOder(Prodect prodect, Order order, Account user);
}