package cn.maidaotech.java07.unit4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
       String a="The identifier of the encoding used to encode the bytes in value.";
       String [] strs=a.split(" ");
       List<String> list=Arrays.asList(strs);
       Collections.sort(list);
       System.out.println(list);

    }
}