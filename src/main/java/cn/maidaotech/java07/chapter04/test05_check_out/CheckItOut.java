package cn.maidaotech.java07.chapter04.test05_check_out;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//编写函数，去除List集合中的重复元素，不要改变元素的顺序。
public class CheckItOut {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(10));
        }
        for (Integer integer : list1) {
            System.out.print(integer + " ");
        }
        System.out.println();
        checkOut(list1);
        System.out.println(list1);

        //方法2.0
        // List<Integer> list2 = list1.stream().distinct().collect(Collectors.toList());
        // System.out.println(list2);

        //方法3.0
        // LinkedHashSet<Integer> lhs = new LinkedHashSet<>(list1);
        // lhs.clear();
        // lhs.addAll(lhs);
    }

    private static void checkOut(List<Integer> l) {
        List<Integer> list1 = new ArrayList<>();
        for (Integer i : l) {
            if (!list1.contains(i)) {
                list1.add(i);
            }
        }
        l.clear();
        l.addAll(list1);
    }
}
