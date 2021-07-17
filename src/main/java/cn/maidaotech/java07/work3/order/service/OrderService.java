package cn.maidaotech.java07.work3.order.service;

import cn.maidaotech.java07.work3.order.model.Order;

//购买的商品及数量作为参数
public interface OrderService {

    Order  createOrder(String productName,String string,Integer num );
  
    
}
