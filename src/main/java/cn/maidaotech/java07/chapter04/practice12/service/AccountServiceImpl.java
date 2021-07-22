package cn.maidaotech.java07.chapter04.practice12.service;

import java.util.HashMap;
import java.util.Map;

import cn.maidaotech.java07.chapter04.practice12.model.Account;


public class AccountServiceImpl implements AccountService {
    private static Map<Integer, Account> map = null;
    {
        map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put(i, new Account(i, "用户" + i, (double) i * 100));
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