package cn.maidaotech.java07.chapter04.practice.practice09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Point[] arr = new Point[100];

        int i = 0;
        int randomX;
        int randomY;
        while (i < 100) {
            randomX = (int) (Math.random() * 99 + 1);
            randomY = (int) (Math.random() * 99 + 1);

            Point point = new Point(randomX, randomY);
            arr[i] = point;

            i++;
        }

        Arrays.sort(arr);
        System.out.println("数组：优先排序X");
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("分割线——————————————————————");

        Arrays.sort(arr, new CompareY());
        System.out.println("数组：优先排序Y");
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("分割线——————————————————————");

        List<Point> list = new ArrayList<>();
        list = Arrays.asList(arr);

        Collections.sort(list);
        System.out.println("集合：优先排序X");
        list.forEach(o -> System.out.println(o.toString()));

        System.out.println("分割线——————————————————————");

        Collections.sort(list, new CompareY());
        System.out.println("集合：优先排序Y");
        list.forEach(o -> System.out.println(o.toString()));

    }
}