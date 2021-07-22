package cn.maidaotech.java07.order.forthpractice3;
//创建一个集合存入 20 个 10 以内的整数，遍历集合，删除所有指定数字的元素。
import java.util.ArrayList;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Test {
    public static void main(String[] args) {
    ArrayList<Integer> list3 = new ArrayList<Integer>(20);
    for (int i = 0; i < 20; i++) {
                list3.add((int)(Math.random()*5));
            } 
            System.out.println(list3);
            list3.remove(8);
            System.out.println(list3);
    //     int size=list3.size();
    //   System.out.println(list3.size());
    //   System.out.println(list3);    
    
    for (int i = 0; i < list3.size(); i++) { 
        list3.get(i);
   System.out.println(list3.get(i));
   }
}  
}
