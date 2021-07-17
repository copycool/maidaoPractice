package cn.maidaotech.chapter03.example.order.controller;

import cn.maidaotech.chapter03.example.order.model.Account;
import cn.maidaotech.chapter03.example.order.model.Order;
import cn.maidaotech.chapter03.example.order.model.Product;
import cn.maidaotech.chapter03.example.order.repository.OrderRepository;
import cn.maidaotech.chapter03.example.order.service.OrderServiceImpl;

public class OrderController {
    //实例化

    public static void main(String[] args) {
         OrderRepository orderrepository = new OrderRepository();
        Account account = orderrepository.findAccountByName("迪丽热巴");
        Product product = orderrepository.findProductByName("小米");
        Integer count = 3;
        //切记调用非静态方法,要先实体化生成一个类os
        OrderServiceImpl os = new OrderServiceImpl();
        Order order = os.createOrder(account,product,count);
        if(order==null){
            return ;
        }else{
            System.out.println("订单如下\n"+account.getName()+"订购"+order.getCount()+"个"+order.getName());
        }

       
        
    }


}