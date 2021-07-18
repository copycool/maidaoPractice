package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Comparison {
    // 编写程序分别测试对比ArrayList和LinkedList在添加、访问、删除元素时的性能。
    // 提示：从集合头部添加、删除元素，从集合尾部访问元素，请写出原因。
    // 分析：
    // LinkedList在对进行添加和删除的操作中，耗费时间少于ArrayList,效率上有明显的优势。
    // ArrayList集合底层的数据结构是数组，所以对定向查找速度比较快
    // LinkedList集合底层数据结构是链表，链表结构的特点是增删改速度比较快。
    public static void main(String[] args) {

        // 以下为ArrayList的添加删除
        ArrayList<Integer> al = new ArrayList<>();
        long startTimeAddal = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            al.add(i);
        }
        long endTimeAddal = System.nanoTime();
        System.out.println("A添加1000个数据用时：" + (endTimeAddal - startTimeAddal) + "纳秒");

        long startTimeRemoveal = System.nanoTime();
        for (int i = 999; i >= 0; i--) {
            al.remove(i);
        }
        long endTimeRemoveal = System.nanoTime();
        System.out.println("A删除1000个数据用时：" + (endTimeRemoveal - startTimeRemoveal) + "纳秒");

        // 以下为LinkedList的添加删除
        LinkedList<Integer> ll = new LinkedList<>();
        long startTimeAddll = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            ll.add(i);
        }
        long endTimeAddll = System.nanoTime();
        System.out.println("L添加1000个数据用时：" + (endTimeAddll - startTimeAddll) + "纳秒");

        long startTimeRemovell = System.nanoTime();
        for (int i = 999; i >= 0; i--) {
            ll.remove(i);
        }
        System.out.println("L删除1000个数据用时：" + (endTimeAddll - startTimeAddll) + "纳秒");

    }

}