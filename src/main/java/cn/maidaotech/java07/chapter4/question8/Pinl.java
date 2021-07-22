package cn.maidaotech.java07.chapter4.question8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//读取个数不定的正整数，打印频率最高的，如果有多个一样的最高频率则都输出。
public class Pinl {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println("集合：" + list.toString());
        Map<Integer, Integer> map = new HashMap<>();
        //
        for (Integer i : list) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        System.out.println(entry.getKey() + "出现了" + max + "次");
        

    }
}