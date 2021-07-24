package cn.maidaotech.java07.forth.list08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//读取个数不定的正整数，打印频率最高的，如果有多个一样的最高频率则都输出。
public class List08 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(30);
        for(int i=0;i<30;i++){
            list.add((int)(Math.random()*10));
        }
            System.out.println(list.toString());

            Map<Integer,Integer> map=new HashMap<>();
            for(Integer m :list){
                if(map.containsKey(m)){
                    map.put(m,map.get(m)+1 );
                }else{
                    map.put(m, 1);
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
