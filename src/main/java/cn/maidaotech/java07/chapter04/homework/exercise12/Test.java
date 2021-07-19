package cn.maidaotech.java07.chapter04.homework.exercise12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    // 编写一个程序，创建一个HashMap对象，
    // 用于存储银行储户的信息（其中储户的主要信息有储户的ID、姓名和余额）。
    // 另外，根据储户ID获取其余额信息。
    public static void main(String[] args) {

        Map<Integer, BankStorage> map = new HashMap<>();
        map.put(1, new BankStorage(1, "陈佳楠", 1000));
        map.put(2, new BankStorage(2, "陈佳楠2", 100.15));
        map.put(3, new BankStorage(3, "陈佳楠3", 1500));
        map.put(4, new BankStorage(4, "陈佳楠4", 15700));
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(map.get(key).getBalance());

        }

    }
}
