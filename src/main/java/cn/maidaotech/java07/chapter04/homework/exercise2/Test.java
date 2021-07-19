package cn.maidaotech.java07.chapter04.homework.exercise2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    // 编写程序分别测试对比 ArrayList 和 LinkedList
    // 在添加、访问、删除元素时的性能。
    // 提示：从集合头部添加、删除元素，从集合尾部访问元素，请写出原因
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        List<String> linkedList = new LinkedList<String>();

        arrayList.add("语文");
        arrayList.add("数学");
        arrayList.add("英语");
        arrayList.add("物理");
        arrayList.add("化学");
        System.out.println(arrayList.toString());
        linkedList.add("语文");
        linkedList.add("数学");
        linkedList.add("英语");
        linkedList.add("物理");
        linkedList.add("化学");
        System.out.println(linkedList.toString());

        arrayList.add(0, "体育");
        System.out.println(arrayList.toString());
        ((LinkedList<String>) linkedList).addFirst("体育");
        System.out.println(linkedList.toString());

        arrayList.remove(0);
        System.out.println(arrayList.toString());
        ((LinkedList<String>) linkedList).removeFirst();
        System.out.println(linkedList.toString());

        System.out.println(arrayList.get(arrayList.size() - 1).toString());
        System.out.println(((LinkedList<String>) linkedList).getLast());

    }

    // public ArrayList headerAddElement(ArrayList arrayList,String element){
    // for(int i=arrayList.size();i>1;i--){
    // arrayList.get(i)
    // }
    // return arrayList;
    // }
}
