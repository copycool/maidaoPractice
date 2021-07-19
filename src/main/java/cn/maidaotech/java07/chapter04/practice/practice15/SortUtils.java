package cn.maidaotech.java07.chapter04.practice.practice15;

import java.util.ArrayList;
import java.util.List;

public class SortUtils<T> {
    public static List<? extends Comparable<?>> sort(List<? extends Comparable<?>> list) {
        if (list == null)
            return null;
        return list;
    }

    public static void main(String[] args) {
        List<A> list = new ArrayList<>();
        list.add(new A());
        sort(list);
    }
}