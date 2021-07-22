package cn.maidaotech.java07.java04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_LinkedListTest {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        List<String> t = new ArrayList();
        t.add("666");
        t.add("888");
        long endTime = System.nanoTime();
        System.out.println("ArrayList添加程序运行时间： " + (endTime - startTime) + "ns");

        long startTimes = System.nanoTime();
        List<String> d = new LinkedList();
        d.add("777");
        d.add("999");
        long endTimes = System.nanoTime();
        System.out.println("LinkedList添加程序运行时间： " + (endTimes - startTimes) + "ns");

        long startTime1 = System.nanoTime();
        for (int i = 0; i < t.size(); i++) {
            System.out.println(t.get(i));
        }
        long endTime1 = System.nanoTime();
        System.out.println("ArrayList访问内容程序运行时间： " + (endTime1 - startTime1) + "ns");

        long startTime2 = System.nanoTime();
        for (int i = 0; i < d.size(); i++) {
            System.out.println(d.get(i));
        }
        long endTime2 = System.nanoTime();
        System.out.println("LinkedList访问内容程序运行时间： " + (endTime2 - startTime2) + "ns");

        long startTime3 = System.nanoTime();
        t.remove(0);
        long endTime3 = System.nanoTime();
        System.out.println("ArrayList删除内容程序运行时间： " + (endTime3 - startTime3) + "ns");

        long startTime4 = System.nanoTime();
        d.remove(0);
        long endTime4 = System.nanoTime();
        System.out.println("LinkedList删除内容程序运行时间： " + (endTime4 - startTime4) + "ns");
    }

}