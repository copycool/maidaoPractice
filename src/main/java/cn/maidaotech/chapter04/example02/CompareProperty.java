package cn.maidaotech.chapter04.example02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareProperty {
    public static void main(String[] args) {
        //此处为自己手写，比较尴尬
        //加上<>解除黄色提示
        //这里解释说明下<>是泛型，可以直接增强for循环
        //如果没有用，使用增强for会转换成object
        long startTime = System.nanoTime();
        List<String> t = new ArrayList<>();
        t.add("666");
        t.add("888");
        t.add("777");
        t.add("999");
        t.add("666");
        t.add("888");
        t.add("777");
        t.add("999");
        long endTime = System.nanoTime();
        System.out.println("ArrayList添加程序运行时间： " + (endTime - startTime) + "ns");

        long startTimes = System.nanoTime();
        List<String> d = new LinkedList<>();
        d.add("777");
        d.add("999");
        d.add("666");
        d.add("888");
        d.add("777");
        d.add("999");
        d.add("666");
        d.add("888");
        long endTimes = System.nanoTime();
        System.out.println("LinkedList添加程序运行时间： " + (endTimes - startTimes) + "ns");

        long startTime1 = System.nanoTime();
        System.out.println(t);
        long endTime1 = System.nanoTime();
        System.out.println("ArrayList访问全部程序运行时间： " + (endTime1 - startTime1) + "ns");

        long startTime2 = System.nanoTime();
        System.out.println(d);
        long endTime2 = System.nanoTime();
        System.out.println("LinkedList访问全部程序运行时间： " + (endTime2 - startTime2) + "ns");

        long startTime3 = System.nanoTime();
        t.remove(4);
        long endTime3 = System.nanoTime();
        System.out.println("ArrayList删除第5个元素程序运行时间： " + (endTime3 - startTime3) + "ns");

        long startTime4 = System.nanoTime();
        d.remove(4);
        long endTime4 = System.nanoTime();
        System.out.println("LinkedList删除第5个元素程序运行时间： " + (endTime4 - startTime4) + "ns");

    }
}
