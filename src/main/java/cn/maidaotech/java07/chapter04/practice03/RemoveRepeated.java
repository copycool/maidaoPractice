package cn.maidaotech.java07.chapter04.practice03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveRepeated {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 5));
        }
        System.out.println("删除前：" + list.toString());
        remove(list, 2);
        System.out.println("删除后：" + list.toString());
    }

    public static void remove(List<Integer> list, int num) {
        /**
        //这种方法可能会不能全部删除指定数字，请思考原因
        for (int i = 0; i < list.size(); i++) {
            Integer item = list.get(i);
            if (item != null && item.intValue() == num) {   
                list.remove(i);
            }
        }
         */
        //------------------------------------------------
        /** 抛出java.util.ConcurrentModificationException
        for (Integer n : list) {
            list.remove(n);
        }
         */
        //------------------------------------------------
        Iterator<Integer> it =  list.iterator();
        while(it.hasNext()){
            Integer n = it.next();
            if(n != null && n.intValue() == num){ //注意这里的严谨性
                it.remove();
            }
        }
    }
}