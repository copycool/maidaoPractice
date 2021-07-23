package cn.maidaotech.java07.chapter04.Work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice07 {
   public static void main(String[] args) {
       String str = "The identifier of the encoding used to encode the bytes in value.";
       String[] strs = str.split(" ");
       List<String> strings = new ArrayList<>();
    //    for (String string : strs) {
    //        strings.add(string);
    //    }
       
       strings = Arrays.asList(strs);
       System.out.println("排序前"+strings);
        Collections.sort(strings);
        System.out.println("排序后"+strings);
       
       
   }
   
}
