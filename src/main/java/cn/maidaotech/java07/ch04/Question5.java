package cn.maidaotech.java07.ch04;

import java.util.*;


public class Question5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);


        HashSet<Integer> set=new HashSet<>(list);
        list.clear();
        list.addAll(set);
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
