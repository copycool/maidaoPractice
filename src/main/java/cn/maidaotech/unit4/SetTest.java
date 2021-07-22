package cn.maidaotech.java07.unit4;

import java.util.LinkedHashSet;
import java.util.Random;

public class SetTest {
    //创建一个Set集合，保存20个30以内的随机整数，必须保证20个。
    public static void main(String[] args) {

        LinkedHashSet<Integer> a = new LinkedHashSet<>();
        Random random = new Random();
        int min = 10;
        int max = 30;
        while (a.size() < 20) {
            a.add(random.nextInt((max - min) + min));
        }
        System.out.println("随机产生的20个整数是：");
        for (Integer item : a) {
            System.out.print(item + "——");
        }

    }
}