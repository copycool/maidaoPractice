package cn.maidaotech.java07.chapter04.testlist;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        Long time1 = System.currentTimeMillis();
        test();
        Long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
    }
    public static void test(){
        List<String> list = new LinkedList<>();
        
        list.add("小明");
        list.add("小红");
        list.add("小刚");
        list.add("小李");
        list.add("小胡");
        list.add("小马");
        list.set(0, "小白");
        list.remove(0);
        list.get(list.size()-1);
        for (String string : list) {
            System.out.println(string);
        }
       
    
    }
}
