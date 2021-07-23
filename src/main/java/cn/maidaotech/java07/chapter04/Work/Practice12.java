package cn.maidaotech.java07.chapter04.Work;

import java.util.HashMap;
import java.util.Map;

import cn.maidaotech.java07.chapter03.order.model.Account;

public class Practice12 {
    public static void main(String[] args) {
        Account  account = new Account("小明", 100.0, 1);
        Map<Integer,Account> map = new HashMap<>();
        map.put(1, account);
        System.out.println( findById(1, map)); 
    }
    public static Account findById(Integer i,Map<Integer,Account> map){
        if (i==null||i<0) {
            return null;
        }
        return map.get(i);
    }
}
