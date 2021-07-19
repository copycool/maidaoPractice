package cn.maidaotech.java07.chapter04.practice.practice04;

import java.util.ArrayList;
import java.util.List;

public class CollectionRelation {
    private static List<Integer> list1 = new ArrayList<>();
    private static List<Integer> list2 = new ArrayList<>();
    static {
        clear();
        init();
    }

    public static void init() {
        for (int i = 1; i <= 20; i++) {
            list1.add(i);
        }
        for (int i = 11; i <= 30; i++) {
            list2.add(i);
        }
    }

    public static void clear() {
        list1.clear();
        list2.clear();
    }

    public static void printIntersection() {
        boolean haveIntersection = list1.retainAll(list2);
        if (haveIntersection) {
            System.out.println("交集是：" + list1);
        }
    }

    public static void printUnion() {
        list1.removeAll(list2);
        list1.addAll(list2);
        System.out.println("并集是" + list1);
    }

    public static void printDifference() {
        list1.removeAll(list2);
        System.out.println("差集是：" + list1);
    }

    public static void main(String[] args) {
        printIntersection();
        clear();
        init();
        printUnion();
        clear();
        init();
        printDifference();
        clear();
        init();
    }
}