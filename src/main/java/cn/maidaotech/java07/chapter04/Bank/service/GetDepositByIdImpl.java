package cn.maidaotech.java07.chapter04.Bank.service;
import cn.maidaotech.java07.chapter04.Bank.pojo.Customer;
import java.util.HashMap;

public class GetDepositByIdImpl {
    public Customer getDeposit(int id, HashMap<Integer,Customer> customers){
        Customer cus = customers.get(id);
        return cus;
    }

}