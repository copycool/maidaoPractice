package cn.maidaotech.chapter04.example07;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EnglishWord {
    public static void main(String[] args) {
        String english = "The identifier of the encoding used to encode the bytes in value.";
        String[] str = english.split(" ");
        List<String> list = Arrays.asList(str);
        Collections.sort(list);
        System.out.println(list);
    }

}