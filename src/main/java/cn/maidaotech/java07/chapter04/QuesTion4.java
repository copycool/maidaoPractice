package cn.maidaotech.java07.chapter04;
//如何判断两个集合是否有交集，并打印出他们的交集、并集和差集
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class QuesTion4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);

        //交集
        List<Integer> listIntersection = list.stream()
        .filter(item->list2.contains(item))
                                  .collect(Collectors.toList());
        System.out.println("交集："+listIntersection);

        //差集  list -list2
        List<Integer> reduce1 = list2.stream()
                                     .filter(item->!list2.contains(item))
                                     .collect(Collectors.toList());
        System.out.println("差集(list-list2)："+reduce1);

        //差集 list2 - list
        List<Integer> reduce2 = list2.stream()
                                     .filter(item->!list2.contains(item))
                                     .collect(Collectors.toList());
        System.out.println("差集(list2-list)："+reduce2);

        //并集
        List<Integer> list3 =list.stream().collect(Collectors.toList());
        List<Integer> list4 =list2.stream().collect(Collectors.toList());
        list3.addAll(list4);
        System.out.println("并集："+list3);

        //去重并集
        Set<Integer> set = list3.stream().collect(Collectors.toSet());
        System.out.println("去重并集："+set);

        //打印最初的list
        System.out.println("最初的list:"+list );
        //打印最初的list2
        System.out.println("最初的list2:"+list2);
    }
}
