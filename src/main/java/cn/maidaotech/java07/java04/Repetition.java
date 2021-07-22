package cn.maidaotech.java07.java04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Repetition {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("a");
        a.add("d");
        HashSet h = new HashSet(a);
        a.clear();
        a.addAll(h);
        System.out.println(a);
    }
}