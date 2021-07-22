package cn.maidaotech.java07.set_practice;

import java.util.ArrayList;
import java.util.List;

import cn.maidaotech.java07.util.ListUtils;

public class RandumNumber {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list = ListUtils.randumNum(20, 6);

        list.forEach(v -> System.out.print(v + "\t"));

        list = ListUtils.removeAll(list, 0);
        System.out.println();
        list.forEach(v -> System.out.print(v + "\t"));
    }
}