package cn.maidaotech.java07.work.chapter03.order.action;

import cn.maidaotech.java07.work.chapter03.order.model.Order;
import cn.maidaotech.java07.work.chapter03.order.service.OrderService;

public class OrderAction {
    public static void main(String[] args) {
       
        OrderService orderService  = new OrderService();

        Order order =  orderService.createOrder(2, 4, 2);

        System.out.println(order.toString());
        
        
        
    }
}