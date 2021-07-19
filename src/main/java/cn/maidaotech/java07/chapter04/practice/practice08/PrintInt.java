package cn.maidaotech.java07.chapter04.practice.practice08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PrintInt {
    public static Integer printInt(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        list.stream().forEach(o -> {
            Integer value = map.get(o);
            if (value == null)
                map.put(o, 1);
            else
                map.put(o, ++value);
        });
        int max = 0;
        Integer result = 0;
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(15);
        list.add(15);
        list.add(15);
        list.add(15);
        list.add(2);
        System.out.println(printInt(list));
    }
}