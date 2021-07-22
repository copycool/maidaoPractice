package cn.maidaotech.java07.chapter04.test06_set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        while (set.size() < 20) {
            set.add(random.nextInt(30));
        }
        for (Integer integer : set) {
            System.out.print(integer + " ");
        }
    }
}
