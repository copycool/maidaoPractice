package cn.maidaotech.java07.work.chapter04;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Question04 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);

        //交集
        List<Integer> listIntersection  = list1.stream()
                                  .filter(item->list2.contains(item))
                                  .collect(Collectors.toList());
        System.out.println("交集："+listIntersection);

        //差集  list1 -list2
        List<Integer> reduce1 = list1.stream()
                                     .filter(item->!list2.contains(item))
                                     .collect(Collectors.toList());
        System.out.println("差集(list1-list2)："+reduce1);

        //差集 list2 - list1
        List<Integer> reduce2 = list2.stream()
                                     .filter(item->!list1.contains(item))
                                     .collect(Collectors.toList());
        System.out.println("差集(list2-list1)："+reduce2);

        //并集
        List<Integer> list3 =list1.stream().collect(Collectors.toList());
        List<Integer> list4 =list2.stream().collect(Collectors.toList());
        list3.addAll(list4);
        System.out.println("并集："+list3);

        //去重并集
        Set<Integer> set = list3.stream().collect(Collectors.toSet());
        System.out.println("去重并集："+set);

        //打印最初的list1
        System.out.println("最初的list1:"+list1);
        //打印最初的list2
        System.out.println("最初的list2:"+list2);
    }
}