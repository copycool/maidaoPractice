package cn.maidaotech.java07.chapter04.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import cn.maidaotech.java07.chapter03.practice.Dog;

public class ListTest {
    public static void main(String[] args) {
        String a = "sss";
        String b = "sss";
        Dog c = new Dog("sss", "sss", 2);
        Dog t = new Dog("sss", "sss", 2);
        Dog y = new Dog("sss", "sss", 2);
        List<Dog> list = new ArrayList<>();
        list.add(c);
        list.add(t);
        list.add(y);
        Dog[] arr = new Dog[list.size()];
        arr = list.toArray(arr);
        System.out.println(arr.length);
    }
}