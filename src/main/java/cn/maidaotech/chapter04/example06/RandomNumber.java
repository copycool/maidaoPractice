package cn.maidaotech.chapter04.example06;

import java.util.HashSet;
import java.util.Set;

public class RandomNumber {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        while (set.size() < 20) {
            Integer num = (int) (Math.random() * 30 + 1);
            set.add(num);
        }
        System.out.println(set); 
    }
   

}