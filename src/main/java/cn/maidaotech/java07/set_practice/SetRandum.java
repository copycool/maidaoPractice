package cn.maidaotech.java07.set_practice;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetRandum {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        while (set.size() <= 20) {
            set.add(random.nextInt(30));
        }
        set.forEach(v -> System.out.print(v + "\t"));
    }
}