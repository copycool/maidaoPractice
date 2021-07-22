package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class QuesTion8 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();

        while (list.size() < new Random().nextInt(30)+1){
            list.add(new Random().nextInt(10)+1);
        }

        System.out.println("初始化的集合为："+list);
    }
    /**
     * 统计出现频率最高的数，并打印
     * @param list
     */
    public static void printMaxFrequency1(List<Integer> list){
        //利用 groupingBy 进行多字段分组    把相同的数分成一组，在统计出现次数，放入map集合中
        Map<Integer, Long> map = list.stream()
                                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("集合统计表为：" );
        map.forEach((k, v)->{
            System.out.println("k= "+k+", v= "+v);
        });
        //找到最大的次数
        Integer max = Integer.parseInt(Collections.max(map.values()).toString());
        System.out.println("出现最大的次数："+max);
        for (Map.Entry<Integer,Long> entry:map.entrySet()) {
            Integer value = Integer.parseInt(entry.getValue().toString());
            if (value == max){
                System.out.println("出现频率最大的数为："+entry.getKey());
            }
        }
    }
}
