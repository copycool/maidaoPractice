package cn.maidaotech.java07.work.testposition3.order.data;

/**
 * 构建出商品信息
 */

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import cn.maidaotech.java07.work.testposition3.order.model.*;
/**
 * 用来生成测试数据，满足测试需求
 */
public class TestData {
    
    private static  List<Product> list  = new ArrayList<>();   //存放商品信息

    private static List<Order> orderList = new ArrayList<>();  //存放订单信息

    private static List<Account> accountList = new ArrayList<>();  //存放账户信息

    static{
        //生成商品信息
        Product product = null;
        for (int i = 0; i < 20; i++) {
            product = new Product();
            product.setId(i+1);
            product.setCategoryId(new Random().nextInt(10)+1);
            product.setName("product--"+(i+1));
            product.setMainImage("https://gimg2.baidu.com/image_search/"+new Random().nextInt(100)+1);
            product.setPrice(BigDecimal.valueOf(new Random().nextInt(9999)+1));
            product.setStock(new Random().nextInt(100)+1);
            product.setStatus(1);
            product.setCreateTime(new Date());
            product.setUpdateTime(new Date());
            list.add(product);
        }
        //生成账户信息
        creactAccountInfo();
    }

    //获取账户信息
    public static Account getAccountById(Integer accountId){
        return accountList.get(accountId-1);
    }

    //判断账户信息是否存在
    public static boolean checkAccountIsExist(Integer accountId){
        if (accountId != 1 && accountId !=2) {
            return false;
        }
        return true;
    }


    //返回支付金额
    public static BigDecimal backPayMent(Integer productId,Integer quantity){
         //获取该商品信息
        Product product = getProductById(productId);
        return BigDecimal.valueOf(quantity).multiply(product.getPrice());
    }

    //判断账户余额是否够本次购买
    public static boolean checkAccountIsEnough(Integer accountId,Integer productId,Integer quantity){
        //获取该商品信息
        Product product = getProductById(productId);
        //获取该账户信息
        Account account = getAccountById(accountId);
        //获取总钱数
        BigDecimal totalMoney = BigDecimal.valueOf(quantity).multiply(product.getPrice());
        //判断账户余额是否充足
        if (account.getBalance().compareTo(totalMoney) == -1) {
            return false;
        }
        return true;
    }

    //添加订单
    public static boolean insertOrder(Order order){
        orderList.add(order);
        return true;
    }

    //获取全部订单信息
    public static List<Order> getOrderList(){
        return orderList;
    }

    //根据订单号获取订单信息
    public static Order getOrderByOrderNo(Long orderNo){
        Order order = null;
        for (Order orderObj : orderList) {
            if (orderObj.getOrderNo().equals(orderNo)) {
                order = orderObj;
                break;
            }            
        }
        return order;
    }


    public static void main(String[] args) {
        List<Product> list2  = list;
        for (Product product : list2) {
            System.out.println(product.toString());
        }
        //System.out.println(getProductById(2).toString());
    }


    //添加商品
    public static boolean insertProduct(Product product){
        list.add(product);
        return true;
    }

    //获取全部商品信息
    public static List<Product> getProductList(){
        return list;
    }

    //根据指定id获取商品
    public static Product getProductById(Integer productId){
        if (list.size()<productId) {
            throw new RuntimeException("商品不存在");
        }
        return list.get(productId-1);
    }

    //判断商品是否存在
    public static boolean checkProductIsExist(Integer id){
        if (id>list.size()) {
            return false;
        }
        return true;
    }

    //判断商品库存是否充足
    public static boolean checkStockIsEnough(Integer productId,Integer quantity){
        //获取该商品
        Product product = list.get(productId);
        //判断库存是否充足
        if (product.getStock() < quantity) {
            return false;
        }
        return true;
    }

    //Date转格式化
    public static String timeFormat(Date date){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }

    public static void creactAccountInfo(){
          //生成账户信息
          Account account = new Account();
          account.setAccountId(1);
          account.setUsername("张三");
          account.setPhone("18438128038");
          account.setEmail("1828155655@qq.com");
          account.setBalance(BigDecimal.valueOf(1000000));
          account.setAddress("河南省周口市太康县");
          Account account2 = new Account();
          account.setAccountId(2);
          account.setUsername("李四");
          account.setPhone("13253776298");
          account.setEmail("1615702594@qq.com");
          account.setBalance(BigDecimal.valueOf(100000));
          account.setAddress("河南省周口市常营镇");
          accountList.add(account);
          accountList.add(account2);
    }
}