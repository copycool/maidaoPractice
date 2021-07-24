package cn.maidaotech.java07.chapter04;
//编写函数，去除List集合中的重复元素，不要改变元素的顺序
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class QuesTion5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        System.out.println("去重之前："+list);
        duplicatRemoval(list);

    }

    public static void duplicatRemoval(List<Integer> list) {
        Set<Integer> set = list.stream().collect(Collectors.toSet());
        System.out.println("去重之后："+set );
    }
    
}
