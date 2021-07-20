package cn.maidaotech.chapter04.practice07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
将如下英文其中的单词按照字母排序后打印输出。
The identifier of the encoding used to encode the bytes in value.
*/
public class English {
    public static void main(String[] args) {
         String str = "The identifier of the encoding used to encode the bytes in value";
         String[] newStr = str.split(" ");//按空格把Str分成数组
         List<String> list1 = Arrays.stream(newStr).collect(Collectors.toList());
         System.out.println(list1);

         List<String> list2 = Arrays.stream(newStr).sorted().collect(Collectors.toList());
         System.out.println(list2);
    }
    
     
}