package cn.maidaotech.java07.ch04;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Question6 {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        Random r=new Random();     
        while(set.size()<20){
           int num=r.nextInt(30)+1;
           set.add(num);
        
        }
        
        System.out.println(set);
       
    }
}

