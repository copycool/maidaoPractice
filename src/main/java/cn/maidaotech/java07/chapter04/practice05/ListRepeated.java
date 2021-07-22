package cn.maidaotech.java07.chapter04.practice05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ListRepeated {
    public static void main(String[] args) {
        {// 方法一
            List<String> list = new ArrayList<>();
            list.addAll(Arrays.asList("b", "a", "a", "c", "b"));
            System.out.println("去重前：" + list.toString());
            List<String> result = new ArrayList<>();
            for (String s : list) {
                if (!result.contains(s)) {
                    result.add(s);
                }
            }
            System.out.println("去重后：" + result.toString());
        }
        {// 方法二
            List<String> list = new ArrayList<>();
            list.addAll(Arrays.asList("b", "a", "a", "c", "b"));
            System.out.println("去重前：" + list.toString());
            list = list.stream().distinct().collect(Collectors.toList());
            System.out.println("去重后：" + list.toString());
        }
        {// 方法三
            List<String> list = new ArrayList<>();
            list.addAll(Arrays.asList("b", "a", "a", "c", "b"));
            System.out.println("去重前：" + list.toString());
            LinkedHashSet<String> lhs = new LinkedHashSet<>(list);
            list.clear();
            list.addAll(lhs);
            System.out.println("去重后：" + list.toString());
        }
    }
}