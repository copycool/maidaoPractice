package cn.maidaotech.java07.chapter03.order.controller;

// import cn.maidaotech.java07.chapter03.order.model.Account;
import cn.maidaotech.java07.chapter03.order.model.BetterOrder;
// import cn.maidaotech.java07.chapter03.order.model.Order;
// import cn.maidaotech.java07.chapter03.order.model.Product;
// import cn.maidaotech.java07.chapter03.order.service.ReallyOrder;
import cn.maidaotech.java07.chapter03.order.service.createOrderOneImp;

public class createOrder {
    public static void main(String[] args) {
        // Product phone = new Product("手机", 1399.0, 10);
        // Account ming = new Account("小明", 2000.0);
        // Order order = new Order("手机", 1);
        // ReallyOrder order1 = new ReallyOrder();
        // System.out.println(order1.createOrder(phone,ming,order));
        BetterOrder o1 = new BetterOrder();
        createOrderOneImp create = new createOrderOneImp();
        o1 = create.createOrderOne("马尔扎哈", "小米11", 1);
        System.out.println(o1);
    }
}
