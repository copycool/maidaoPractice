package cn.maidaotech.java07.chapter03.order01.serviec01;

import cn.maidaotech.java07.chapter03.order01.model01.Account;
import cn.maidaotech.java07.chapter03.order01.model01.Order;
import cn.maidaotech.java07.chapter03.order01.model01.Product;

public class OrderServiceImpl implements OrderService {
Order order = new Order();
    @Override
    public String creatOrder(Product p, Integer num, Account a) {
        // TODO Auto-generated method stub
        if(num==null||p.getStockNum()<num){
            return ("库存不足");           
        }
        if(num*p.getProductPrice()>a.getBalance()){
            return ("账户余额不足");
        }
        order.setName(a.getAccountTitle());
        order.setPrice(p.getProductPrice());
        order.setProductSum(num);
        return order.getName()+order.getPrice()+order.getProductSum();
        
    }

    
}
