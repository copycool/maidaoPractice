package cn.maidaotech.java07.work.chapter04.question9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            list.add(i);
//        }
//        System.out.println(list);
//
//        List<Integer> integerList = list.subList(17,20);
//        System.out.println(integerList);
        for (int i = 0; i < 100; i++) {
            System.out.println(new Random().nextInt(3)+1);
        }
    }
}