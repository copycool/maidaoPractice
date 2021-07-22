package cn.maidaotech.java07.chapter04.DSortOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DSortOrder {
    //对二维平面上的点进行排序：
    //定义一个Point类，他的两个数据域为坐标x和y，实现comparable接口，按x坐标排序，x坐标一样的再按y坐标排序；
    //定义一个CompareY的类实现Comparator<Point>，按y坐标排序，y坐标一样的再按x坐标排序；
    //随机点，然后使用Arrays.sort()方法和Collections.sort()分别以他们x坐标的升序和y坐标的升序显示这些点
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

        System.out.println("===========================");

        Arrays.sort(arr, new CompareY());
        System.out.println("数组：优先排序Y");
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("===========================");

        List<Point> list = new ArrayList<>();
        list = Arrays.asList(arr);

        Collections.sort(list);
        System.out.println("集合：优先排序X");
        list.forEach(o -> System.out.println(o.toString()));

        System.out.println("===========================");

        Collections.sort(list, new CompareY());
        System.out.println("集合：优先排序Y");
        list.forEach(o -> System.out.println(o.toString()));
    }
}