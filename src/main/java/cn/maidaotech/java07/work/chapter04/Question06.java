package cn.maidaotech.java07.work.chapter04;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Question06 {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(20);

        while (set.size()<20){
            set.add(new Random().nextInt(30)+1);
        }

        System.out.println(set );
    }
}