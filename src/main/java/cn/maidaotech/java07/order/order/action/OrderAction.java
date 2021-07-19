package cn.maidaotech.java07.order.order.action;

import cn.maidaotech.java07.order.order.model.Account;
import cn.maidaotech.java07.order.order.model.Product;

//在 action 包中创建 OrderAction 类，编写 mian 方法调用创建订单的方法，打印输出订单 信息
public class OrderAction {
    public static void main(String[] args) {
        Product p1 = new Product("可乐", 2.5, 100);
        Account p2 = new Account("wangyin", 90);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
       






    }
   

}
