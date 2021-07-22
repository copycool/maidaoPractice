package cn.maidaotech.java07.set_practice.Performance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 对ArrayLsit和LinkedList进行性能测试
 */
public class PerformanceTest {

    private static final int TIMES = 100000;

    public static void main(String[] args) {
        List<Integer> arrLists = new ArrayList<>();
        List<Integer> linkeds = new LinkedList<>();
        {
            System.out.println("arrayList添加元素耗时:\t" + addFirst(arrLists) + "毫秒");
            System.out.println("linkedList添加元素耗时:\t" + addFirst(linkeds) + "毫秒");

        }
        {
            System.out.println("arrayList查找元素耗时:\t" + checkFirst(arrLists) + "毫秒");
            System.out.println("linkedList查找元素耗时:\t" + checkFirst(linkeds) + "毫秒");
        }
        {
            System.out.println("arrayList删除" + TIMES + "个元素耗时:\t" + removeFirst(arrLists) + "毫秒");
            System.out.println("linkedList删除" + TIMES + "个元素耗时:\t" + removeFirst(linkeds) + "毫秒");
        }
    }

    public static long addFirst(List<Integer> list) {
        // 测试添加元素
        long startNano = System.currentTimeMillis();
        for (int i = 0; i < TIMES; i++) {
            list.add(0, i);
        }
        long endNano = System.currentTimeMillis();
        return (endNano - startNano);
    }

    public static long checkFirst(List<Integer> list) {
        long startNano = System.currentTimeMillis();
        for (int i = TIMES - 1; i > 0; i--) {
            if (list.get(i) == 50000) {
                // System.out.println(list.get(i));
            }
        }
        long endNano = System.currentTimeMillis();
        return (endNano - startNano);
    }

    public static long removeFirst(List<Integer> list) {
        long startNano = System.currentTimeMillis();
        for (int i = 0; i < TIMES / 2; i++) {
            list.remove(i);
        }
        long endNano = System.currentTimeMillis();
        return (endNano - startNano);
    }
}
