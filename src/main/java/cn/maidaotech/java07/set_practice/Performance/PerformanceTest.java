package cn.maidaotech.java07.set_practice.Performance;

import java.util.ArrayList;
import java.util.List;

/**
 * 对ArrayLsit和LinkedList进行性能测试
 */
public class PerformanceTest {
    public static void main(String[] args) {

    }

    public static long arrayListAddTest() {
        List<Integer> list = new ArrayList<>();

        // 测试添加元素
        long startNano = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        long endNano = System.nanoTime();
        long result = endNano - startNano;
        return result;
    }

    public static long () {

    }

    public static Integer linkedListAddTest() {
        long startNano = System.nanoTime();
        long result = endNano - startNano;
        return null;

    }
}