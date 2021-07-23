package cn.maidaotech.java07.chapter04.Work.Practice09;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CompareTest {
    private static List<Point> init(){
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Point p = new Point(new Random().nextInt(10), new Random().nextInt(10));
            points.add(p);
        }
        return points;
    }
    public static void main(String[] args) {
        List<Point> list = init();
        System.out.println("初始时：");
        for (Point point : list) {
            System.out.println(point);
        }
        Point[] points = new Point[list.size()];
        list.toArray(points);
        Arrays.sort(points);
        System.out.println("按x排序后：");
        for (Point point : points) {
            System.out.println(point);
        }
        Collections.sort(list,new CompareY());
        System.out.println("按y排序后");
        for (Point point : list) {
            System.out.println(point);
        }
    }
}
