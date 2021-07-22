package cn.maidaotech.java07.unit4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceTest {
    //测试对比ArrayList和LinkedList在添加、访问、删除元素时的性能
    public static void main(String[] args) {
        List<Integer> Array = new ArrayList<>();
        long startTime = System.nanoTime();
        Array.add(3);
        Array.add(4);
        long endTime = System.nanoTime();
        System.out.println("Array添加时性能：" + (endTime - startTime) + "ns");
        System.out.println(Array);

        List<Integer> linked = new LinkedList<>();
        long startTime1 = System.nanoTime();
        linked.add(4);
        linked.add(3);
        long endTime1 = System.nanoTime();
        System.out.println("linked添加时性能" + (endTime1 - startTime1) + "ns");
        System.out.println(linked);// 添加时性能测试

        long startTime2 = System.nanoTime();
        for (int i = 1; i > Array.size(); i--);
        long endTime2 = System.nanoTime();
        System.out.println("Array访问时性能：" + (endTime2 - startTime2) + "ns");
        System.out.println(Array);

        long startTime3 = System.nanoTime();
        for (int j = 1; j > linked.size(); j--);
        long endTime3 = System.nanoTime();
        System.out.println("linked访问时性能" + (endTime3 - startTime3) + "ns");
        System.out.println(linked);// 访问时性能测试

        long startTime4 = System.nanoTime();
        Array.remove(0);
        long endTime4 = System.nanoTime();
        System.out.println("Array删除时性能：" + (endTime4 - startTime4) + "ns");

        long startTime5 = System.nanoTime();
        linked.get(0);
        long endTime5 = System.nanoTime();
        System.out.println("linked删除时性能" + (endTime5 - startTime5) + "ns");
        // 删除时性能测试

    }
}