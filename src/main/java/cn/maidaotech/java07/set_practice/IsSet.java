package cn.maidaotech.java07.set_practice;

import java.util.List;
import java.util.stream.Collectors;

import cn.maidaotech.java07.util.ListUtils;

public class IsSet {

    public static void main(String[] args) {
        List<Integer> list = ListUtils.randumNum(5, 10);
        List<Integer> list2 = ListUtils.randumNum(5, 10);

        list.forEach(v -> System.out.print(v + "\t"));
        System.out.println();

        list2.forEach(v -> System.out.print(v + "\t"));
        System.out.println();

        List<Integer> list3 = unionExist(list, list2);
        list3.forEach(v -> System.out.print(v + "\t"));
    }

    // 交集
    public static <T> List<T> intersectionExist(List<T> list, List<T> list2) {
        /**
         * 方式一
         *
         * { List<T> resList = new ArrayList<>(); if (list == null || list2 == null ||
         * list == list2) { return null; } if (list.isEmpty() || list2.isEmpty()) {
         * return null; } for (T t : list2) { if (list.contains(t)) { if
         * (!resList.contains(t)) { resList.add(t); } } } }
         */
        {
            List<T> resList = list2.stream().filter(v -> list.contains(v)).collect(Collectors.toList());

            return resList;
        }
    }

    // 并集
    public static <T> List<T> unionExist(List<T> list, List<T> list2) {
        /**
         * {
         * 
         * List<T> res = new ArrayList<>(); if (list == null || list2 == null || list ==
         * list2) { return null; } if (list.isEmpty() || list2.isEmpty()) { return null;
         * } list.addAll(list2);
         * 
         * for (T t : list) { if (!res.contains(t)) { res.add(t); } } }
         */
        {
            list.addAll(list2);
            List<T> res = list.stream().distinct().collect(Collectors.toList());

            return res;
        }
    }

    // 差集
    public static <T> List<T> subractionExist(List<T> list, List<T> list2) {
        list.removeAll(list2);
        return list;
    }
}