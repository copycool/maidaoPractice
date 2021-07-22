package cn.maidaotech.java07.chapter04.StorageBank;

import java.util.HashMap;

public class BankTest {
    public static void main(String[] args) {

        Bank user1 = new Bank("0010","xiaowang",2000);
        Bank user2 = new Bank("0011","xiaohong",2000);
        Bank user3 = new Bank("0012","xiaoliang",2000);
        Bank user4 = new Bank("0013","xiaozhang",2000);
        Bank user5 = new Bank("0014","xiaoyu",2000);

        HashMap<Integer,Bank> map = new HashMap<>();
        map.put(1, user1);
        map.put(2, user2);
        map.put(3, user3);
        map.put(4, user4);
        map.put(5, user5);

        System.out.println(map);
    }

    
    
}