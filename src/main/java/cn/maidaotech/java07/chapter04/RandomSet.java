package cn.maidaotech.java07.chapter04;

import java.util.HashSet;
import java.util.Set;

// 创建一个 Set 集合，保存 20 个 40 以内的随机整数，必须保证 20 个。
public class RandomSet {

    public static void main(String[] args) {
        Set <Integer> set = new HashSet<>();
        while(set.size()<=20){
            set.add((int)(Math.random() * 40));
        }
System.out.println(set);
    }
   

    
}