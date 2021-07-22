package cn.maidaotech.java07.work4;

import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class PrintPositiveinteger {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        while (list1.size() != 30) {
            list1.add((int) (Math.random() * 7));
        }
        System.out.println(list1);
        System.out.println("正整数个数： " + list1.size());

        // for (int i = 0; i < list1.size(); i++) {
        // int x = 1;
        // for (int j = 0; j < i; j++) {
        // if (i != j && list1.get(i) == list1.get(j)) {
        // x = x + 1;
        // }
        // map.put(list1.get(i), x);
        // }
        // }
        // for (Integer i : list1) {
        //     map.merge(i, 1, Integer::sum);
        // }
        list1.forEach(i -> map.merge(i, 1, Integer::sum));
        System.out.println(map);
        // map.merge()
        System.out.println();
        Integer max = Collections.max(map.values());
        map.entrySet().forEach(entry -> {
            if (entry.getValue().equals(max)) {
                System.out.println(entry.getKey() + "出现了" + max);
            }
        });
        // 判断values的最大值和对应的key值
        // Collection<Integer> v = map.values();
        // Object[] vl = v.toArray();
        // int len = vl.length;
        // Arrays.sort(vl);
        // Object max = vl[len - 1];// 取最大值
        // Object k = null;
        // for (Map.Entry entry : map.entrySet()) {
        // if (max == entry.getValue()) {
        // k = entry.getKey();
        // System.out.println("出现频率最高的数字是：" + k + " ,出现了" + max + "次");
        // }

    }

}
