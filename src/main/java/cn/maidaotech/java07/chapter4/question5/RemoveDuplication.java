package cn.maidaotech.java07.chapter4.question5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
//编写函数，去除List集合中的重复元素，不要改变元素的顺序
public class RemoveDuplication {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(4);
        list.add(1);
        System.out.println(list);
        Set<Integer> set = list.stream().collect(Collectors.toSet());
        System.out.println("去重之后："+set );
    
    }

}