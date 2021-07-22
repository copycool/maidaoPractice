package cn.maidaotech.java07.chapter04.test07_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EnglishSort {
    public static void main(String[] args) {
        String str = "The identifier of the encoding used to encode the bytes in value.";
        String[] str1 = str.split(" ");
        List<String> l = new ArrayList<>();
        for (String s : str1) {
            l.addAll(Arrays.asList(s));
            Collections.sort(l);

        }
        // System.out.println(l);
        // String english = "The identifier of the encoding used to encode the bytes in value.";
        // String[] str = english.split(" ");
        // List<String> list = Arrays.asList(str);
        // Collections.sort(list);
        // System.out.println(list);
    

    }
}
