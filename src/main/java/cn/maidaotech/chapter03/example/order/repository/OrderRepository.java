package cn.maidaotech.chapter03.example.order.repository;

import cn.maidaotech.chapter03.example.order.model.Account;
import cn.maidaotech.chapter03.example.order.model.Product;

public class OrderRepository {
    private static Product[] products = new Product[3];
    private static Account[] accounts = new Account[3];
    //如果不加static,不实例化该对象,没有该数据
    static{
        // 初始化测试商品
        products[0] = new Product("诺基亚", 7800, 10);
        products[1] = new Product("华为", 6800, 8);
        products[2] = new Product("小米", 3600, 20);
        // 初始化测试账户
        accounts[0] = new Account("迪丽热巴", 20000);
        accounts[1] = new Account("古力娜扎", 10000);
        accounts[2] = new Account("马尔扎哈", 5000);
    }
    //如果static以下方法,可以直接不生成类调用,否则需要实体化才能调用
    //查找有无该账户
    public  Account findAccountByName(String name) {
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

    //通过名字查找有无该商品
    public  Product findProductByName(String name) {
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