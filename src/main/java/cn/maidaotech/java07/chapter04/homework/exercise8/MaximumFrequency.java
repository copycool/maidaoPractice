package cn.maidaotech.java07.chapter04.homework.exercise8;

import java.util.Arrays;
import java.util.Collection;
// import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MaximumFrequency {
    // 读取个数不定的正整数，打印频率最高的，如果有多个一样的最高频率则都输出
    public static void main(String[] args) {

        int randomSize = new Random().nextInt(10) + 1;
        System.out.println("产生的随机数组长度" + randomSize);
        Map<Integer, Integer> map = new HashMap<>();
        System.out.print("产生的随机整数" + " ");
        for (int i = 0; i < randomSize; i++) {
            int number = new Random().nextInt(10);
            System.out.print(number + " ");
            if (map.get(number) == null) {
                map.put(number, 1);
            } else {
                int value = map.get(number);
                map.put(number, value + 1);
            }
        }
        System.out.println();
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            System.out.println("产生的随机整数" + mapEntry.getKey() + " 随机整数出现的次数" + mapEntry.getValue());
        }

        Collection<Integer> values = map.values();
    
    
    
        Integer[] arrayValues = new Integer[values.size()];
        arrayValues = values.toArray(arrayValues);
        Arrays.sort(arrayValues);
        Integer max = arrayValues[arrayValues.length - 1];
        System.out.print("重复出现最多的数字" + " ");
        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            if (max == item.getValue()) {
                System.out.print(item.getKey() + " ");
            }
        }

    }

}
