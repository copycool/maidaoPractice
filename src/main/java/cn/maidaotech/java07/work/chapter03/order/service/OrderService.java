package cn.maidaotech.java07.work.chapter03.order.service;
import java.util.Date;
import java.util.Random;
import cn.maidaotech.java07.work.chapter03.order.data.TestData;
import cn.maidaotech.java07.work.chapter03.order.model.Order;
/**
 * 生成订单
 */
public class OrderService implements OrderServiceInterface{
    

    /**
     * 所购买的商品及数量作为参数，实现验证商品库存是否充足，
     * 以及账户金额是否足够支付本次购买，
     * 满足这两个条件时 createOrder 方法返回 Order信息。
     * @param id
     * @param quantity
     * @return
     */
    public Order createOrder(Integer accountId, Integer productId,Integer quantity){
        
        if (quantity <= 0) {
            throw new RuntimeException("购买数量有误，请重新输入");
        }

        //判断商品是否存在
        if (!TestData.checkProductIsExist(productId)) {
            throw new RuntimeException("该商品不存在，商品id为："+productId);
        }

        //判断库存是否充足
        if (!TestData.checkStockIsEnough(productId, quantity)) {
            throw new RuntimeException("该商品库存不足");
        }

        //判断账户信息是否存在
        if (!TestData.checkAccountIsExist(accountId)) {
            throw new RuntimeException("该账户不存在，账户id为："+accountId);
        }
    
        //判断账户金额是否足够支付本次购买
        if (!TestData.checkAccountIsEnough(accountId, productId, quantity)) {
            throw new RuntimeException("该账户余额不足，请充值");
        }

        Order order = new Order();
        order.setCreateTime(new Date());
        order.setId(System.currentTimeMillis());
        order.setOrderNo(System.currentTimeMillis()+new Random().nextInt(1000)+1);
        order.setAccountId(accountId);
        order.setProductId(productId);
        order.setPayment(TestData.backPayMent(productId, quantity));
        order.setStatus(1);
        order.setPaymentTime(new Date());
        order.setCloseTime(new Date());
        System.out.println("创建订单信息为：");
        return order;
    }
    
}