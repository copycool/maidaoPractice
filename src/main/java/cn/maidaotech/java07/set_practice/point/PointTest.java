package cn.maidaotech.java07.set_practice.point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PointTest {
    public static void main(String[] args) {
        List<Point> result = colletctionSort();
        result.forEach(v -> System.out.println(v));
    }

    public static Point[] arraysSort() {
        Random random = new Random();
        Point[] points = new Point[30];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(random.nextInt(50), random.nextInt(50));
        }
        Arrays.sort(points);
        for (Point point : points) {
            System.out.println("point" + point);
        }
        return points;
    }

    public static List<Point> colletctionSort() {
        Random random = new Random();
        List<Point> list = new ArrayList<>(30);
        while (list.size() < 30) {
            list.add(new Point(random.nextInt(50), random.nextInt(50)));
        }
        list.sort(new CompareY());
        return list;
    }
}