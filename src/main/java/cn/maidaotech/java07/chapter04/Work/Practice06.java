package cn.maidaotech.java07.chapter04.Work;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Practice06{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(new Random().nextInt(30));
        }
        System.out.println(set);
    }
    
}