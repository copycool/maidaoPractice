package cn.maidaotech.java07.chapter03.order.serviec;

import cn.maidaotech.java07.chapter03.order.model.Account;
import cn.maidaotech.java07.chapter03.order.model.Product;

public class OrderServiceImpl implements OrderService {

    @Override
    public boolean creatOrder(String str, Integer num) {
        // TODO Auto-generated method stub
        Product p = new Product("手机",1000,10);
        Account account = new Account("小明",5000);
        if(num==null||num>p.getStockNum()){
            System.out.println("库存不够");      
            return false;      
        }
        if((p.getProductPrice()*num)>account.getBalance()){
            System.out.println("账户余额不足");
            return false;
        }

        System.out.println("订单信息："+str+num);
        return true;
    }
    
}
