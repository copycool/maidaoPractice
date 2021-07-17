package cn.maidaotech.java07.chaptet03.order.service;

import cn.maidaotech.java07.chaptet03.order.model.Account;
import cn.maidaotech.java07.chaptet03.order.model.Order;
import cn.maidaotech.java07.chaptet03.order.model.Product;

public class OrderServiceImp implements OrderService {
    
    private static Product[] products = new Product[3];
    private static  Account[] accounts = new Account[3];
    static{
        products[0] =new Product ("小米9",1500,389);
        products[1] =new Product ("小米10",2500,11);
        products[2] =new Product ("小米11",3500,230);

        accounts[0] = new Account("lili",180000);
        accounts[1] = new Account("wowo",17000);
        accounts[2] = new Account("nini",1600);
    }

   @Override

    public Order createOrder(String accountname,String productname ,Integer productnum){
        Order order = new Order();
        // 实现验证商品库存 是否充足，以及账户金额是否足够支付本次购买， 
        Account account = findAccountByname(accountname);
        if (account == null){
            System.out.println("该用户不存在");
            return null;
        }  
        Product product = finProductByname(productname);
        if(product == null){
            System.out.println("无法找到商品");
            return null;

        }
        if(account.getAccountmoney() < product.getPrice()*productnum){
            throw new RuntimeException();
        }
        
        if (productnum > product.getRemain()) {
            System.out.println("库存不足");
            
        }
            order.setProductname(product.getName());
            order.setProductnum(productnum);
            return order;
    }
    private static Account findAccountByname(String accountname){
        if(accountname==null||accountname.length()==0){
            return null;

        }
        for(Account account:accounts){
            if(accountname.equals(account.getAccountname())) {
                return account;
            }

        }
        return null;

    }

    private static Product finProductByname(String productname){
        if(productname==null||productname.length()==0){
            return null;
        }
        for(Product product:products){
            if(productname.equals(product.getName())){
                return product;
            }
        }
        return null;
    }


 
}