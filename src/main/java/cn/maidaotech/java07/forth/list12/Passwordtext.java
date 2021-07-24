package cn.maidaotech.java07.forth.list12;

import java.util.HashMap;
import java.util.Map;

public class Passwordtext implements Password {
    private static Map<Integer, Account> map = null;
    {
        map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put(i, new Account(i, "用户" + i, (double) i * 100));
        }
    }
        @Override
        public Account ById(int id) {
            if (id < 0) {
                return null;
            }
            return map.get(id);
        }
    
}
