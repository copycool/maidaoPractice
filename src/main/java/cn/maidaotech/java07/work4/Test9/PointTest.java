package cn.maidaotech.java07.work4.Test9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PointTest {
    public static void main(String[] args) {

        // HashMap<Integer, Integer> point = new HashMap<>();
        // point.put(key, value)
        List<Point> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Point p = new Point((int) (Math.random() * 10 + 1), (int) (Math.random() * 10 + 1));
            list.add(p);
        }
        System.out.println(list);
        System.out.println();
        for (Point p : list) {
            System.out.print(p);
        }
        System.out.println();
        System.out.println();
        Point[] points = new Point[list.size()];
        list.toArray(points);
        Arrays.sort(points);
        for (Point p : points) {
            System.out.print(p);
        }
        System.out.println();
        System.out.println();
        Collections.sort(list, new CompareY());
        for (Point point : points) {
            System.out.print(point);
        }
        ;

    }

}
