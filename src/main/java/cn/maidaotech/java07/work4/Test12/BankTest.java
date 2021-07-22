package cn.maidaotech.java07.work4.Test12;

import java.util.HashMap;

public class BankTest {
    public static void main(String[] args) {
        HashMap<Integer, Bank> b = new HashMap<>();

        Bank b1 = new Bank(123, "张三", 500);
        b.put(b1.getUserid(), b1);
        Bank bank = b.get(123);
        System.out.println(b);
    }
}
