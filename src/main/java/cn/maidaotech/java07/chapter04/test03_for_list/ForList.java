package cn.maidaotech.java07.chapter04.test03_for_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//创建一个集合存入20个5以内的整数，遍历集合，删除所有指定数字的元素。
public class ForList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list1.add(random.nextInt(5));
        }
        for (Integer integer : list1) {
            System.out.print(integer + " ");
        }
        System.out.println();
        // Collections.addAll(list1, 1, 2, 1, 2, 1, 3, 5, 4, 2, 3, 5, 1, 3, 5, 4, 2, 3);
        // 1.0
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != 1) {
                list2.add(list1.get(i));
            }
        }
        System.out.println(list2);
        // 2.0
        // List<Integer> list3 = list1.stream().filter(i ->i!=
        // 1).collect(Collectors.toList());
        // for (Integer i : list3) {
        // System.out.print(i+"");
        // }

        // 3.0
        // Iterator<Integer> iterator = list1.iterator();
        // while(iterator.hasNext()){
        // Integer i = iterator.next();
        // if(i == 1){
        // iterator.remove();
        // }
        // }
        // System.out.println(list1);
    }
}