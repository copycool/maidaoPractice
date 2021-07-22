package cn.maidaotech.java07.order.forthpractice5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
// 编写函数，去除List集合中的重复元素，不要改变元素的顺序
// set去重操作：对重复元素去重，但打乱循序。
public class ListTest {
    public static void main(String[] args) {
    List<String> list1= new ArrayList<>();
              list1.addAll(Arrays.asList("1","3","2","3"));
             //    System.out.println(list1);
            LinkedList list2 = new LinkedList();
            //set集合去重，不打乱顺序
            // Set set = new HashSet();
            //  for(Integer cd:list1){
            //      if(set.add(cd)){
            //          list2.add(cd);
            //      }
            //     }
            //      System.out.println("去重后集合"+ list2); 
            // set去重
            // set.addAll(list1);
            // list2.addAll(set);
            // System.out.println(list2);
            for(String cd:list1){
                if(!list2.contains(cd)){
                    list2.add(cd);
                }
            }
             System.out.println(list2);
}
}