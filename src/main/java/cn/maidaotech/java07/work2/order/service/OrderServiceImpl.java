package cn.maidaotech.java07.work2.order.service;

import java.util.Map;

import cn.maidaotech.java07.work2.order.model.Account;
import cn.maidaotech.java07.work2.order.model.Order;
import cn.maidaotech.java07.work2.order.model.Product;

public class OrderServiceImpl implements OrderService {

    @Override
    public String createOrder(String productName, Integer purchasedNum, Product product, Account account) {

        Product pro = product;
        Account acc = account;

        Double sumPrice = purchasedNum * pro.getPrice();
        if (pro.getInventory() < purchasedNum) {
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
        Order order = new Order(pro.getName(), purchasedNum, pro.getPrice(), sumPrice, pro.getTypes());
        return order.toString();
    }

    /**
     * 使用重载对创建订单重载入另一个方式
     * 
     * 方式二（map）
     */

    @Override
    public String createOrder(String productName, Integer purchasedNum, Map<String, Product> map, Account account) {
        if (account == null || map == null) {
            return "错误：商城、账户暂未初始化";
        }

        // 判断商品是否存在
        if (!map.containsKey(productName)) {
            return "购买失败：您要购买的商品不存在";
        }
        Product pro = map.get(productName);
        // 判断商品库存是否存在
        if (pro.getInventory() < purchasedNum) {
            return "购买失败：您所购买的商品库存不足";
        }
        // 判断个人账户的金额是否足够
        double sumPrice = purchasedNum * pro.getPrice();
        if (account.getRemainMoney() - sumPrice < 0) {
            return "购买失败：您的账户余额不足";
        }
        System.out.println("购买成功");
        Order order = new Order(pro.getName(), purchasedNum, pro.getPrice(), sumPrice, pro.getTypes());
        return order.toString();
    }

}