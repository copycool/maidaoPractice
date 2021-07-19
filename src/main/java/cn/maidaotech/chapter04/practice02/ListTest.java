package cn.maidaotech.chapter04.practice02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/*
编写程序分别测试对比ArrayList和LinkedList在添加、访问、删除元素时的性能。
提示：从集合头部添加、删除元素，从集合尾部访问元素，请写出原因。

*/
public class ListTest {
    public static void main(String[] args) {
        ListTest l = new ListTest();
        l.ArrayListTest();
        l.LinkedList();
    }
    //ArrayList
    public void ArrayListTest() {
        Collection cool = new ArrayList<>();
        cool.add(123);
        cool.add(678);
        cool.add(new String("小明"));
        cool.add(new Student("张三",18));
        System.out.println(cool);
        cool.remove(123);
        System.out.println(cool);
        cool.remove(new Student("张三",18));
        System.out.println(cool);
        
        System.out.println(cool.size());

        
    }
    //LinkList
    public void LinkedList() {
        Collection cool = new LinkedList<>();
        cool.add(123);
        cool.add(456);
        cool.add(new String("Tom"));
        cool.add(new Student("Jerry",20));
        System.out.println(cool);
        cool.remove(123);
        System.out.println(cool);
        
        
    }
}