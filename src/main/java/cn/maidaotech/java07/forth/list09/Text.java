package cn.maidaotech.java07.forth.list09;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Text {
    public static void main(String[] args) {
        List<Point> list=new ArrayList<Point>();
        for(int i=0;i<20;i++){
            Point p = new Point((int) (Math.random() * 10 + 1), (int) (Math.random() * 10 + 1));
            list.add(p);
        }
        System.out.println("排序前：");
        for (Point p : list) {
            System.out.print(p);
        }
        System.out.println();
        
        Point[] p1=new Point[list.size()];
        list.toArray(p1);
        Arrays.sort(p1);
        for (Point p : p1) {
            System.out.print(p);
        }
        System.out.println();
        System.out.println("按y排序后：");
        Collections.sort(list,new CompareY());
        for (Point p : list) {
            System.out.print(p);
        }

    }
}
