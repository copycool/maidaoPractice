package cn.maidaotech.java07.work2.order.service;

import java.util.Map;

import cn.maidaotech.java07.work2.order.model.Account;
import cn.maidaotech.java07.work2.order.model.Product;

public interface OrderServicesInterface {
    public String createOrder(String productName, Integer purchasedNum, Product product, Account account);

    public String createOrder(String productName, Integer purchasedNum, Map<String, Product> map, Account account);

}