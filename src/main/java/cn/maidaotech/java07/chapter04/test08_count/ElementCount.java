package cn.maidaotech.java07.chapter04.test08_count;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class ElementCount {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(10) + 1);
        }
        System.out.println(list1);
        method(list1);

    }

    private static void method(List<Integer> l) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer k : l) {
            Integer count = map.get(k);
            if (count == null) {
                map.put(k, 1);
            } else {
                map.put(k, count + 1);
            }
        }
        // map.merge 将元素放入map集合
        // for (Integer integer : l) {
        // map.merge(integer, 1, Integer::sum);
        // }

        // l.forEach(i->{map.merge(i, 1, Integer::sum)});

        // 简写 求最大值 max = Collections.max(map.values());
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        int max = -1;
        for (Map.Entry<Integer, Integer> entry : set) {
            System.out.println(entry);
            max = entry.getValue() > max ? entry.getValue() : max;
        }
        // map.entrySet().forEach(entry->{if (entry.getValue() == max) {
        // System.out.println(("出现频率最高的是：" + entry.getKey() + "\n" + "次数是：" +
        // entry.getValue()));
        // }});
        for (Map.Entry<Integer, Integer> entry : set) {
            if (entry.getValue() == max) {
                System.out.println(("出现频率最高的是：" + entry.getKey() + "\n" + "次数是：" + entry.getValue()));
            }
        }
    }
}