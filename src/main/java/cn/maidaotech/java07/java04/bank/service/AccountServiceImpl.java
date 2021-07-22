package cn.maidaotech.java07.java04.bank.service;

import java.util.HashMap;
import java.util.Map;

import cn.maidaotech.java07.java04.bank.model.Account;

public class AccountServiceImpl implements AccountService {

    private static Map<Integer, Account> map = null;
    {
        map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put(i, new Account(i, "用户" + i, i * 100));
        }
    }

    @Override
    public Account findById(Integer id) {
        if (id == null || id < 0) {
            return null;
        }
        return map.get(id);
    }

}