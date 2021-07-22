package cn.maidaotech.java07.unit4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RateCount {
    //读取个数不定的正整数，打印频率最高的，如果有多个一样的最高频率则都输出。
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(30);
        for (int i = 0; i < 30; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println("集合：" + list.toString());
        Map<Integer,Integer> map=new HashMap<>();
        for(Integer i:list){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        Integer max = Collections.max(map.values());
        map.entrySet().forEach(entry->{
            if(entry.getValue().equals(max)){
                System.out.println(entry.getKey()+"出现了"+max+"次");
            }

        });
    
    }
}