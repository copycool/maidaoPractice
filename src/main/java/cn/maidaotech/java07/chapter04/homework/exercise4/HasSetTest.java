package cn.maidaotech.java07.chapter04.homework.exercise4;

import java.util.HashSet;


public class HasSetTest {
    // 如何判断两个集合是否 有交集，并打印出他们的交集、并集和差集
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);

        HashSet<Integer> unionSet = new HashSet<>();
        unionSet.addAll(set1);
        unionSet.addAll(set2);
        System.out.println(unionSet.toString());

        HashSet<Integer> intersection = new HashSet<>();
        intersection.addAll(set1);
        intersection.retainAll(set2);
        System.out.println(intersection.toString());

        HashSet<Integer> differenceSet = new HashSet<>();
        differenceSet.addAll(set1);
        differenceSet.removeAll(set2);
        System.out.println(differenceSet.toString());

        // Iterator iterator = unionSet.iterator();
        // while(iterator.hasNext()){
        // HashSet item=(HashSet)iterator.next();
        // System.out.print(item+" ");
        // }

    }
}
