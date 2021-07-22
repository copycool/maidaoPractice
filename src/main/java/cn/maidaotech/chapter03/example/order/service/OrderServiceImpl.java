package cn.maidaotech.chapter03.example.order.service;

import cn.maidaotech.chapter03.example.order.model.Account;
import cn.maidaotech.chapter03.example.order.model.Order;
import cn.maidaotech.chapter03.example.order.model.Product;

public class OrderServiceImpl implements OrderService {
    // 实现***接口的实现类叫做***Impl
    // 重写接口中的方法

    @Override
    public Order createOrder(Account account, Product product, Integer number) {

        if (account == null) {
            System.out.println("账号不存在");
            return null;
        }

        if (product == null) {
            System.out.println("产品不存在");
            return null;
        }
        if (product.getCount() < 1 || product.getCount() < number) {
            System.out.println("产品库存不足,生成订单失败");
            return null;
        }

        if (account.getMoney() < product.getPrice() * number) {
            System.out.println("余额不足,生成订单失败");
            return null;
        }

        Order order = new Order();
        order.setName(product.getName());
        order.setCount(number);
        return order;
    }
        
}