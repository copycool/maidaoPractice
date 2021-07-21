package cn.maidaotech.java07.chapter04;
// 编写程序分别测试对比 ArrayList 和 LinkedList 在添加、访问、删除元素时的性能。

// 提示：从集 合头部添加、删除元素，从集合尾部访问元素，请写出原因。

import java.util.ArrayList;

import java.util.Iterator;

import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedList {

    public static void ArrayList(Integer num) {
        long berfore = System.currentTimeMillis();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < num; i++) {
            list1.add(i);
        }
        long after = System.currentTimeMillis();
        System.out.println("ArrayList添加所用时间为：" + (after - berfore));

        long berfore1 = System.currentTimeMillis();
        Iterator<Integer> iterator = list1.iterator();
        while(iterator.hasNext()){
        iterator.next();
        iterator.remove();
        }
        long after1 = System.currentTimeMillis();
        System.out.println("ArrayList删除所用时间为：" + (after1 - berfore1));
    }

    public static void LinkedList(Integer num) {
        long berfore = System.currentTimeMillis();
        List<Integer> list1 = new LinkedList<Integer>();
        for (int i = 0; i<num; i++) {
            list1.add(i);        
        } 
        long after = System.currentTimeMillis();
        System.out.println("LinkedList添加所用时间为：" + (after - berfore));


        long berfore1 = System.currentTimeMillis();
        Iterator<Integer> iterator = list1.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        long after1 = System.currentTimeMillis();
        System.out.println("LinkedList删除所用时间为：" + (after1 - berfore1));
        
    }


    public static void main(String[] args) {
        ArrayListVSLinkedList.ArrayList(100000);
        ArrayListVSLinkedList.LinkedList(100000);
    }

}