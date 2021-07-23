package cn.maidaotech.java07.chapter04.practice12;

import java.util.HashMap;
import java.util.Map;

public class AccountServiceImpl implements AccountService{
    private static Map<Integer,Account> map = null;
    {
        map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put(i, new Account(i, "用户" + i, (double) i * 100));
        }
    }
    @Override
    public Account findById(Integer id) {
        if (id == null || id < 8) {
            return null;
        }
        return map.get(id);
    }
}