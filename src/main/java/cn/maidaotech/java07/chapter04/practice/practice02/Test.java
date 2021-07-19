package cn.maidaotech.java07.chapter04.practice.practice02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList添加元素耗时：" + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList添加元素耗时：" + (end - start));

        start = System.currentTimeMillis();
        for (int i = 99999; i >= 0; i--) {
            list.remove(i);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList删除元素耗时：" + (end - start));

        start = System.currentTimeMillis();
        for (int i = 999999; i >= 0; i--) {
            linkedList.remove(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList删除元素耗时：" + (end - start));

        start = System.currentTimeMillis();
        list.get(list.size() - 1);
        end = System.currentTimeMillis();
        System.out.println("ArrayList从集合尾部访问元素的时间：" + (end - start));

        start = System.currentTimeMillis();
        linkedList.get(linkedList.size() - 1);
        end = System.currentTimeMillis();
        System.out.println("LinkedList从集合尾部访问元素的时间：" + (end - start));
    }
}