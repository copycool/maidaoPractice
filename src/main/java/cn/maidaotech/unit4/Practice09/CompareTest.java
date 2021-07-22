package cn.maidaotech.java07.unit4.Practice09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareTest {
    public static void main(String[] args) {
        List<Point> list=new ArrayList<>();
        for(int i=0;i<20;i++){
            Point p = new Point((int) (Math.random() * 10 + 1), (int) (Math.random() * 10 + 1));
            list.add(p);
        }
        System.out.println("排序前：");
        for(Point p:list){
            System.out.println(p);
        }
        System.out.println();
        System.out.println("按X排序后：");
        Point[] points = new Point[list.size()];
        list.toArray(points);
        Arrays.sort(points);
        for (Point p : points) {
            System.out.print(p);
        }
        System.out.println();
        System.out.println("按Y排序后：");
        Collections.sort(list, new CompareY());
        for (Point p : list) {
            System.out.print(p);
        }

    }
}