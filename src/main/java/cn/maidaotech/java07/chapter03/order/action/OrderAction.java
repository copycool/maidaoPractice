package cn.maidaotech.java07.chapter03.order.action;

import cn.maidaotech.java07.chapter03.order.model.Account;
import cn.maidaotech.java07.chapter03.order.model.Order;
import cn.maidaotech.java07.chapter03.order.model.Product;
import cn.maidaotech.java07.chapter03.order.service.OrderServiceImpl;

// 创建一个 order 包，
// 其下创建 model 包、service 包和 action 包。
// 在 model 包中包含 Product 类、 Order 类和 Account 类，
// 其中 Product 类至少有名称、价格和库存数量等属性，
// Order 类包含购买 的什么商品和数量属性，
// Account类包含账户名称、剩余金额等属性。
// service包中创建OrderService 类，
//     类中编写创建订单的方法 createOrder，所购买的商品及数量作为参数，
//     实现验证商品库存 是否充足，以及账户金额是否足够支付本次购买，
//     满足这两个条件时 createOrder 方法返回 Order 信息。
// 在 action 包中创建 OrderAction 类，
//     编写 mian 方法调用创建订单的方法，打印输出订单 信息。
public class OrderAction {
    public static void main(String[] args) {
        Account account = new Account("小明",99999.0);
        Product product = new Product("Mac pro",100.0,9);
        OrderServiceImpl osi = new OrderServiceImpl();
        String res = osi.createOrder(product, 3, account);
        String[] ordermsg = res.split(",");
        if(ordermsg.length<=2){
            System.out.println(res);
        }else{
            System.out.println(ordermsg[0]+"\t恭喜您购买成功了"+ordermsg[1]+"个"+ordermsg[2]);
        }
    }
    
}