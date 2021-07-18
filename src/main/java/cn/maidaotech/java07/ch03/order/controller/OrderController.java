package cn.maidaotech.java07.ch03.order.controller;

import cn.maidaotech.java07.ch03.order.model.Order;
import cn.maidaotech.java07.ch03.order.service.OrderService;
import cn.maidaotech.java07.ch03.order.service.OrderService01;

public class OrderController {
    public static void main(String[] args) {
        OrderService OrderService=new OrderService01();
          { Order order=OrderService.createOrder("笑笑","玉兰花",1000);
           if(order!=null){
               System.out.println("笑笑成功购买1000枝玫瑰花！");
           } 
        }
        {
           Order order=OrderService.createOrder("西夏","百合花",100);
           if(order!=null){
           System.out.println("西夏成功购买100枝百合花！");
           }
        }
    }
}
