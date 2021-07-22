package cn.maidaotech.java07.chapter4.question9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
随机点，然后使用Arrays.sort()方法和Collections.sort()分别以他们x坐标的升序和y坐标的升序显示这些点  */
public class PointTest {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<Point>();
        for (int i = 0; i < 20; i++) {
            Point p = new Point((int) (Math.random() * 10 + 1), (int) (Math.random() * 10 + 1));
            list.add(p);
        }
        System.out.println("排序前：");
        for (Point p : list) {
            System.out.print(p);
        }
        System.out.println();
        System.out.println("按X排序后： ");
        Point[] points=new Point[list.size()];
        list.toArray(points);
        Arrays.sort(points);
        for (Point p : points) {
            System.out.print(p);
        }
        System.out.println();
        System.out.println("按Y排序后： ");
        Collections.sort(list, new CompareY());
        for (Point p : list) {
            System.out.print(p);
        }


    }
}