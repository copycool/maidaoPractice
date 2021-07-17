package cn.maidaotech.java07.unit3.Order.service;

import cn.maidaotech.java07.unit3.Order.model.Account;
import cn.maidaotech.java07.unit3.Order.model.Order;
import cn.maidaotech.java07.unit3.Order.model.Prodect;

public class ReallyOrder implements OrderService {
    @Override
    public String creatOder(Prodect prodect, Order order, Account user) {
        // TODO Auto-generated method stub
        Double price = prodect.getPrice() * order.getQuantity();
        StringBuilder builder = new StringBuilder();
        String orderMessage1 = order.toString();
        String orderMessage2 = prodect.toString();
        builder.append(orderMessage1).append(orderMessage2);
        String orderMassage = builder.toString();

        return orderMassage;

    }

    private boolean checkquantity(Prodect prodect, Order order) {
        if (prodect.getAmount() < order.getQuantity()) {
            return false;
        }
        return true;
    }

    private boolean checksurplus(Prodect prodect, Order order, Account user) {
        if (user.getSurplus() < prodect.getPrice() * order.getQuantity()) {
            return false;
        }
        return true;
    }

}
