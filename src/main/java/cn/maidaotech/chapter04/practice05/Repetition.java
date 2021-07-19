package cn.maidaotech.chapter04.practice05;

import java.util.ArrayList;
import java.util.List;

/*
编写函数，去除List集合中的重复元素，不要改变元素的顺序。
*/
public class Repetition {
    public static void main(String[] args) {
        Repetition repetition = new Repetition();
        repetition.test();
    }
    public void test() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(6);
        list.add(0);
        list.add(6);
        System.out.println(list);
        for (int i = 0; i < list.size()-1; i++) {
            for (int j =i+1 ; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println(list);
       }
}