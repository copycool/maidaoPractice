package cn.maidaotech.java07.chapter3.question9.order.service;

/*
 * service包中创建OrderService接口及其实现类 编写创建订单的方法createOrder
 * 所购买的商品及数量作为参数，实现验证商品库存是否充足，以及账户金额是否足够支付本次购买 满足这两个条件时createOrder方法返回Order信息
 */
// public class OrderService implements OrderServiceInterface{

/*
 * @Override public Order creatOrder(Account account, Order order) { Product
 * product = findIdByName(order.getGoodsPurchased()); if (product == null) {
 * System.out.println(order.getGoodsPurchased() + "不在库存中"); return null; }
 * return null; Order isorder = checkOrder(order.getGoodsPurchased(),
 * order.getGoodsPurchased(), product, account); if (isorder == null) {
 * System.out.println("库存不足或金额不够"); return null; } return isorder;
 * 
 * }
 * 
 * private Order checkOrder(String goodsPurchased, String goodsPurchased2,
 * Product product, Account account) { if (productNumber >
 * product.getInventoryNumber()) { return null; } if (product.getPrice() *
 * productNumber > account.getBalance()) { return null; } Order order = new
 * Order(productName, productNumber); return order;
 * 
 * return null; }
 * 
 * private Product findIdByName(Object productName) { return null; }
 */
