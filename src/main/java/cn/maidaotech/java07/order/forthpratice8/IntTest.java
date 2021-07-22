package cn.maidaotech.java07.order.forthpratice8;
//读取个数不定的正整数，打印频率最高的，如果有多个一样的最高频率则都输出。

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import org.springframework.util.SystemPropertyUtils;

public class IntTest {
    public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    ArrayList<Integer>list1=new ArrayList<>();
    while (true) {
        System.out.println("输入");
         int b = a.nextInt();
    if(b!=0){
     list1.add(b);
    }else{
        System.out.println("结束");
        break;
    }
}
Map<Integer, Integer> map = new HashMap<>();
for (Integer i : list1) {
    if (map.containsKey(i)) {
        map.put(i, map.get(i) + 1);
    } else {
        map.put(i, 1);
    }
}

// Set<Entry<Integer, Integer>> entry =   map.entrySet();



Integer max = Collections.max(map.values());
        map.entrySet().forEach(entry -> {
            if (entry.getValue().equals(max)) {
                System.out.println(entry.getKey() + "出现了" + max + "次");
            }
        });
}
}

