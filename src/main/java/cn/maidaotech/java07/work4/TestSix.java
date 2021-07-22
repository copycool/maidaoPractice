package cn.maidaotech.java07.work4;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TestSix {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(30);

        while (set.size() != 20) {
            set.add((int) (Math.random() * 20));
        }
        // Random random = new Random();
        // for (int i = 0; i < 20; i++) {
        // int r = random.nextInt(30) + 0;
        // set.add(r);//此方法可能会有重复的数字，set内不会有重复的数字
        // }
        System.out.println(set);
        System.out.println(set.size());
    }
}