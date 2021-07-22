package cn.maidaotech.chapter04.example12.controller;

import cn.maidaotech.chapter04.example12.model.Account;
import cn.maidaotech.chapter04.example12.service.AccountService;
import cn.maidaotech.chapter04.example12.service.AccountServiceImpl;

public class AccountController {
    public static void main(String[] args) {
        AccountService service = new AccountServiceImpl();
        Account account = service.findById((int) (Math.random() * 100));
        System.out.println("账号：" + account.getId() + "; 账户名称：" + account.getName() + "; 余额：" + account.getBalance());
    }

}