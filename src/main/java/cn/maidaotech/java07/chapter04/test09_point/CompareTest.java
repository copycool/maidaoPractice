package cn.maidaotech.java07.chapter04.test09_point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareTest {
    public static void main(String[] args) {
        List<Point> point = new ArrayList<>(20);
        for (int i = 0; i < 10; i++) {
            
            point.add(new Point((int)(Math.random()*20+1),(int)(Math.random()*20)+1));
        }
        
        //Point[] points = new Point[point.size()];
        System.out.println("排序前："+point);
        Collections.sort(point);
        System.out.println("排序后："+point);
        Point[] points = point.toArray(new Point[point.size()]);
        Arrays.sort(points);
        System.out.println("===========");
        System.out.println(Arrays.toString(points));

        CompareY compareY = new CompareY();
        Collections.sort(point, compareY);
        System.out.println(point);
    }
}
