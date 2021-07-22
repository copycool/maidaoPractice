package cn.maidaotech.java07.forth.list05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//编写函数，去除 List 集合中的重复元素，不要改变元素的顺序
public class List05 {
   public static void main(String[] args) {
       List<String> list=new ArrayList<>();
       list.addAll(Arrays.asList("1","2","3","3","2"));
       System.out.println("去重前"+list);
       list = list.stream().distinct().collect(Collectors.toList());
       System.out.println("去重后"+list.toString());
   } 
}
