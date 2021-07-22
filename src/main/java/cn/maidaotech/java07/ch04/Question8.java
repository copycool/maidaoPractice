package cn.maidaotech.java07.ch04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Question8 {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(30);
        for(int i=0;i<30;i++){
            list.add((int)(Math.random()*10));
        }
        System.out.println("产生的随机数有："+list.toString());
         Map<Integer,Integer> map=new HashMap<>();

        list.forEach(i -> map.merge(i, 1, Integer::sum));
            Integer max = Collections.max(map.values());
                map.entrySet().forEach(entry -> {
                    if (entry.getValue().equals(max)) {
                       System.out.println(entry.getKey() + "出现了" + max + "次");
           
             } 
        });
        
    }
}




