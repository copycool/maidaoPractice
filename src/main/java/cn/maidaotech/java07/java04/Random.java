package cn.maidaotech.java07.java04;

import java.util.ArrayList;
import java.util.List;

public class Random {
    public static void main(String[] args) {
        List set = new ArrayList(20);
        int max = 100, min = 1;
        for (int i = 0; i < 5; i--) {
            int a = (int) (Math.random() * (max - min) + min);
            if (a < 30) {
                set.add(a);
            }

            if (set.size() >= 21) {
                break;
            }
            System.out.println(set);
            System.out.println(set.size());
        }

    }

}