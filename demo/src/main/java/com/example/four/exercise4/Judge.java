package com.example.four.exercise4;


    


import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;


public class Judge {
    public static void main(String[] args) {
       List<Integer> list1 = null;
       List<Integer> list2 = null;
       {
           list1 = initListA();
           list2 = initListB();
           list1.retainAll(list2);
           System.out.println("交集："+ list1);
       }
       {
           list1 = initListA();
           list2 = initListB();
           list1.removeAll(list2);
           list1.addAll(list2);
           Collections.sort(list2);
           System.out.println("并集:" + list1);
       }
       {
           list1 = initListA();
           list2 = initListB();
           list1.removeAll(list2);
           System.out.println("差集："+ list1);
       }
    }
    private static List<Integer> initListA(){
    List<Integer> list = new ArrayList<>();
    list.addAll(Arrays.asList(1,2,3,4,5));
    return list;
    }
    private static List<Integer> initListB(){
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,3,4,5,6));
        return list;
    }
}
    
