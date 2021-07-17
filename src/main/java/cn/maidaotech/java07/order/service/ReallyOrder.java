package cn.maidaotech.java07.order.service;

import cn.maidaotech.java07.order.model.Account;
import cn.maidaotech.java07.order.model.Order;
import cn.maidaotech.java07.order.model.Product;

public class ReallyOrder implements OrderService {

    @Override
    public  String createOrder(Product product, Account user, Order order) {
        // TODO Auto-generated method stub
        if (!checkAmount(product, order)) {
            return "库存数量不够";
        }
        if (!checkBalance(user, order ,product)) {
            return "余额不足";
        }
        Double price = order.getAmount() * product.getPrice();
        StringBuilder builder = new StringBuilder();
        String orderMessage1 = order.toString();
        builder.append(orderMessage1).append(",price=" + price + "]");
        String orderMessage= builder.toString();
        return orderMessage;
    }

    private boolean checkAmount(Product product, Order order) {
        if (product.getInventory() < order.getAmount()) {
            return false;
        }
        return true;
    }

    private boolean checkBalance(Account user, Order order, Product product) {
        if (user.getBalance() < (product.getPrice() * order.getAmount())) {
            return false;
        }
        return true;
    }

}
