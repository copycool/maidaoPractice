package com.example.four.exercise6;


import java.util.HashSet;

import java.util.Set;

public class AInteger {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        while (set.size() < 20) {
            Integer num = Integer.valueOf((int)(Math.random() * 30 + 1));
            set.add(num);
        }
        for (Integer i : set) {
            System.out.println(i + "、");
        }
        System.err.println("共计：" + set.size() + "个");

    }
}