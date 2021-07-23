package cn.maidaotech.java07.chapter04.practice04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JudgmentSet {
    public static void main(String[] args) {
        List<Integer> list1 = null;
        List<Integer> list2 = null;
        {
            list1 = listA();
            list2 = listB();
            list1.retainAll(list2);
            System.out.println("交集" + list1);
        }
        {
            list1 = listA();
            list2 = listB();
            list1.removeAll(list2);
            list1.addAll(list2);
            System.out.println("并集" + list1);
        }
        {
            list1 = listA();
            list2 = listB();
            list1.removeAll(list2);
            System.out.println("差集" + list1);
        }

    }  
        private static List<Integer> listA() {
            List<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(1,2,3,4,5,6,7));
            return list;   
        }
        private static List<Integer> listB(){
            List<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(1,3,5,7,8,9));
            return list;
        }
    
}