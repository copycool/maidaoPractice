package cn.maidaotech.java07.forth;

import java.util.ArrayList;

// 编写程序分别测试对比 ArrayList 和 LinkedList 在添加、访问、删除元素时的性能。提示：从集 
// 合头部添加、删除元素，从集合尾部访问元素，请写出原因
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<String>();
        list.add("天");
        list.add("天");
        list.add("向");
        list.add("上");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
    
}
