package cn.maidaotech.java07.chapter04.test04_intersection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
//如何判断两个集合是否有交集，并打印出他们的交集、并集和差集。
public class Intersection {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(10));
        }
        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>();
        Random random2 = new Random();
        for (int i = 0; i < 10; i++) {
            list2.add(random2.nextInt(10));
        }
        System.out.println(list2);
        //交集
        Set<Integer> set01 = intersection(list1, list2);
        System.out.println(set01);

        //并集
        Set<Integer> set02 = union(list1, list2);
        System.out.println(set02);

        //补集
        Set<Integer> set03 = complementary(set02, list1);
        System.out.println(set03);
    }

    private static Set<Integer> intersection(List<Integer> l, List<Integer> l1) {
        Set<Integer> set = new HashSet<>();
        for (Integer i : l) {
            for (Integer j : l1) {
                if (i == j) {
                    set.add(i);
                }
            }

        }
        return set;
    }
    private static Set<Integer> union(List<Integer> l, List<Integer> l1){
        Set<Integer> set = new HashSet<>();
        for (Integer i : l) {
            set.add(i);
        }
        for (Integer j : l1) {
            set.add(j);
        }
        return set;
    }
    
    private static Set<Integer> complementary(Set<Integer> s, List<Integer> l1){
        Set<Integer> set = new HashSet<>();
        for (Integer i : s) {
           if(!l1.contains(i)){
               set.add(i);
           }
        }
        return set;
    }

}
