package cn.maidaotech.java07.work.chapter04;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Question05 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        System.out.println("去重之前："+list);
        duplicatRemoval(list);

    }

    public static void duplicatRemoval(List<Integer> list) {
        Set<Integer> set = list.stream().collect(Collectors.toSet());
        System.out.println("去重之后："+set );
    }
}