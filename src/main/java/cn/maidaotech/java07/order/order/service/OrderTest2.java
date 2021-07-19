package cn.maidaotech.java07.order.order.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import cn.maidaotech.java07.order.order.model.Product;

public class OrderTest2 implements OrderServiceInterface {
    public static void main(String[] args) {
        OrderTest2 p3 = new OrderTest2();

        System.out.println(p3.createOrder("xuebi", 12, 34, 3, 12));
    }

    @Override
    public String createOrder(String name, int quantity, int stock, double price, double remainingamount) {
        if(quantity>stock&&price>remainingamount){
            return  "购买成功";
       }else{
            return "购买失败";
       }
      
    }
}

