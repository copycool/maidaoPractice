package cn.maidaotech.java07.chapter04;
//编写函数，去除 List 集合中的重复元素，
//不要改变元素的顺序
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
public class RemoveSame {
    public static void main(String[] args) {
    List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 6, 8, 9, 5, 6, 4, 2, 1, 3);
    //1.使用LinkedHashSet删除arraylist中的重复数据
    //Arrays.asList将数组转化为list,用于初始化时设置值,简化代码,省去add的部分
    System.out.println("使用LinkedHashSet删除arraylist中的重复数据进行去重：");
    System.out.println("原数据"+list1);

    LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(list1);
    ArrayList<Integer> arrayList = new ArrayList<>(linkedHashSet);
    System.out.println("去重后："+arrayList);
    //2.使用java8新特性stream进行List去重
    System.out.println("=========================");

    System.out.println("利用java8新特性stream进行List去重");
    List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 6, 8, 9, 5, 6, 4, 2, 1, 3);
    System.out.println("原数据"+list2);

    List<Integer> integerList = list2.stream().distinct().collect(Collectors.toList());

    System.out.println("去重后"+integerList);
    }
}