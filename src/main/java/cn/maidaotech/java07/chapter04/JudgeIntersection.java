package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;

public class JudgeIntersection {
    // 如何判断两个集合是否有交集，并打印出他们的交集、并集和差集。
public static void main(String[] args) {
    

     ArrayList<Integer> list = new ArrayList<>();
     ArrayList<Integer> list1 = new ArrayList<>();

    for(
    int i = 0;i<10;i++)
    {
        list.add(i);
    }for(
    int i = 10;i<20;i++)
    {
        list1.add(i);
    }

    // 交集
    list.retainAll(list1);
    System.out.println(list);

    //有重并集
    list.addAll(list1);

    //无重并集
    list.remove(list1);
    list.addAll(list1);

    //差集
    list.removeAll(list1);

}}