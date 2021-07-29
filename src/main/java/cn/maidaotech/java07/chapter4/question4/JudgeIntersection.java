package cn.maidaotech.java07.chapter4.question4;

//如何判断两个集合是否有交集，并打印出他们的交集、并集和差集。
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JudgeIntersection {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);

        List<Integer> listIntersection = list1.stream().filter(item -> list2.contains(item))
                .collect(Collectors.toList());
        list1.retainAll(list2);
        System.out.println("交集" + listIntersection);

        List<Integer> list3 = list1.stream().collect(Collectors.toList());
        List<Integer> list4 = list2.stream().collect(Collectors.toList());
        list3.addAll(list4);
        Set<Integer> set = list3.stream().collect(Collectors.toSet());
        System.out.println("去重并集：" + set);

        // list2的差集
        List<Integer> listIntersection1 = list1.stream().filter(item -> !list2.contains(item))
                .collect(Collectors.toList());
        System.out.println(listIntersection1);

        // list1的差集
        List<Integer> listIntersection2 = list2.stream().filter(item -> !list1.contains(item))
                .collect(Collectors.toList());
        System.out.println(listIntersection2);
        /*
         * { list1 = initListA(); list2 = initListB(); list1.retainAll(list2);
         * System.out.println("交集：" + list1); } { list1 = initListA(); list2 =
         * initListB(); list1.removeAll(list2); list1.addAll(list2);
         * Collections.sort(list1); System.out.println("并集：" + list1); } { list1 =
         * initListA(); list2 = initListB(); list1.removeAll(list2);
         * System.out.println("差集：" + list1); }
         */

    }
}