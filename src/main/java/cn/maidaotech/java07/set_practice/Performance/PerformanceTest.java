package cn.maidaotech.java07.set_practice.Performance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 对ArrayLsit和LinkedList进行性能测试
 */
public class PerformanceTest {
    public static void main(String[] args) {
        List<Integer> list = arrayListAddTest();
        List<Integer> list2 = linkedListAddTest();
        arrayListCheckTest(list);
        arrayListRemoveTest(list);
        linkedListRemoveTest(list2);
        linkedListCheckTest(list);
    }

    public static List<Integer> arrayListAddTest() {
        List<Integer> list = new ArrayList<>(10000);

        // 测试添加元素
        long startNano = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        long endNano = System.nanoTime();
        System.out.println("arrayListAddTest ------->" + (endNano - startNano + "  NS"));
        return list;
    }

    public static void arrayListRemoveTest(List<Integer> list) {
        long startNano = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            if (i < 500) {
                list.remove(i);
            }
        }
        long endNano = System.nanoTime();
        System.out.println("arrayListRemoveTest ------->" + (endNano - startNano) + "  NS");
    }

    public static List<Integer> linkedListAddTest() {
        List<Integer> list = new LinkedList<>();

        long startNano = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        long endNano = System.nanoTime();

        System.out.println("linkedListAddTest ------->" + (endNano - startNano + "  NS"));

        return list;

    }

    public static void linkedListRemoveTest(List<Integer> list) {

        long startNano = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            if (i < 500) {
                list.remove(i);
            }
        }
        long endNano = System.nanoTime();

        System.out.println("linkedListRemoveTest ------->" + (endNano - startNano + "  NS"));
    }

    public static void arrayListCheckTest(List<Integer> list) {
        long startNano = System.nanoTime();
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) == 501) {
                System.out.println(list.get(i));
            }
        }
        long endNano = System.nanoTime();

        System.out.println("arrayListCheckTest ------->" + (endNano - startNano + "  NS"));
    }

    public static void linkedListCheckTest(List<Integer> list) {
        long startNano = System.nanoTime();
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) == 501) {
                System.out.println(list.get(i));
            }
        }
        long endNano = System.nanoTime();

        System.out.println("linkedListCheckTest ------->" + (endNano - startNano + "  NS"));
    }
}