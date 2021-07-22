package cn.maidaotech.java07.chapter04.practice06;

import java.util.HashSet;
import java.util.Set;

public class RandomNum {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        while (set.size() < 20) {
            Integer num = (int) (Math.random() * 30 + 1);
            set.add(num);
        }
        for (Integer i : set) {
            System.out.print(i + "、");
        }
        System.out.println("共计" + set.size() + "个");
    }
}