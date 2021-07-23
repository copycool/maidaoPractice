package cn.maidaotech.java07.chapter04.practice07;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ScannerEnglish {
    public static void main(String[] args) {
        String english = "The identifier of the encoding used to encode the bytes in value.";
        String[] string = english.split(" ");
        List<String> list = Arrays.asList(string);
        Collections.sort(list);
        System.out.println(list);
    }
}