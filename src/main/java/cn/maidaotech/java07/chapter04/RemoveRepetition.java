package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveRepetition {
    //编写函数，去除List集合中的重复元素，不要改变元素的顺序。
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,3,2,5,3,7,6,6));
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                
                if (list.get(i)==list.get(j)) {
                    
                    list.remove(i);
                }
            }
        }
        System.out.println(list);
    }
}