package cn.maidaotech.java07.chapter04;
//  编写函数，去除 List 集合中的重复元素，不要改变元素的顺序。

import java.util.ArrayList;
import java.util.List;

public class List05 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add("z" + i);
        }
        list.add("z2");
        list.add("z2");
        list.add("z2");
        list.add("z2");
        System.out.println(list);
        removeDuplicate(list);
        System.out.println(list);

    }

    public static List<String> removeDuplicate(List<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j).equals(list.get(i))) {
                    list.remove(j);
                }
            }

        }
        return list;
    }

}