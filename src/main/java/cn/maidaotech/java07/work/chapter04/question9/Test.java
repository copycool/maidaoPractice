package cn.maidaotech.java07.work.chapter04.question9;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<Point> list = new ArrayList<>();
        Point point = null;
        for (int i = 0; i < 10; i++) {
            point = new Point(new Random().nextInt(10)+1,new Random().nextInt(10)+1);
            list.add(point);
        }
        System.out.println("初始化的数组为：");
        for (Point pointObj:list) {
            System.out.println(pointObj.toString());
        }

        Point[] pointArr  =new Point[list.size()];
        pointArr = list.toArray(pointArr);

        System.out.println("排序前的数组为：");
        printArray(pointArr);
        /**
         * 按照x坐标的升序排列为：
         */
        System.out.println("======================================");
        System.out.println("按照x坐标的升序排列为 Arrays.sort");
        Arrays.sort(pointArr,Point::compareTo);
        System.out.println("排序后的数组为：");
        printArray(pointArr);

        Collections.sort(list);
        System.out.println("按照x坐标的升序排列为 Collections.sort");
        printList(list);
        /**
         * 按照y坐标的升序排列为：
         */
        System.out.println("======================================");
        System.out.println("按照y坐标的升序排列为  Arrays.sort");
//        Arrays.sort(pointArr,new CompareY().compareTo());
//        printList(list);
    }

    public static void printArray(Point[] pointArr){
        for (Point point:pointArr) {
            System.out.println(point.toString());
        }
    }

    public static void printList(List<Point> list){
        list.stream().forEach(obj-> System.out.println(obj.toString()));
    }
}
