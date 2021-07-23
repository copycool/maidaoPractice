package cn.maidaotech.java07.chapter04.practice05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElements {
    public static void main(String[] args) {
        //1.创建集合
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("a","c","b","c","d","c"));
        //2.去重元素
        List<String> arrayList = new ArrayList<>();
        for (String string : list) {
            if(!arrayList.contains(string)){
                arrayList.add(string);
            }
            
        }//3.打印
        System.out.println(arrayList.toString());

        

    }
    
}