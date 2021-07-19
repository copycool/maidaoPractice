package cn.maidaotech.java07.chapter04.homework.exercise5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test {
    // 去除 List 集合中的重复元素，不要改变元素的顺序
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int random = new Random().nextInt(10);
            arrayList.add(random);
        }
        System.out.println(arrayList.toString());
        ArrayList<Integer> newaArrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int item = (int) iterator.next();
            if (hashSet.add(item)) {
                newaArrayList.add(item);
            }
        }
        arrayList.clear();
        arrayList.addAll(newaArrayList);

        System.out.println(arrayList.toString());

    }
}
