package cn.maidaotech.java07.chapter04.Work;


import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import java.util.Map.Entry;

public class Practice08 {
    private static List<Integer> init(){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Random().nextInt(10)+1);
        }
        return list;
    }
    private static void count(List<Integer> list){
        Map<Integer,Integer> map = new HashMap<>();
        //方法一
        // for (Integer integer : list) {
        //     if (map.containsKey(integer)) {
        //         map.put(integer,map.get(integer)+1 );
        //     }else{
        //         map.put(integer, 1);
        //     }
        // }
        // 方法二merge
        // for (Integer integer : list) {
        //     map.merge(integer, 1, Integer::sum);
        // }
        //方法三
        list.forEach(i->map.merge(i, 1, Integer::sum));
        Integer max= Collections.max(map.values());
        //Lambda表达式
            // map.entrySet().forEach(entry->{
            //     if (entry.getValue().equals(max)) {
            //         System.out.println("频率最高的是："+entry.getKey()+"出现了"+max+"次 ");
            //     }
            // });
        //正常思路
        
       for (Entry entry: map.entrySet()) {
           if (entry.getValue().equals(max)) {
                System.out.println("频率最高的是："+entry.getKey()+"出现了"+max+"次 ");
           }
       }
        
    }
    public static void main(String[] args) {
       List<Integer> list= init();
       System.out.println(list);
        count(list);
    }
}
