package cn.maidaotech.java07.chapter03.practice.order.exception;

public class OrderException extends ServiceException {

    public OrderException(String message) {
        super("支付失败： " + message);
        // TODO Auto-generated constructor stub
    }

}