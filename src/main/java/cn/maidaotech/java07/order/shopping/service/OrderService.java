package cn.maidaotech.java07.order.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import cn.maidaotech.java07.order.model.Account;
import cn.maidaotech.java07.order.model.Order;
import cn.maidaotech.java07.order.model.Product;

public class OrderService {
    public static void main(String[] args) {
        Product p3 = new Product();
        Product p2 = new Product();
        p2.inventoryQuantity = 23;
        p3.price = 34;
        System.out.println(createOrder(2, p2,31));
    }
    public static String createOrder(int quantity,Product product,int remainingAmount ){
        if( quantity > product.inventoryQuantity&& remainingAmount < product.price ){
            return  "购买失败";
        }
        return "购买成功";
 }
}   



