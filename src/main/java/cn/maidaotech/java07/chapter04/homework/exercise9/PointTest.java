package cn.maidaotech.java07.chapter04.homework.exercise9;
// sort用法

// 1. Collections.sort(List<? extends Comparable>)
// 2.Collecitions.sort(List list,new Comparator<T>(){@Override compare}{});

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 定义一个Point类，他的两个数据域为坐标x和y，实现comparable接口，按x坐标排序，x坐标一样的再按y坐标排序；
// 定义一个CompareY的类实现Comparator<Point>，按y坐标排序，y坐标一样的再按x坐标排序；
// 随机点，然后使用Arrays.sort()方法和Collections.sort()分别以他们x坐标的升序和y坐标的升序显示这些点

public class PointTest {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(3, 6));
        points.add(new Point(5, 4));
        points.add(new Point(1, 3));
        points.add(new Point(2, 4));
        points.add(new Point(7, 1));
        points.add(new Point(1, 2));
        points.add(new Point(4, 4));
        Collections.sort(points);
        System.out.println(points.toString());
        CompareY compareY = new CompareY();
        Collections.sort(points, compareY);
        System.out.println(points.toString());

        Point[] aPoints = new Point[5];
        aPoints[0] = new Point(3, 6);
        aPoints[1] = new Point(2, 6);
        aPoints[2] = new Point(5, 1);
        aPoints[3] = new Point(5, 4);
        aPoints[4] = new Point(1, 2);
        Arrays.sort(aPoints);
        for (Point point : aPoints) {
            System.out.println(point.toString());
        }

    }

}
