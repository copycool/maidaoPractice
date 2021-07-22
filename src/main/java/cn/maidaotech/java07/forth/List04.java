package cn.maidaotech.java07.forth;


import java.util.ArrayList;

// 如何判断两个集合是否 有交集，并打印出他们的交集、并集和差集。
public class List04 {
    public static void main(String[] args) {
       ArrayList<String> list1=new ArrayList<>();
       list1.add("a");
       list1.add("b");
       list1.add("c"); 
       ArrayList<String> list2=new ArrayList<>();
       list2.add("b");
       list2.add("c");
       list2.add("d"); 
    {
       list1.retainAll(list2);
       System.out.println("交集是："+list1);
    }  
    {
        list1.removeAll(list2);
        System.out.println(list1);
    } 
    }
    
}
