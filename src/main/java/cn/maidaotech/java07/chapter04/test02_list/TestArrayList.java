package cn.maidaotech.java07.chapter04.test02_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 编写程序分别测试对比ArrayList和LinkedList在添加、访问、删除元素时的性能。
 * 提示：从集合头部添加、删除元素，从集合尾部访问元素，请写出原因。
 */
public class TestArrayList {
    private static final Integer TIMES = 100000;

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        {
            Long l1 = System.currentTimeMillis();
            addFirst(list1);
            long l2 = System.currentTimeMillis();
            System.out.println("往ArrayList集合的第一个位置添加元素耗时："+(l2-l1));
        }
        {
            Long l1 = System.currentTimeMillis();
            addFirst(list2);
            long l2 = System.currentTimeMillis();
            System.out.println("往LinkedList集合的第一个位置添加元素耗时："+(l2-l1));
        }
        {
            Long l1 = System.currentTimeMillis();
            getLast(list1);
            long l2 = System.currentTimeMillis();
            System.out.println("在ArrayList集合的中间位置获取元素耗时："+(l2-l1));
        }
        {
            Long l1 = System.currentTimeMillis();
            getLast(list2);
            long l2 = System.currentTimeMillis();
            System.out.println("在LinkedList集合的中间位置获取元素耗时："+(l2-l1));
        }
        {
            Long l1 = System.currentTimeMillis();
            removeLast(list1);
            long l2 = System.currentTimeMillis();
            System.out.println("在ArrayList集合的开始位置删除元素耗时："+(l2-l1));
        }
        {
            Long l1 = System.currentTimeMillis();
            removeLast(list2);
            long l2 = System.currentTimeMillis();
            System.out.println("在LinkedList集合的开始位置删除元素耗时："+(l2-l1));
        }

    }
    private static void addFirst(List<Integer> l){
        for (int i = 0; i < TIMES; i++) {
            l.add(0,i);
        }
    }
    private static void getLast(List<Integer> l){
        for (int i = 0; i < TIMES; i++) {
            l.get(l.size()-2);
        }
    }
    private static void removeLast(List<Integer> l){
        for (int i = 0; i < TIMES; i++) {
            l.remove(0);
        }
    }

}
