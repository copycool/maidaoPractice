package cn.maidaotech.java07.forth.list;


import java.util.ArrayList;
import java.util.List;

// 如何判断两个集合是否 有交集，并打印出他们的交集、并集和差集。
 public class List04 {
//     private static final String Iterator = null;
//     private List<String> list1;

    public static void main( String[] args) { 
        List<String> list1 = new ArrayList<>();
       list1.add("a");
       list1.add("b");
       list1.add("c"); 
       List<String> list2=new ArrayList<>();
       list2.add("b");
       list2.add("c");
       list2.add("d"); 
    //  list1.retainAll(list2);
    //    System.out.println("交集是："+list1);
     
        // list1.removeAll(list2);
        // System.out.println("差集是："+list1);
        // }   
        list1.addAll(list2);
         System.out.println("并集是："+list1);
} 

}