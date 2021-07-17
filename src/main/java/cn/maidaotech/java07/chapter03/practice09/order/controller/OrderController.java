package cn.maidaotech.java07.chapter03.practice09.order.controller;

import cn.maidaotech.java07.chapter03.practice09.order.model.Order;
import cn.maidaotech.java07.chapter03.practice09.order.service.OrderService;
import cn.maidaotech.java07.chapter03.practice09.order.service.OrderServiceImpl;

public class OrderController {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImpl();
        {
            Order order = orderService.createOrder("古力娜扎", "IPhone12", 2);
            if (order != null) {
                System.out.println("古力娜扎成功购买2台IPhone12");
            }
        }
        {
            Order order = orderService.createOrder("迪丽热巴", "华为P40", 1);
            if (order != null) {
                System.out.println("迪丽热巴成功购买1台华为P40");
            }
        }
    }
}