package cn.maidaotech.java07.chapter04.Work;

import java.util.ArrayList;

import java.util.LinkedHashSet;
import java.util.List;

import java.util.Random;

import java.util.stream.Collectors;

public class Practice05 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            list.add(new Random().nextInt(20) + 1);
        }
        System.out.println(list);
        // 方法三：LinkedHashSet
        LinkedHashSet<Integer> setList = new LinkedHashSet<>(list);
        List<Integer> list2 = new ArrayList<>(setList);
        System.out.println("去重之后：" + list2);
        duplicatRemoval(list);
        removeRepeter(list);
    }

    // 方法二：stream流 distinct方法
    public static void duplicatRemoval(List<Integer> list) {
        List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println("去重之后：" + list1);
    }

    // 方法一：在创建一个集合 把元素不重复的元放入新的集合
    private static void removeRepeter(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (Integer integer : list) {
            if (integer != null && !newList.contains(integer)) {
                newList.add(integer);
            }
        }
        System.out.println("去重之后：" + newList);
    }

}
