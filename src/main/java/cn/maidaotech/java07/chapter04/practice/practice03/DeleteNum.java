package cn.maidaotech.java07.chapter04.practice.practice03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeleteNum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1;i <= 20;i ++){
            list.add(i);
        }
        list.add(5);
        list.add(5);
        list.add(5);
        System.out.println(list.toString());
        System.out.println(remove(list, 5).toString());
    }
    public static List<Integer> remove(List<Integer> list, Integer option) {
        if (list == null || list.isEmpty())
        return null;

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if(option.equals(iterator.next())){
                iterator.remove();
            }
        }
        return list;
    }
}