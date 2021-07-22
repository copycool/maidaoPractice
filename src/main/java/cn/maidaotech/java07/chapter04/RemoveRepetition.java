package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveRepetition {
    //编写函数，去除List集合中的重复元素，不要改变元素的顺序。
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,5,4,3,1,3,2,7,6,4));
        for (int i = 0; i <list.size(); i++) {

            for (int j = i+1; j < list.size(); j++) {
                
                if (list.get(i)==list.get(j)) {
                    list.remove(j);
                }
            }
        }
        System.out.println(list);
    }
 
}