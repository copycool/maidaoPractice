package cn.maidaotech.java07.java04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Output {
    public static void main(String[] args) {
        List<Integer> output = new ArrayList(30);
        for (int i = 0; i < 30; i++) {
            Integer a = (int) (Math.random() * 10);
            output.add(a);
        }
        System.out.println(output);
        Map<Integer,Integer> map=new HashMap<>();
        for (Integer i : output) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        
        }
        Integer max = Collections.max(map.values());
        map.entrySet().forEach(entry -> {
            if (entry.getValue().equals(max)) {
                System.out.println(entry.getKey() + "出现了" + max + "次");
            }
        });

    }
}
