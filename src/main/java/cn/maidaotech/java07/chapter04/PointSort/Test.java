package cn.maidaotech.java07.chapter04.pointsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

// b. 随机创建 100 个点，然后使用 Arrays.sort()方法和 Collections.sort()
// 分别以他们 x 坐标的 升序和 y 坐标的升序显示这些点
public interface Test {
    public static void main(String[] args) {
        Random random = new Random();
        List<Point> list = new ArrayList<>();
        int[] arr = new int[100];
        while(list.size()<100){
            int a = random.nextInt((1000-0)+0);
            int b = random.nextInt((1000-0)+0);
            Point point = new Point(a,b);
            if(!list.contains(point)){
                list.add(point);
            }
        }
        Point[] a = list.toArray(new Point[list.size()]);
        for(Point item : list){
            System.out.println(item);
        }
       
        System.out.println("********X轴升序排序后：********");
        Collections.sort(list);
        for(Point item : list){
            System.out.println(item);
        }
        System.out.println("********Y轴升序排序后：********");
        Comparator com1 = new CompareY();
        Arrays.sort(a,com1);
        for(Point item : a){
            System.out.println(item);
        }


    }
}