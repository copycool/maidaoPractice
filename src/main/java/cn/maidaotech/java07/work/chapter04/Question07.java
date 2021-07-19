package cn.maidaotech.java07.work.chapter04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question07 {
    public static void main(String[] args) {
        String str = "The identifier of the encoding used a to encode the bytes in value";

        String[] splitStr = str.split(" ");

        List<String> list1 = Arrays.stream(splitStr).collect(Collectors.toList());
        System.out.println("排序前："+list1);

        List<String> collect = Arrays.stream(splitStr).sorted().collect(Collectors.toList());
        System.out.println("排序后："+collect );
    }
}