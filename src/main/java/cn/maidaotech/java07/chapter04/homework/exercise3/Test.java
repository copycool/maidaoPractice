package cn.maidaotech.java07.chapter04.homework.exercise3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Test {
    // 创建一个集合存入 20 个 10 以内的整数，遍历集合，删除所有指定数字的元素。
    //创建一个集合存入20个5以内的整数，遍历集合，删除所有指定数字的元素
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int random = new Random().nextInt(5);
            arrayList.add(random);

        }
        traverse(arrayList);

        arrayList = removeSpecifiedElement(arrayList, 0);
        traverse(arrayList);

    }

    public static ArrayList<Integer> removeSpecifiedElement(ArrayList<Integer> arrayList, int number) {
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer item = (Integer) iterator.next();
            if (item == number) {
                iterator.remove();
            }
        }
        return arrayList;
    }

    public static void traverse(ArrayList<Integer> arrayList) {
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
