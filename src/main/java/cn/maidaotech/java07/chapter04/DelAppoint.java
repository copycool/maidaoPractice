package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;
import java.util.Random;

public class DelAppoint {
    // 创建一个集合存入20个5以内的整数，遍历集合，删除所有指定数字的元素。
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int a = random.nextInt(6);
            list.add(a);
        }

        for (int i : list) {
            System.out.println(i);
        }

        System.out.println("===============");

        for (int i = 0; i < list.size(); ) {
            int num = list.get(i);
            if (num <3) {
                list.remove(i);    //remove（）里面是索引，看源码            
            }
            else{
                i++;
            }           
        }
        System.out.println(list.toString());

       
    }

}