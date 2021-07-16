package cn.maidaotech.java07.chapter03.order.service;

import java.util.Random;

import cn.maidaotech.java07.chapter03.order.model.Account;
import cn.maidaotech.java07.chapter03.order.model.Order;
import cn.maidaotech.java07.chapter03.order.model.Product;
import cn.maidaotech.java07.chapter03.order.utils.dataUtils;

public class OrderService implements OrderServiceInterface {
    //service包中创建OrderService 类，类中编写创建订单的方法 createOrder，
    //所购买的商品及数量作为参数，
    //实现验证商品库存 是否充足，
    //以及账户金额是否足够支付本次购买，
    //满足这两个条件时 createOrder 方法返回 Order 信息
    public  Order creatOrder(Account account, Order order) {
        Product product =findIdByName(order.getProductName());
        if(product==null){
            System.out.println(order.getProductName()+"不在库存中");
            return null;
        }
        Order isorder= checkOrder(order.getProductName(),order.getProductNumber(), product, account);
        if(isorder==null){
            System.out.println("库存不足或金额不够");
            return null;
        }
        return isorder;
    }


    public  Order checkOrder(String productName ,Integer productNumber,Product product,Account account){
   
        if(productNumber>product.getInventoryNumber()){
            return null;
        }
        if(product.getPrice()*productNumber>account.getBalance()){
            return null;
        }
        Order order = new Order(productName,productNumber);
        return order;
    }
      


    public static Product findIdByName(String productName) {
        Product[] products = dataUtils.productData();
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(productName)) {
                return products[i];
            }
        }
        return null;
    }





    
}
