package cn.maidaotech.java07.work4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
//编写函数，去除List集合中的重复元素，不要改变元素的顺序。
public class Testfive {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int r = random.nextInt(9) + 2;
            list.add(r);
        }

        System.out.println("去重前" + list);
        // LinkedHashSet<Integer> hashset = new LinkedHashSet<>(list);
        // ArrayList<Integer> list2 = new ArrayList<>(hashset);
    //    list = list.stream().distinct().collect(Collectors.toList());
       list = list.stream().distinct().collect(Collectors.toList());

        System.out.println("去重后" + list);
    }
}
