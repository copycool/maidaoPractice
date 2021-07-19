package cn.maidaotech.java07.set_practice;

import java.util.ArrayList;
import java.util.List;

import cn.maidaotech.java07.util.ListUtils;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = ListUtils.randumNum(20, 20);
        list.forEach(v -> System.out.print(v + "\t"));
        System.out.println();
        List<Integer> list2 = new ArrayList<>();
        list.forEach((v) -> {
            if (!list2.contains(v)) {
                list2.add(v);
            }
        });
        list2.forEach(v -> System.out.print(v + "\t"));
    }
}