package cn.maidaotech.java07.set_practice.account;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的账户Id");
        try {

            System.out.println("您的余额为：" + selectMoney(input.nextInt()) + "元");
        } catch (Exception e) {
            e.printStackTrace();
        }
        input.close();
    }

    public static Double selectMoney(Integer accountId) throws Exception {
        Map<Integer, Account> map = new HashMap<>();
        Account account1 = new Account(1910001, "张三", 1025.35);
        Account account2 = new Account(1910002, "李四", 128.53);
        map.put(1910001, account1);
        map.put(1910002, account2);

        if (!map.containsKey(accountId)) {
            throw new Exception("查询失败，请输入正确的账户Id");
        }

        return map.get(accountId).getRemainMoney();
    }
}