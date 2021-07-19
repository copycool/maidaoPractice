package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JudgeIntersection {
    // 如何判断两个集合是否有交集，并打印出他们的交集、并集和差集。
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        //List<String> stringList1 =  new ArrayList<>(Arrays.asList("a,b,c,d,e,f,g,h".split(",")));
        // int[] a = {1,2,3,4,5,6,7,2,3,4,5,6};
        // Collections.addAll(list, a); stringList.add("a");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(7);
        list1.add(8);

        // 交集

        // list.retainAll(list1);
        // System.out.println("交集：" + list);

        // 并集
        //有重并集
        // list.addAll(list1);
        // System.out.println("并集：" + list);

        //无重并集
        // list.removeAll(list1);
        // list.addAll(list1);
        // System.out.println("无重并集："+list);

        //差集
        list.removeAll(list1);
        System.out.println("差集："+list);
    }
}