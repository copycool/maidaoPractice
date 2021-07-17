package cn.maidaotech.java07.work3.order.service;



import cn.maidaotech.java07.work3.order.model.Account;
import cn.maidaotech.java07.work3.order.model.Order;
import cn.maidaotech.java07.work3.order.model.Product;

public class OrderServiceImpl implements OrderService {
    private static Product[] products = new Product[3];
    private static Account[] accounts = new Account[2];
    {
        products[0] = new Product("暴风大剑", 1300, 10);
        products[1] = new Product("无尽之刃", 3400, 2);
        products[2] = new Product("饮血刀", 3400, 2);
        accounts[0] = new Account("小明", 3400);
        accounts[1]=new Account("小炮", 6800);

    }

    @Override
    public Order createOrder(String productName, String accountName, Integer num) {
        // 没有用户
        Account account = findAccountByName(accountName);
        if (account == null) {
            return null;
        }
        // 没有产品名
        Product product = findProductByNmae(accountName);
        if (product == null) {
            return null;
        }
        // 库存不足时
        if (product.getStore() < num) {
            return null;
        }
        // 余额不足时
        if (product.getCharge() * num >= account.getBalance()) {
            return null;
        }
        Order order = new Order();
        order.setProduct(product);
        order.setNum(num);
        return order;
    }

    // 查找账户名字
    public static Account findAccountByName(String name) {
        if (name == null || name.length() == 0) {
            return null;
        }
        for (Account account : accounts) {
            if (name.equals(account.getIdname())) {
                return account;
            }
        }
        return null;
    }

    // 查找产品名字
    public static Product findProductByNmae(String name) {
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
