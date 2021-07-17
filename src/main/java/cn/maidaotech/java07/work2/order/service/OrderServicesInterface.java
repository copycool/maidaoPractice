package cn.maidaotech.java07.work2.order.service;

import cn.maidaotech.java07.work2.order.model.Account;

import cn.maidaotech.java07.work2.order.model.Product;

import java.util.Map;

public interface OrderServicesInterface {
    public String createOrder(String productName, Integer purchasedNum, Product product, Account account);

    public String createOrder(String productName, Integer purchasedNum, Map<String, Product> map, Account account);

}