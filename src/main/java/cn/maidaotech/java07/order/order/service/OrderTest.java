package cn.maidaotech.java07.order.order.service;



public class OrderTest {
    public static void main(String[] args) {
     OrderService one = new OrderService();
     System.out.println(one.createOrder("可乐", 15, 23, 2.5,3));
     
}
}
