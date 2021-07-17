package cn.maidaotech.java07.chaptet03.order.model;
// 创建一个 order 包，其下创建 model 包、service 包和 action 包。
// 在 model 包中包含 Product 类、 Order 类和 Account 类，其中 Product 类至少有名称、价格和库存数量等属性，
// Order 类包含购买 的什么商品和数量属性，Account类包含账户名称、剩余金额等属性。
// service包中创建OrderService 类，类中编写创建订单的方法 createOrder，所购买的商品及数量作为参数，
// 实现验证商品库存 是否充足，以及账户金额是否足够支付本次购买，
// 满足这两个条件时 createOrder 方法返回 Order 信息。
// 在 action 包中创建 OrderAction 类，编写 mian 方法调用创建订单的方法，打印输出订单 信息。
public class Product {
    private String name;
    private Integer price;
    private Integer remain;
    public Product(){

    }
    public Product(String name,Integer price,Integer remain){
        this.name = name;
        this.price = price;
        this.remain = remain;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRemain() {
        return remain;
    }

    public void setRemain(Integer remain) {
        this.remain = remain;
    }
    

}