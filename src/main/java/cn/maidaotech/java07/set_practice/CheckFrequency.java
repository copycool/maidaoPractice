package cn.maidaotech.java07.set_practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.maidaotech.java07.util.ListUtils;

public class CheckFrequency {
    public static void main(String[] args) {
        List<Integer> list = ListUtils.randumNum(20, 20);
        Map<Integer, Integer> map = checkFrequency(list);
        map.forEach((k, v) -> System.out.println(k + "\t出现次数为:\t" + v));
    }

    public static Map<Integer, Integer> checkFrequency(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        // map.put(0, 0);
        for (Integer integer : list) {
            if (map.containsKey(integer)) {
                map.replace(integer, map.get(integer), map.get(integer) + 1);
            } else {
                map.put(integer, 1);
            }
        }
        return map;
    }
}