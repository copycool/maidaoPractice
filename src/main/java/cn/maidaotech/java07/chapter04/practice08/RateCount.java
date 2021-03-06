package cn.maidaotech.java07.chapter04.practice08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RateCount {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(30);
        for (int i = 0; i < 30; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println("集合：" + list.toString());
        Map<Integer, Integer> map = new HashMap<>();
        /** 常规方法
        for (Integer i : list) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        */
        /** 骚操作merge
        for (Integer i : list) {
            map.merge(i, 1, Integer::sum);
        }
         */
        // 再骚一点
        list.forEach(i -> map.merge(i, 1, Integer::sum));
        Integer max = Collections.max(map.values());
        map.entrySet().forEach(entry -> {
            if (entry.getValue().equals(max)) {
                System.out.println(entry.getKey() + "出现了" + max + "次");
            }
        });
    }
}