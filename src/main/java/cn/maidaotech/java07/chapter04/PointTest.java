package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PointTest {
    public static void main(String[] args) {
        Point [] arr = new Point[100];
        int i= 0;
        int randomX;
        int randomY;
        while(i<100){
            randomX = (int)(Math.random()*99+1);
            randomY = (int)(Math.random()*99+1);
            Point p = new Point(randomX,randomY);
            arr[i] = p;
            i++;
        }
        Arrays.sort(arr);
        System.out.println("数组:优先排序X");
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("---------------");

        Arrays.sort(arr,new ComparableY());
        System.out.println("数组:优先排序Y");
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("---------------");

        List <Point> list = new ArrayList<>();
        list = Arrays.asList(arr);
        Collections.sort(list);
        System.out.println("集合：优先排序X");
        list.forEach(o ->System.out.println(o.toString()));
        System.out.println("---------------");

        Collections.sort(list,new ComparableY());
        System.out.println("集合：优先排序Y");
        list.forEach(o ->System.out.println(o.toString()));
    }
}