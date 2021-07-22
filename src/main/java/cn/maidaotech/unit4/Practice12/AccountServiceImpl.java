package cn.maidaotech.java07.unit4.Practice12;

import java.util.HashMap;
import java.util.Map;

public class AccountServiceImpl implements AccountService {
    public static void main(String[] args) {
        
    }
    private static Map<Integer, Account> map = null;
    {
        map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put(i, new Account(i, "用户" + i, (double) i * 100));
        }System.out.println(map);
    }

    @Override
    public Account findById(Integer id) {
        if(id==null||id<0){
            return null;
        }else{
            return map.get(id);
        }
       
    }
    
}