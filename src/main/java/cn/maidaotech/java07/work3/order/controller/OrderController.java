package cn.maidaotech.java07.work3.order.controller;

import cn.maidaotech.java07.work3.order.model.Order;
import cn.maidaotech.java07.work3.order.service.OrderService;
import cn.maidaotech.java07.work3.order.service.OrderServiceImpl;

public class OrderController {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImpl();
        {
            Order order = orderService.createOrder("小炮", "无尽之刃",1);
            if (order != null) {
                System.out.println("小炮成功购买1把无尽之刃");
            }
        }

    }
}
