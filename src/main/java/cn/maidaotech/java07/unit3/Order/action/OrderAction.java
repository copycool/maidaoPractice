package cn.maidaotech.java07.unit3.Order.action;

import cn.maidaotech.java07.unit3.Order.model.Account;
import cn.maidaotech.java07.unit3.Order.model.Order;
import cn.maidaotech.java07.unit3.Order.model.Prodect;
import cn.maidaotech.java07.unit3.Order.service.ReallyOrder;

public class OrderAction {
  public static void main(String[] args) {
    Account hong = new Account("小红", 16000.0);
    Prodect computer = new Prodect("电脑", 3000.0, 10.0);
    Order order = new Order("电脑", 5.0);
    ReallyOrder order1 = new ReallyOrder();
    System.out.println(order1.creatOder(computer, order, hong));
  }
}
