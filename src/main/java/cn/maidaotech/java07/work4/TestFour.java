package cn.maidaotech.java07.work4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//如何判断两个集合是否有交集，
//并打印出他们的交集、并集和差集
public class TestFour {
    public static void main(String[] args) {
        List<Integer> store1 = new ArrayList<>();
        List<Integer> store2 = new ArrayList<>();
        List<Integer> intersection = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();
        List<Integer> difference = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int ran1 = r.nextInt(100);
            int ran2 = r.nextInt(100);
            store1.add(ran1);
            store2.add(ran2);

        }

        System.out.println("集合一的数：" + store1);
        System.out.println(store1.size());
        System.out.println("集合二的数：" + store2);

        // store1.retainAll(store2);
        // System.out.println( store1);

        for (Integer integer : store1) {
            if (!store2.contains(integer)) {
                difference.add(integer);
            } else {
                intersection.add(integer);
            }

        }
        System.out.println();
        System.out.println("差集" + difference);
        System.out.println("交集" + intersection);

        // sum.remove(store2);
        sum.addAll(store2);
        sum.addAll(store1);
        System.out.println("并集" + sum);
        System.out.println(sum.size());
    }
}
