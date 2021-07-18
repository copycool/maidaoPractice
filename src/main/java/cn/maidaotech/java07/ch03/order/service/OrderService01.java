package cn.maidaotech.java07.ch03.order.service;

import cn.maidaotech.java07.ch03.order.model.Account;
import cn.maidaotech.java07.ch03.order.model.Order;
import cn.maidaotech.java07.ch03.order.model.Product;

public class OrderService01 implements OrderService {
    private static Product[] products=new Product[3];
    private static Account[] accounts=new Account[3];

    {
        
        products[0]=new Product("玫瑰花",10,1000);
        products[1]=new Product("玉兰花",5,400);
        products[2]=new Product("百合花",3,500);

        accounts[0]=new Account("小小",20000);
        accounts[1]=new Account("笑笑",20000);
        accounts[2]=new Account("西夏",10000);
    }

    @Override
    
    public Order createOrder(String accountName,String productName,Integer amount){
        Account account=findAccountByName(accountName);
        if(account==null){
            System.out.println("账户不存在！");
            return null;
        }
        Product product=findProductByName(productName);
        if(product==null){
            System.out.println("商品不存在！");
            return null;
        }
        if(product.getStock()<amount){
            System.out.println("该商品库存不足，下单失败！");
            return null;
        }
        if(product.getPrice()*amount>account.getBalance()){
            System.out.println("账户余额不足！");
            return null;
        }
        Order order=new Order();
        order.setProduct(product);
        order.setAmount(amount);
        return order;
    }

    private static Account findAccountByName(String name){
        if(name==null||name.length()==0){
                return null;
        }  
        for(Account account:accounts){
            if(name.equals(account.getName())){
                return account;
            }
        }return null ;
    }

    private static Product findProductByName(String name){
        if(name==null||name.length()==0){
                return null;
        }  
        for(Product product:products){
            if(name.equals(product.getName())){
                return product;
            }
        }
           return null;
    }
}
