package cn.maidaotech.java07.chapter03.order01.controller01;

import cn.maidaotech.java07.chapter03.order01.model01.Account;
import cn.maidaotech.java07.chapter03.order01.model01.Product;
import cn.maidaotech.java07.chapter03.order01.serviec01.OrderServiceImpl;

public class OrderController {
    public static void main(String[] args) {
        OrderServiceImpl osi = new OrderServiceImpl();
        Product p = new Product("飞机", 1000.0,50);
        Account a = new Account("大兵瑞恩", 10000.0);
        System.out.println( osi.creatOrder(p,1, a));
    }
}
