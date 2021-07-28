package cn.maidaotech.java07.chapter06;

import java.util.ArrayList;

import java.util.List;


public class Practice05 {
    public static void main(String[] args){
        try {
            List<Integer> list = new ArrayList<>();
            Integer list1 = list.get(0);
            System.out.println(list1);
        } catch (Exception e) {
            System.out.println("指针越界");
        }
       
    }
}
