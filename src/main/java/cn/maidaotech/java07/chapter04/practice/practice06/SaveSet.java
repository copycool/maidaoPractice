package cn.maidaotech.java07.chapter04.practice.practice06;

import java.util.HashSet;
import java.util.Set;

public class SaveSet {
    public static Set<Integer> save(){
        Set<Integer> set = new HashSet<>();
        while(set.size() <= 20){
            int randomNum = (int)((Math.random() * 40) + 1);
            set.add(randomNum);
        }
        return set;
    }

    public static void main(String[] args) {
        System.out.println(save().toString());
    }
}