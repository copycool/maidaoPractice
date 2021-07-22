package cn.maidaotech.java07.set_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import cn.maidaotech.java07.util.ListUtils;

public class RemoveDuplicate {
    public static void main(String[] args) {

        List<Integer> list = ListUtils.randumNum(20, 10);

        {
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

        /**
         * 方式二(stream流)
         */
        {
            List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
            System.out.println(list2);
        }
    }
}