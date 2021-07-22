package cn.maidaotech.java07.chapter03.order01.serviec01;

import cn.maidaotech.java07.chapter03.order01.model01.Account;
import cn.maidaotech.java07.chapter03.order01.model01.Product;

public interface OrderServiceInterface {
    String creatOrder(Product p,Integer num,Account a);
    
}
