package cn.maidaotech.chapter04.practice08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
读取个数不定的正整数，打印频率最高的，如果有多个一样的最高频率则都输出。
*/
public class IntegerTest {
     public static void main(String[] args) {
         List<Integer> list = new ArrayList<>(30);
         for (int i = 0; i < 30; i++) {
             list.add((int)(Math.random()*10));
         }
         System.out.println("随机集合是： "+list.toString());
         Map<Integer,Integer> map = new HashMap<>();
         list.forEach(i -> map.merge(i, 1, Integer::sum));
         Integer max = Collections.max(map.values());
         map.entrySet().forEach(entry ->{
             if(entry.getValue().equals(max)){
                 System.out.println(entry.getKey()+"出现了"+max+"次");
             }
         }
         );

     }
}