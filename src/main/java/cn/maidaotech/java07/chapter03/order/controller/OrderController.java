package cn.maidaotech.java07.chapter03.order.controller;

import cn.maidaotech.java07.chapter03.order.serviec.OrderServiceImpl;

public class OrderController {
    public static void main(String[] args) {
        OrderServiceImpl osi = new OrderServiceImpl();
        osi.creatOrder("手机",5);
    }
}
