package cn.maidaotech.java07.set_practice;

import java.util.ArrayList;
import java.util.List;

import cn.maidaotech.java07.util.ListUtils;

public class IsSet {

    public static void main(String[] args) {
        List<Integer> list = ListUtils.randumNum(5, 10);
        List<Integer> list2 = ListUtils.randumNum(5, 10);
        list.forEach(v -> System.out.print(v + "\t"));
        System.out.println("--------------------------------------------");
        list2.forEach(v -> System.out.print(v + "\t"));
        System.out.println("--------------------------------------------");
        // List<Integer> list3 = intersectionExist(list, list2);
        List<Integer> list3 = subractionExist(list, list2);

        list3.forEach(v -> System.out.print(v + "\t"));
    }

    // 交集
    public static <T> List<T> intersectionExist(List<T> list, List<T> list2) {
        List<T> resList = new ArrayList<>();
        if (list == null || list2 == null || list == list2) {
            return null;
        }
        if (list.isEmpty() || list2.isEmpty()) {
            return null;
        }
        for (T t : list2) {
            if (list.contains(t)) {
                if (!resList.contains(t)) {
                    resList.add(t);
                }
            }
        }
        return resList;
    }

    public static <T> List<T> unionExist(List<T> list, List<T> list2) {
        List<T> res = new ArrayList<>();
        if (list == null || list2 == null || list == list2) {
            return null;
        }
        if (list.isEmpty() || list2.isEmpty()) {
            return null;
        }
        list.addAll(list2);

        for (T t : list) {
            if (!res.contains(t)) {
                res.add(t);
            }
        }
        return res;
    }

    public static <T> List<T> subractionExist(List<T> list, List<T> list2) {
        list.removeAll(list2);
        return list;
    }
}