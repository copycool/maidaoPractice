package cn.maidaotech.java07.order.forthpractice2;

import java.awt.List;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
    Long stsrtTime = System.currentTimeMillis();
    LinkedList<String> list2 = new LinkedList<String>();
    list2.add ("快乐");
    list2.add("无趣");
    list2.add("刚刚");
    System.out.println(list2);
    // list2.remove();
    //  System.out.println(list2);
for (int i = 0; i < list2.size(); i++) {
    System.out.println(list2.get(i));
}
for (int i =list2.size()-1 ; i >=0; i--) {
    System.out.println(list2.get(i));
}
long endTime = System.currentTimeMillis();
System.out.println("程序运行时间="+(endTime-stsrtTime)+"ms");
    }
}
