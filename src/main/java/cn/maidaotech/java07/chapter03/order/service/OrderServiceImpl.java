package cn.maidaotech.java07.chapter03.order.service;

import cn.maidaotech.java07.chapter03.order.model.Account;
import cn.maidaotech.java07.chapter03.order.model.Order;
import cn.maidaotech.java07.chapter03.order.model.Product;

//    类中编写创建订单的方法 createOrder，所购买的商品及数量作为参数，
//     实现验证商品库存 是否充足，以及账户金额是否足够支付本次购买，
//     满足这两个条件时 createOrder 方法返回 Order 信息。
public class OrderServiceImpl implements OrderService{
    public void createOrder(Product product, int num, Account account){
        Order order = new Order();

        boolean judge1 = judgeAccount(account.getBalance(), num, product.getPrice());
        boolean judge2 = judgeStock(product.getStock(),num);
        if(!judge1==true){
            System.out.println("余额不足！");
        }
        if(!judge2==true){
            System.out.println("库存不足！");
        }
        if(judge1==true&judge2==true){
            order.setProductType(product.getName());
            order.setNumber(num);
            System.out.println(account.getAccountName());
            System.out.println(order.getProductType());
            System.out.println(order.getNumber());
        }

    }

    public boolean judgeStock(int stock, int num){
        if(stock-num>=0){
            return true;
        }return false;
    } 
    public boolean judgeAccount(double balance, int num, double price){
        if(balance>=num*price){
            return true;
        }return false;
    }
}