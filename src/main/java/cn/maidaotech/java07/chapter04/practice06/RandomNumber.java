package cn.maidaotech.java07.chapter04.practice06;

import java.util.HashSet;
import java.util.Set;

public class RandomNumber {
    public static void main(String[] args) {
        //1.创建set集合
        Set<Integer> set = new HashSet<>();
        //2.保存20个30以内的随机整数
        while(set.size() < 20){
            Integer i = (int)(Math.random() * 30 + 1);
            set.add(i);
        }    
        for (Integer i : set) {
            System.out.print(i + "、");
        }
        //3.打印
        System.out.println("共计" + set.size() + "个");
    }
}