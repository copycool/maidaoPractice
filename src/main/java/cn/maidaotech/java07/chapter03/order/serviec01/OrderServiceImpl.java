package cn.maidaotech.java07.chapter03.order.serviec01;

import cn.maidaotech.java07.chapter03.order.model01.Account;
import cn.maidaotech.java07.chapter03.order.model01.Product;

public class OrderServiceImpl implements OrderService {

    @Override
    public boolean creatOrder(Product p, Integer num, Account a) {
        // TODO Auto-generated method stub
        if(num==null||p.getStockNum()<num){
            System.out.println("库存不足");           
        }
        if(num*p.getProductPrice()>a.getBalance()){
            System.out.println("账户余额不足");
            return false;
        }

        System.out.print(a.getAccountTitle());
        System.out.println(p.getProductName()+num);

        return true;
        
    }

    
}
