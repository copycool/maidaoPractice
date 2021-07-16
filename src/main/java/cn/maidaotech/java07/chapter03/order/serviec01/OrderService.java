package cn.maidaotech.java07.chapter03.order.serviec01;

import cn.maidaotech.java07.chapter03.order.model01.Account;
import cn.maidaotech.java07.chapter03.order.model01.Product;

public interface OrderService extends OrderServiceInterface {
    boolean creatOrder(Product p,Integer num,Account a);
}
