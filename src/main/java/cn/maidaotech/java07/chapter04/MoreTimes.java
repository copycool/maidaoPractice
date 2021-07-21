package cn.maidaotech.java07.chapter04;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MoreTimes {
    // 读取个数不定的正整数，打印频率最高的，如果有多个一样的最高频率则都输出
    public static void main(String[] args) {
        int randomSize = new Random().nextInt(10) + 1;
        System.out.println("随机数长度为：" + randomSize);
        Map<Integer, Integer> map = new HashMap<>();
        System.out.print("产生的随机数有：" + "");

        for (int i = 0; i < randomSize; i++) {
            int num = new Random().nextInt(10);
            System.out.println(num + "");
            if (map.get(num) == null) {
                map.put(num, 1);
            } else {
                int value = map.get(num);
                map.put(num, value + 1);
            }
        }

        System.out.println();

        Collection<Integer> v = map.values();
        Object[] v1 = v.toArray();
        int len = v1.length;
        Arrays.sort(v1);
        Object max = v1[len - 1];
        Object k = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (max == entry.getValue()) {
                k = entry.getKey();
                System.out.println(k);
            }
        }
    }

}