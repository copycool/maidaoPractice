package cn.maidaotech.java07.chapter04.homework.exercise9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Test {
    // 定义一个Point类，他的两个数据域为坐标x和y，实现comparable接口，按x坐标排序，x坐标一样的再按y坐标排序；
    // 定义一个CompareY的类实现Comparator<Point>，按y坐标排序，y坐标一样的再按x坐标排序；
    // 随机点，然后使用Arrays.sort()方法和Collections.sort()分别以他们x坐标的升序和y坐标的升序显示这些点
    public static void main(String[] args) {
        // Point[] points = new Point[4];
        // points[0] = new Point(1, 2);
        // points[1] = new Point(3, 1);
        // points[2] = new Point(2, 3);
        // points[3] = new Point(1, 4);
        List<Point> list = new ArrayList<>();
        list.add(new Point(1, 3));
        list.add(new Point(2, 3));
        list.add(new Point(4, 6));
        list.add(new Point(1, 2));
        list.add(new Point(5, 3));
        list.add(new Point(7, 1));
        list.add(new Point(1, 3));
        Collections.sort(list, new CompareX());
        list.forEach(System.out::println);
        
        // // //定义一个Point类，他的两个数据域为坐标x和y，实现comparable接口，按x坐标排序，x坐标一样的再按y坐标排序；
        // for(int i=0;i<points.length;i++){
        // for(int j=0;j<points.length-1-i;j++){
        // Point temp= new Point();
        // if(points[j].compareTo(points[j+1])>0){
        // temp=points[j];
        // points[j]= points[j+1];
        // points[j+1]=temp;
        // }
        // }
        // }

        // for (Point point : points) {
        // System.out.println(point.toString());
        // }
        // System.out.println("--------------------");

        // // 定义一个CompareY的类实现Comparator<Point>，按y坐标排序，y坐标一样的再按x坐标排序；
        // CompareY compareY = new CompareY();
        // for(int i=0;i<points.length;i++){
        // for(int j=0;j<points.length-1-i;j++){
        // Point temp= new Point();
        // if(compareY.compare(points[j],points[j+1])>0){
        // temp=points[j];
        // points[j]= points[j+1];
        // points[j+1]=temp;
        // }
        // }
        // }
        // for (Point point : points) {
        // System.out.println(point.toString());
        // }
        // System.out.println("--------------------");

        // // 随机点，然后使用Arrays.sort()方法和Collections.sort()分别以他们x坐标的升序和y坐标的升序显示这些点
        // Point[] randomPoints= new Point[4];
        // randomPoints[0] = new Point(new Random().nextInt(10), new
        // Random().nextInt(10));
        // randomPoints[1] = new Point(new Random().nextInt(10), new
        // Random().nextInt(10));
        // randomPoints[2] = new Point(new Random().nextInt(10), new
        // Random().nextInt(10));
        // randomPoints[3] = new Point(new Random().nextInt(10), new
        // Random().nextInt(10));
        // for (Point point : randomPoints) {
        // System.out.println(point.toString());
        // }
        // System.out.println("--------------------");
        // Arrays.sort(randomPoints, compareY);
        // for (Point point : randomPoints) {
        // System.out.println(point.toString());
        // }
        // System.out.println("--------------------");
        // List<Point> list = new ArrayList<>();
        // list.add(randomPoints[0]);
        // list.add(randomPoints[1]);
        // list.add(randomPoints[2]);
        // list.add(randomPoints[3]);
        // list.sort(new Comparator<Point>(){
        // @Override
        // public int compare(Point o1, Point o2) {
        // return o1.getX() - o2.getX();
        // }
        // });

        // Collections.sort(list
        // , new Comparator<Point>(){
        // @Override
        // public int compare(Point o1, Point o2) {
        // return o1.getX() - o2.getX();
        // }
        // }
        // );

        // for (Point point : list) {
        // System.out.println(point.toString());
        // }

    }

}
