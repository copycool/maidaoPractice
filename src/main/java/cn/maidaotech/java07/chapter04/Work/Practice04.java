package cn.maidaotech.java07.chapter04.Work;

import java.util.ArrayList;

// import java.util.LinkedHashSet;
import java.util.List;

public class Practice04 {

    private static List<Integer> list1 = new ArrayList<>();
    private static List<Integer> list2 = new ArrayList<>();
    static{
        clear();
        init();
    }

    public static void main(String[] args) {
        // Practice04 p = new Practice04();
        // List<Integer> intersection = p.intersection(list1, list2);
        // System.out.println("交集是"+intersection);
        System.out.println("list1是" + list1);
        System.out.println("list2是" + list2);
        printIntersection();
        clear();
        init();
        printUnion();
        clear();
        init();
        printDifference();

    }

    private static void init(){
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }
        for (int i = 5; i < 15; i++) {
            list2.add(i);
        }
    }
    // private List<Integer> intersection(List<Integer> list1,List<Integer> list2){
    // List<Integer> result = new ArrayList<>();
    // for (int i = 0; i < list1.size(); i++) {
    // for (int j = 0; j < list2.size(); j++) {
    // if (list1.get(i)== list2.get(j)) {
    // Integer r = list1.get(i);
    // result.add(r);
    // }
    // }
    // }
    // LinkedHashSet<Integer> c=new LinkedHashSet<>(result);
    // ArrayList<Integer> d=new ArrayList<>(c);

    // return d;
    // }
    public static void printIntersection() {
        boolean haveIntersection = list1.retainAll(list2);
        if (haveIntersection) {
            System.out.println("交集是：" + list1);
        }
    }

    public static void printUnion() {
        list1.removeAll(list2);
        list1.addAll(list2);
        System.out.println("并集是：" + list1);
    }

    public static void printDifference() {
        list1.removeAll(list2);
        System.out.println("差集是：" + list1);
    }

    private static void clear(){
       list1.clear();
       list2.clear();
    }

}
