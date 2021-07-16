package cn.maidaotech.java07.order.service;

import cn.maidaotech.java07.order.model.Order;
import cn.maidaotech.java07.order.model.Product;

public class ReallyOrder implements OrderService{

    @Override
    public String createOrder(Order o,Product p) {
        // TODO Auto-generated method stub
        String good = o.getGood();
        Integer amount =o.getAmount();
        
        String orderMessage = o.toString();
        return orderMessage;
    }
    
}
