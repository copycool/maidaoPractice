package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HighFrequency {
    // 读取个数不定的正整数，打印频率最高的，如果有多个一样的最高频率则都输出。
    // 利用hashmap键值对属性，键不能重复，值可以重复
    // 把重复元素的个数当做值，把重复元素当做键
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = { 1, 1, 1, 2, 3, 3, 5, 6, 5, 6, 6, 6 };

        // 把重复元素的个数当做值，把重复元素当做键
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == null) {
                map.put(arr[i], 1);
            } else {
                int value = map.get(arr[i]);
                map.put(arr[i], value + 1);
            }
        }

        int maxTimes = 0;
        int key = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("key:" + entry.getKey() + "value:" + entry.getValue());
        }

        for (Integer k : map.keySet()) {
            for (Integer value : map.values()) {
                if (maxTimes < value) {
                    maxTimes=value;
                   
                }
                System.out.println(k);
                k++;
            }

        }
    }
}
