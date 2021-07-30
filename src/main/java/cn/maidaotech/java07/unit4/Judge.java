package cn.maidaotech.java07.unit4;

import java.util.ArrayList;
import java.util.List;

public class Judge {
    // 判断两个集合是否有交集，并打印出他们的交集、并集和差集
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        for (int i = 1; i <3; i++) {
            a.add(i);
        }
        System.out.println(a);
        List<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(5);
        System.out.println(b);
        // 交集
        a.retainAll(b);
        System.out.println("集合a和b的交集是：" + a);
        a.clear();
        //并集
        for (int i = 1; i <3; i++) {
            a.add(i);
        }
        b.removeAll(a);
        a.addAll(b);
        System.out.println("集合a和b的并集是："+a);
        a.clear();b.clear();
        //差集
        for (int i = 1; i <3; i++) {
            a.add(i);
        } 
        b.add(1);
        b.add(5);
        a.removeAll(b); 
        System.out.println("集合a和b的差集是："+a);
    }
}