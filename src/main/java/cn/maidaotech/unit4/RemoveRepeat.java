package cn.maidaotech.java07.unit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveRepeat {
    //删除重复
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 6, 8, 9, 5, 6, 4, 2, 1, 3);
        System.out.println("删除前的集合："+a);
        LinkedHashSet<Integer> b=new LinkedHashSet<>(a);
        ArrayList<Integer> c=new ArrayList<>(b);
        System.out.println("删除后的集合："+c);

    }
}