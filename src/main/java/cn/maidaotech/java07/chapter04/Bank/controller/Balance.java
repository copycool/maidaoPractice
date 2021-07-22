package cn.maidaotech.java07.chapter04.Bank.controller;
import cn.maidaotech.java07.chapter04.Bank.pojo.Customer;
import cn.maidaotech.java07.chapter04.Bank.service.GetDepositByIdImpl;
import java.util.HashMap;

public class Balance {
    public static void main(String[] args) {
        Customer customer1 = new Customer(123,"刘梦梦",99999);
        Customer customer2 = new Customer(456,"崔灿灿",88888);
        Customer customer3 = new Customer(789,"王雪利",66666);
        HashMap<Integer,Customer> customers = new HashMap<>();
        customers.put(customer1.getId(), customer1);
        customers.put(customer2.getId(), customer2);
        customers.put(customer3.getId(), customer3);
        GetDepositByIdImpl gdb = new GetDepositByIdImpl();
        Customer customer = gdb.getDeposit(456, customers);
        
        System.out.println(customer);
    }
}