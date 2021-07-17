package cn.maidaotech.java07.chapter03.practice09.order.service;

import cn.maidaotech.java07.chapter03.practice09.order.model.Account;
import cn.maidaotech.java07.chapter03.practice09.order.model.Order;
import cn.maidaotech.java07.chapter03.practice09.order.model.Product;

public class OrderServiceImpl implements OrderService {

    private static Product[] products = new Product[3];
    private static Account[] accounts = new Account[3];

    {
        // 初始化测试商品
        products[0] = new Product("IPhone12", 7800, 10);
        products[1] = new Product("华为P40", 6800, 8);
        products[2] = new Product("小米11", 3600, 20);
        // 初始化测试账户
        accounts[0] = new Account("迪丽热巴", 20000);
        accounts[1] = new Account("古力娜扎", 10000);
        accounts[2] = new Account("马尔扎哈", 5000);
    }

    @Override
    public Order createOrder(String accountName, String productName, Integer num) {
        Account account = findAccountByName(accountName);
        if (account == null) {
            System.out.println("账户不存在。");
            return null;
        }
        Product product = findProductByName(productName);
        if (product == null) {
            System.out.println("商品不存在。");
            return null;
        }
        if (product.getStock() < num) {
            System.out.println("该商品库存不足，下单失败");
            return null;
        }
        if (product.getPrice() * num > account.getBalance()) {
            System.out.println("账户余额不足");
            return null;
        }
        Order order = new Order();
        order.setProduct(product);
        order.setNum(num);
        return order;
    }

    private static Account findAccountByName(String name) {
        if (name == null || name.length() == 0) {
            return null;
        }
        for (Account account : accounts) {
            if (name.equals(account.getName())) {
                return account;
            }
        }
        return null;
    }

    private static Product findProductByName(String name) {
        if (name == null || name.length() == 0) {
            return null;
        }
        for (Product product : products) {
            if (name.equals(product.getName())) {
                return product;
            }
        }
        return null;
    }
}