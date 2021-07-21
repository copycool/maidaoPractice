package cn.maidaotech.java07.chapter04;
// 如何判断两个集合是否 有交集，并打印出他们的交集、并集和差集。

import java.util.ArrayList;
import java.util.List;

public class List04 {
   private static List<Integer> list1 = new ArrayList<>();
   private static List<Integer> list2 = new ArrayList<>();
   public static void main(String[] args) {
       Init();
       Intersection();
       Clear();
       Init();
       DifferenceSet();
       Clear();
       Init();

       UnionSet();
       Clear();
   }
   public static void Clear(){
       list1.clear();
       list2.clear();

   }

   public static void Init() {
       for (int i = 1; i < 11; i++) {
           list1.add(i);

       }
       for (int i = 7; i < 20; i++) {
           list2.add(i);
       }

   }

   // 并集
   public static void Intersection() {
        boolean haveIntersection = list1.retainAll(list2);
        if(haveIntersection){
            System.out.println("交集为："+list1);
        }

    }
    // 差集
    public static void DifferenceSet(){
        list1.removeAll(list2);
        System.out.println("差集为："+list1);
    }
    // 交集
    public static void UnionSet(){
        list1.removeAll(list2);
        list1.addAll(list2);
        System.out.println("并集为："+list1);
    } 
}