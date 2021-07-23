package cn.maidaotech.java07.chapter04.practice02;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList添加元素耗时:" + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList添加元素耗时:" + (end - start));


        start = System.currentTimeMillis();
        for (int i = 9999; i >= 0; i--) {
            arrayList.remove(i);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList删除元素耗时:" + (end - start));

        start = System.currentTimeMillis();
        for (int i = 9999; i >= 0; i--) {
            linkedList.remove(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList删除元素耗时:" + (end - start));

        start = System.currentTimeMillis();
        arrayList.get(arrayList.size() - 1);
        end = System.currentTimeMillis();
        System.out.println("ArrayList从集合尾部访问元素耗时:" + (end - start));

        start = System.currentTimeMillis();
        linkedList.get(linkedList.size() - 1);
        end = System.currentTimeMillis();
        System.out.println("LinkedList从尾部集合访问元素耗时:" + (end - start));

    }
}