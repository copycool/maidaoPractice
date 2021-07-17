package cn.maidaotech.java07.chaptet03.order.action;

import cn.maidaotech.java07.chaptet03.order.model.Order;
import cn.maidaotech.java07.chaptet03.order.service.OrderService;
import cn.maidaotech.java07.chaptet03.order.service.OrderServiceImp;

public class OrderAction {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImp();
        
            Order order =  orderService.createOrder("lili", "小米11", 1);
            if (order != null) {
                System.out.println("lili成功购买1台小米11");
            }
        
        
           try {
                Order order2 =  orderService.createOrder("wowo", "小米10", 1);
                if (order2 != null) {
                    System.out.println("wowo成功购买1台小米10");
                }
           } catch (RuntimeException e) {
               System.out.println("账户余额不足");
           }
        
    }

}