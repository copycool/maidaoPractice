package cn.maidaotech.java07.work2.order.service;

import cn.maidaotech.java07.work2.order.model.Account;
import cn.maidaotech.java07.work2.order.model.Order;
import cn.maidaotech.java07.work2.order.model.Product;

public class OrderServiceImpl implements OrderService {

    @Override
    public String createOrder(String productName, Integer purchasedNum, Product product, Account account) {

        Product pro = product;
        Account acc = account;

        Double sumPrice = purchasedNum * pro.getPrice();
        if (pro.getInventory() - purchasedNum < 0) {
            return "商品库存不足";
        }
        if (sumPrice > acc.getRemainMoney()) {
            return "您的余额不足";

        }
        // 购买成功 减去库存和余额
        pro.setInventory(pro.getInventory() - purchasedNum);
        acc.setRemainMoney(acc.getRemainMoney() - sumPrice);

        // 打印商品
        System.out.println("购买成功");
        Order order = new Order(pro.getName(), purchasedNum, pro.getPrice(), sumPrice);
        return order.toString();
    }

}